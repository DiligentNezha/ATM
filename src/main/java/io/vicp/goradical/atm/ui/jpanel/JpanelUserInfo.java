/*
 * Created by JFormDesigner on Tue Dec 06 09:53:34 CST 2016
 */

package io.vicp.goradical.atm.ui.jpanel;

import io.vicp.goradical.atm.ui.customeCompontent.CustomButtonEditor;
import io.vicp.goradical.atm.ui.customeCompontent.CustomButtonRender;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author Kenny
 */
public class JpanelUserInfo extends JPanel {
	public JpanelUserInfo() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		jlbUseName = new JLabel();
		scrollPane1 = new JScrollPane();
		jtbAccount = new JTable();

		//======== this ========
		setName("this"); //NON-NLS

		//---- jlbUseName ----
		jlbUseName.setText("useName"); //NON-NLS
		jlbUseName.setName("jlbUseName"); //NON-NLS

		//======== scrollPane1 ========
		{
			scrollPane1.setName("scrollPane1"); //NON-NLS

			//---- jtbAccount ----
			jtbAccount.setName("jtbAccount"); //NON-NLS
			scrollPane1.setViewportView(jtbAccount);
		}

		GroupLayout layout = new GroupLayout(this);
		setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup()
						.addGroup(layout.createSequentialGroup()
							.addGap(70, 70, 70)
							.addComponent(jlbUseName, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup()
							.addGap(16, 16, 16)
							.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 371, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(57, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup()
				.addGroup(layout.createSequentialGroup()
					.addGap(38, 38, 38)
					.addComponent(jlbUseName, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
					.addGap(54, 54, 54)
					.addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 163, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(77, Short.MAX_VALUE))
		);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel jlbUseName;
	private JScrollPane scrollPane1;
	private JTable jtbAccount;
	// JFormDesigner - End of variables declaration  //GEN-END:variables

	private DefaultTableModel tableModel = new DefaultTableModel();


	public void fillTable(Object[][] tableData){
		for(int i = 0; i < tableData.length; i++) {
			tableModel.addRow(tableData[i]);
		}
	}

	public void addViewRecord(){
		tableModel.addColumn("viewRecord");
		jtbAccount.setRowSelectionAllowed(false);
		int rowCount = tableModel.getRowCount();
		for (int i = 0; i < rowCount; i++) {
			jtbAccount.getColumnModel().getColumn(rowCount + 1).setCellEditor(new CustomButtonEditor());
			jtbAccount.getColumnModel().getColumn(rowCount + 1).setCellRenderer(new CustomButtonRender());
		}
	}

	public void fillColumnsName(String[] names) {
		for (int i = 0; i < names.length; i++) {
			tableModel.addColumn(names[i]);
		}
	}

	public JLabel getJlbUseName() {
		return jlbUseName;
	}

	public void setJlbUseName(JLabel jlbUseName) {
		this.jlbUseName = jlbUseName;
	}

	public JScrollPane getScrollPane1() {
		return scrollPane1;
	}

	public void setScrollPane1(JScrollPane scrollPane1) {
		this.scrollPane1 = scrollPane1;
	}

	public JTable getJtbAccount() {
		return jtbAccount;
	}

	public void setJtbAccount(JTable jtbAccount) {
		this.jtbAccount = jtbAccount;
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
	}
}
