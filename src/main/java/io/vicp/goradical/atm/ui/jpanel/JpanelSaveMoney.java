/*
 * Created by JFormDesigner on Tue Dec 06 09:53:57 CST 2016
 */

package io.vicp.goradical.atm.ui.jpanel;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author Kenny
 */
public class JpanelSaveMoney extends JPanel {
	public JpanelSaveMoney() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		jlbAccount = new JLabel();
		comboBox1 = new JComboBox();
		jbtSaveMoney = new JButton();

		//======== this ========
		setName("this"); //NON-NLS

		//---- jlbAccount ----
		jlbAccount.setText("\u94f6\u884c\u5361"); //NON-NLS
		jlbAccount.setName("jlbAccount"); //NON-NLS

		//---- comboBox1 ----
		comboBox1.setName("comboBox1"); //NON-NLS

		//---- jbtSaveMoney ----
		jbtSaveMoney.setText("\u5b58\u94b1"); //NON-NLS
		jbtSaveMoney.setName("jbtSaveMoney"); //NON-NLS

		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addGap(49, 49, 49)
					.addComponent(jlbAccount, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)
					.addGap(33, 33, 33)
					.addComponent(jbtSaveMoney, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup()
						.addGroup(layout.createSequentialGroup()
							.addGap(126, 126, 126)
							.addGroup(layout.createParallelGroup()
								.addComponent(jlbAccount)
								.addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup()
							.addGap(118, 118, 118)
							.addComponent(jbtSaveMoney)))
					.addContainerGap(217, Short.MAX_VALUE))
		);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel jlbAccount;
	private JComboBox comboBox1;
	private JButton jbtSaveMoney;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
