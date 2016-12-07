/*
 * Created by JFormDesigner on Tue Dec 06 10:13:54 CST 2016
 */

package io.vicp.goradical.atm.ui.jpanel;

import javax.swing.*;
import java.awt.*;

/**
 * @author Kenny
 */
public class JpanelATM extends JPanel {
	public JpanelATM() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		jpanelNavigation = new JpanelNavigation();
		jpanelDrawMoney = new JpanelDrawMoney();
		jpanelUserInfo = new JpanelUserInfo();

		//======== this ========
		setName("this"); //NON-NLS

		//---- jpanelNavigation ----
		jpanelNavigation.setBackground(new Color(0, 204, 204));
		jpanelNavigation.setName("jpanelNavigation"); //NON-NLS

		//---- jpanelDrawMoney ----
		jpanelDrawMoney.setBackground(new Color(0, 102, 255));
		jpanelDrawMoney.setName("jpanelDrawMoney"); //NON-NLS

		//---- jpanelUserInfo ----
		jpanelUserInfo.setName("jpanelUserInfo"); //NON-NLS

		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup()
				.addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(jpanelNavigation, GroupLayout.PREFERRED_SIZE, 208, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jpanelUserInfo, GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
					.addComponent(jpanelDrawMoney, GroupLayout.PREFERRED_SIZE, 424, GroupLayout.PREFERRED_SIZE)
					.addGap(81, 81, 81))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup()
						.addGroup(layout.createSequentialGroup()
							.addGap(24, 24, 24)
							.addGroup(layout.createParallelGroup()
								.addComponent(jpanelNavigation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jpanelDrawMoney, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)))
						.addGroup(layout.createSequentialGroup()
							.addContainerGap()
							.addComponent(jpanelUserInfo, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
		jpanelDrawMoney.setVisible(false);
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JpanelNavigation jpanelNavigation;
	private JpanelDrawMoney jpanelDrawMoney;
	private JpanelUserInfo jpanelUserInfo;
	// JFormDesigner - End of variables declaration  //GEN-END:variables


	public JpanelNavigation getJpanelNavigation() {
		return jpanelNavigation;
	}

	public void setJpanelNavigation(JpanelNavigation jpanelNavigation) {
		this.jpanelNavigation = jpanelNavigation;
	}

	public JpanelDrawMoney getJpanelDrawMoney() {
		return jpanelDrawMoney;
	}

	public void setJpanelDrawMoney(JpanelDrawMoney jpanelDrawMoney) {
		this.jpanelDrawMoney = jpanelDrawMoney;
	}

	public JpanelUserInfo getJpanelUserInfo() {
		return jpanelUserInfo;
	}

	public void setJpanelUserInfo(JpanelUserInfo jpanelUserInfo) {
		this.jpanelUserInfo = jpanelUserInfo;
	}
}
