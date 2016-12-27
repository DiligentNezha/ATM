package io.vicp.goradical.atm.ui.other;

import javax.swing.*;
import java.awt.*;

public class MyPane extends JPanel {
	public MyPane(){
		setBackground(Color.BLACK);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillOval(800, 100, 100, 100);
		g.setColor(Color.BLACK);
		g.fillOval(770, 100, 100, 100);
	}
}
