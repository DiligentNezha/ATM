package io.vicp.goradical.atm.main;

import io.vicp.goradical.atm.ui.jframe.JFrameATM;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		new JFrameATM();
	}
}
