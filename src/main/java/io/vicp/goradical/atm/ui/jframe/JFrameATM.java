/*
 * Created by JFormDesigner on Sat Nov 26 17:15:49 CST 2016
 */

package io.vicp.goradical.atm.ui.jframe;

import io.vicp.goradical.atm.dao.DaoManager;
import io.vicp.goradical.atm.dao.UserDao;
import io.vicp.goradical.atm.model.User;
import io.vicp.goradical.atm.service.UserService;
import io.vicp.goradical.atm.ui.jpanel.JpanelNavigation;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Kenny
 */
public class JFrameATM extends JFrame {
	private UserService userService;

	public JFrameATM() {
		userService = new UserService(DaoManager.getDao(UserDao.class));
		initComponents();
	}

	void button1MouseClicked(MouseEvent e) {
		login();
	}

	void jbtLoginKeyPressed(KeyEvent e) {
		login();
	}

	private void login(){
		User user = userService.login(jtfIdentityCard.getText(), jpfPassword.getText());
		if (user != null) {
			JOptionPane.showMessageDialog(this, "登陆成功!");
			jifLogin.setVisible(false);
			jpanelNavigation1.setVisible(true);
		} else {
			JOptionPane.showMessageDialog(this, "请输入正确的账号和密码!");
		}
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		jifLogin = new JInternalFrame();
		label1 = new JLabel();
		label2 = new JLabel();
		jtfIdentityCard = new JTextField();
		jpfPassword = new JPasswordField();
		jbtLogin = new JButton();
		jbtCancel = new JButton();
		jpanelNavigation1 = new JpanelNavigation();

		//======== this ========
		setBackground(new Color(153, 255, 204));
		setName("this"); //NON-NLS
		Container contentPane = getContentPane();

		//======== jifLogin ========
		{
			jifLogin.setVisible(true);
			jifLogin.setBackground(new Color(214, 236, 196));
			jifLogin.setName("jifLogin"); //NON-NLS
			Container jifLoginContentPane = jifLogin.getContentPane();

			//---- label1 ----
			label1.setText("\u8eab\u4efd\u8bc1:"); //NON-NLS
			label1.setName("label1"); //NON-NLS

			//---- label2 ----
			label2.setText("\u5bc6\u7801:"); //NON-NLS
			label2.setName("label2"); //NON-NLS

			//---- jtfIdentityCard ----
			jtfIdentityCard.setName("jtfIdentityCard"); //NON-NLS

			//---- jpfPassword ----
			jpfPassword.setName("jpfPassword"); //NON-NLS

			//---- jbtLogin ----
			jbtLogin.setText("\u767b\u5f55"); //NON-NLS
			jbtLogin.setName("jbtLogin"); //NON-NLS
			jbtLogin.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					button1MouseClicked(e);
				}
			});
			jbtLogin.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					jbtLoginKeyPressed(e);
				}
			});

			//---- jbtCancel ----
			jbtCancel.setText("\u53d6\u6d88"); //NON-NLS
			jbtCancel.setName("jbtCancel"); //NON-NLS

			GroupLayout jifLoginContentPaneLayout = new GroupLayout(jifLoginContentPane);
			jifLoginContentPane.setLayout(jifLoginContentPaneLayout);
			jifLoginContentPaneLayout.setHorizontalGroup(
				jifLoginContentPaneLayout.createParallelGroup()
					.addGroup(jifLoginContentPaneLayout.createParallelGroup()
						.addGroup(jifLoginContentPaneLayout.createSequentialGroup()
							.addGap(0, 81, Short.MAX_VALUE)
							.addGroup(jifLoginContentPaneLayout.createParallelGroup()
								.addGroup(jifLoginContentPaneLayout.createSequentialGroup()
									.addComponent(label1, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(jtfIdentityCard, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
								.addGroup(jifLoginContentPaneLayout.createSequentialGroup()
									.addComponent(label2, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
									.addGap(18, 18, 18)
									.addComponent(jpfPassword, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE))
								.addGroup(jifLoginContentPaneLayout.createSequentialGroup()
									.addGap(28, 28, 28)
									.addComponent(jbtLogin, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
									.addGap(34, 34, 34)
									.addComponent(jbtCancel, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)))
							.addGap(0, 82, Short.MAX_VALUE)))
					.addGap(0, 404, Short.MAX_VALUE)
			);
			jifLoginContentPaneLayout.setVerticalGroup(
				jifLoginContentPaneLayout.createParallelGroup()
					.addGroup(jifLoginContentPaneLayout.createParallelGroup()
						.addGroup(jifLoginContentPaneLayout.createSequentialGroup()
							.addGap(0, 58, Short.MAX_VALUE)
							.addGroup(jifLoginContentPaneLayout.createParallelGroup()
								.addComponent(label1, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
								.addComponent(jtfIdentityCard, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(12, 12, 12)
							.addGroup(jifLoginContentPaneLayout.createParallelGroup()
								.addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
								.addGroup(jifLoginContentPaneLayout.createSequentialGroup()
									.addGap(2, 2, 2)
									.addComponent(jpfPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(29, 29, 29)
							.addGroup(jifLoginContentPaneLayout.createParallelGroup()
								.addComponent(jbtLogin)
								.addComponent(jbtCancel))
							.addGap(0, 59, Short.MAX_VALUE)))
					.addGap(0, 267, Short.MAX_VALUE)
			);
		}

		//---- jpanelNavigation1 ----
		jpanelNavigation1.setBackground(new Color(0, 204, 204));
		jpanelNavigation1.setBorder(new LineBorder(Color.cyan, 4));
		jpanelNavigation1.setName("jpanelNavigation1"); //NON-NLS

		GroupLayout contentPaneLayout = new GroupLayout(contentPane);
		contentPane.setLayout(contentPaneLayout);
		contentPaneLayout.setHorizontalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGap(35, 35, 35)
					.addComponent(jpanelNavigation1, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
					.addComponent(jifLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(139, 139, 139))
		);
		contentPaneLayout.setVerticalGroup(
			contentPaneLayout.createParallelGroup()
				.addGroup(contentPaneLayout.createSequentialGroup()
					.addGroup(contentPaneLayout.createParallelGroup()
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(55, 55, 55)
							.addComponent(jpanelNavigation1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(contentPaneLayout.createSequentialGroup()
							.addGap(86, 86, 86)
							.addComponent(jifLogin, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(159, Short.MAX_VALUE))
		);
		setSize(710, 509);
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
		jpanelNavigation1.setVisible(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JInternalFrame jifLogin;
	private JLabel label1;
	private JLabel label2;
	private JTextField jtfIdentityCard;
	private JPasswordField jpfPassword;
	private JButton jbtLogin;
	private JButton jbtCancel;
	private JpanelNavigation jpanelNavigation1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
