/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package View;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Design.Farben;
import Design.Schrift;

public class Shortcut extends JPanel {

	/**
	 * Create the panel.
	 */
	public Shortcut(String name, String icon) {
		setLayout(new BorderLayout(0, 0));
		setBackground(Farben.getDefaultBackgroundcolor());
		setBorder(new EmptyBorder(5, 5, 5, 5));
		setSize(80, 80);
		
		JLabel iconLabel = new JLabel(icon);
		iconLabel.setHorizontalAlignment(SwingConstants.CENTER);
		iconLabel.setFont(Schrift.ICON);
		iconLabel.setForeground(Farben.getDefaultFontcolor());
		add(iconLabel, BorderLayout.CENTER);
		
		JLabel nameLabel = new JLabel(name);
		nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		iconLabel.setFont(Schrift.ICON);
		iconLabel.setForeground(Farben.getDefaultFontcolor());
		add(nameLabel, BorderLayout.SOUTH);
	}
}
