/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

import data.Shortcut;
import design.Farben;
import design.Rahmen;
import design.Schrift;

public class ShortcutPanel extends JPanel implements ListCellRenderer {
	
	private static final long serialVersionUID = 1L;

	private JLabel title;
	private JLabel lbImage;

	public ShortcutPanel() {
		setOpaque(true);

		this.setLayout(new BorderLayout());
		this.setBorder(Rahmen.roundedBorder);

		title = new JLabel();
		title.setFont(Schrift.FETT);
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBackground(Farben.getDefaultBackgroundcolor());
		title.setForeground(Farben.getDefaultFontcolor());
		this.add(title, BorderLayout.SOUTH);

		lbImage = new JLabel();
		lbImage.setHorizontalAlignment(SwingConstants.CENTER);
		lbImage.setBorder(null);
		
		this.add(lbImage, BorderLayout.CENTER);

		this.setPreferredSize(new Dimension(70, 52));
	}

	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

		Shortcut shorcut = (Shortcut) value;
		title.setText(shorcut.getText());

		lbImage.setIcon(new ImageIcon(shorcut.getImage()));
		lbImage.setBorder(new LineBorder(Color.red));

		if (isSelected) {
			this.setBackground(list.getSelectionBackground());
			this.setForeground(list.getSelectionForeground());
		} else {
			this.setBackground(list.getBackground());
			this.setForeground(list.getForeground());
		}
		return this;
	}
}