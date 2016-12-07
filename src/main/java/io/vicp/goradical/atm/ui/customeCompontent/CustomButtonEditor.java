package io.vicp.goradical.atm.ui.customeCompontent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomButtonEditor extends DefaultCellEditor {

	private JButton jButton;

	public CustomButtonEditor() {
		super(new JTextField());
		setClickCountToStart(1);

		initButton();
	}

	private void initButton(){
		jButton = new JButton("viewRecord");

		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fireEditingCanceled();
				System.out.println("行为");
			}
		});
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		jButton.setText(value == null ? "" : String.valueOf(value));
		return jButton;
	}

	@Override
	public Object getCellEditorValue() {
		return jButton.getText();
	}

}
