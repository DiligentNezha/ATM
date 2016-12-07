/*
 * Created by JFormDesigner on Tue Dec 06 09:54:14 CST 2016
 */

package io.vicp.goradical.atm.ui.jpanel;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.LayoutStyle;

/**
 * @author Kenny
 */
public class JpanelDrawMoney extends JPanel {
	public JpanelDrawMoney() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		jbt100yuan = new JButton();
		jbt200yuan = new JButton();
		jbt500yuan = new JButton();
		jbt1000yuan = new JButton();
		jbt2000yuan = new JButton();
		button5 = new JButton();

		//======== this ========
		setName("this"); //NON-NLS

		//---- jbt100yuan ----
		jbt100yuan.setText("100"); //NON-NLS
		jbt100yuan.setName("jbt100yuan"); //NON-NLS

		//---- jbt200yuan ----
		jbt200yuan.setText("200"); //NON-NLS
		jbt200yuan.setName("jbt200yuan"); //NON-NLS

		//---- jbt500yuan ----
		jbt500yuan.setText("500"); //NON-NLS
		jbt500yuan.setName("jbt500yuan"); //NON-NLS

		//---- jbt1000yuan ----
		jbt1000yuan.setText("1000"); //NON-NLS
		jbt1000yuan.setName("jbt1000yuan"); //NON-NLS

		//---- jbt2000yuan ----
		jbt2000yuan.setText("2000"); //NON-NLS
		jbt2000yuan.setName("jbt2000yuan"); //NON-NLS

		//---- button5 ----
		button5.setText("\u8f93\u5165\u91d1\u989d"); //NON-NLS
		button5.setName("button5"); //NON-NLS

		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addGap(54, 54, 54)
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
						.addComponent(jbt200yuan, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
						.addComponent(jbt100yuan, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
						.addComponent(jbt500yuan, GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
					.addGroup(layout.createParallelGroup()
						.addComponent(jbt1000yuan, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(jbt2000yuan, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
						.addComponent(button5, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
					.addGap(89, 89, 89))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addGap(57, 57, 57)
					.addGroup(layout.createParallelGroup()
						.addGroup(layout.createSequentialGroup()
							.addComponent(jbt1000yuan)
							.addGap(45, 45, 45)
							.addComponent(jbt2000yuan)
							.addGap(64, 64, 64)
							.addComponent(button5))
						.addGroup(layout.createSequentialGroup()
							.addComponent(jbt100yuan)
							.addGap(45, 45, 45)
							.addComponent(jbt200yuan)
							.addGap(64, 64, 64)
							.addComponent(jbt500yuan)))
					.addContainerGap(89, Short.MAX_VALUE))
		);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JButton jbt100yuan;
	private JButton jbt200yuan;
	private JButton jbt500yuan;
	private JButton jbt1000yuan;
	private JButton jbt2000yuan;
	private JButton button5;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
