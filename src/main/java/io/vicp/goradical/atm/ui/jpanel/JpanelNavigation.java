/*
 * Created by JFormDesigner on Sat Nov 26 17:06:33 CST 2016
 */

package io.vicp.goradical.atm.ui.jpanel;

import javax.swing.*;

/**
 * @author Kenny
 */
public class JpanelNavigation extends JPanel {
	public JpanelNavigation() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		jbtQuery = new JButton();
		jbtSaveMoney = new JButton();
		jbtDrawMoney = new JButton();
		jbtExit = new JButton();

		//======== this ========
		setName("this"); //NON-NLS

		//---- jbtQuery ----
		jbtQuery.setText("\u67e5\u8be2"); //NON-NLS
		jbtQuery.setName("jbtQuery"); //NON-NLS

		//---- jbtSaveMoney ----
		jbtSaveMoney.setText("\u5b58\u94b1"); //NON-NLS
		jbtSaveMoney.setName("jbtSaveMoney"); //NON-NLS

		//---- jbtDrawMoney ----
		jbtDrawMoney.setText("\u53d6\u94b1"); //NON-NLS
		jbtDrawMoney.setName("jbtDrawMoney"); //NON-NLS

		//---- jbtExit ----
		jbtExit.setText("\u9000\u51fa"); //NON-NLS
		jbtExit.setName("jbtExit"); //NON-NLS

		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createParallelGroup()
					.addGroup(layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup()
							.addComponent(jbtQuery, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addComponent(jbtSaveMoney, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addComponent(jbtDrawMoney, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
							.addComponent(jbtExit, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
						.addGap(0, 0, Short.MAX_VALUE)))
				.addGap(0, 264, Short.MAX_VALUE)
		);
		layout.setVerticalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createParallelGroup()
					.addGroup(layout.createSequentialGroup()
						.addGap(0, 0, Short.MAX_VALUE)
						.addComponent(jbtQuery)
						.addGap(46, 46, 46)
						.addComponent(jbtSaveMoney)
						.addGap(48, 48, 48)
						.addComponent(jbtDrawMoney)
						.addGap(55, 55, 55)
						.addComponent(jbtExit)
						.addGap(0, 0, Short.MAX_VALUE)))
				.addGap(0, 375, Short.MAX_VALUE)
		);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JButton jbtQuery;
	private JButton jbtSaveMoney;
	private JButton jbtDrawMoney;
	private JButton jbtExit;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
