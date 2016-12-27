package io.vicp.goradical.atm.ui.other;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Star extends JFrame {
	public static Dimension dd = Toolkit.getDefaultToolkit().getScreenSize();

	public static void main(String[] args) {
		new Star();
	}

	public Star(){
		setContentPane(new MyPane());
		setSize(dd.width, dd.height);
		setUndecorated(true);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}
}
