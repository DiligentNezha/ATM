package io.vicp.goradical.atm.ui.customeCompontent;

import javax.swing.*;
import javax.swing.table.TableCellRenderer;
import java.awt.*;

public class CustomButtonRender implements TableCellRenderer{

	private JButton jButton;

	public CustomButtonRender(){
		initButton();
	}

	private void initButton(){
		this.jButton = new JButton("viewRecord");
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
//		jButton.setText(value == null ? "" : String.valueOf(value));
		jButton.setText("viewRecord");
		return jButton;
	}
}
