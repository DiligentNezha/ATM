/*
 * Created by JFormDesigner on Tue Dec 06 09:53:16 CST 2016
 */

package io.vicp.goradical.atm.ui.jpanel;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author Kenny
 */
public class JpanelRecord extends JPanel {
	public JpanelRecord() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		scrollPane1 = new JScrollPane();
		jtbRecord = new JTable();
		jbtPrev = new JButton();
		jbtNext = new JButton();

		//======== this ========
		setName("this"); //NON-NLS

		//======== scrollPane1 ========
		{
			scrollPane1.setName("scrollPane1"); //NON-NLS

			//---- jtbRecord ----
			jtbRecord.setName("jtbRecord"); //NON-NLS
			scrollPane1.setViewportView(jtbRecord);
		}

		//---- jbtPrev ----
		jbtPrev.setText("\u4e0a\u4e00\u9875"); //NON-NLS
		jbtPrev.setName("jbtPrev"); //NON-NLS

		//---- jbtNext ----
		jbtNext.setText("\u4e0b\u4e00\u9875"); //NON-NLS
		jbtNext.setName("jbtNext"); //NON-NLS

		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
					.addContainerGap())
				.addGroup(layout.createSequentialGroup()
					.addGap(134, 134, 134)
					.addComponent(jbtPrev)
					.addGap(51, 51, 51)
					.addComponent(jbtNext)
					.addContainerGap(165, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addGap(18, 18, 18)
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(jbtPrev)
						.addComponent(jbtNext))
					.addContainerGap(11, Short.MAX_VALUE))
		);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JScrollPane scrollPane1;
	private JTable jtbRecord;
	private JButton jbtPrev;
	private JButton jbtNext;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
