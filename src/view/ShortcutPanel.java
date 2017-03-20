/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;
import javax.swing.border.LineBorder;

import data.Shortcut;

public class ShortcutPanel extends JPanel implements ListCellRenderer {
	
	private static final long serialVersionUID = 1L;

	private JLabel title;
	private JLabel lbImage;

	public ShortcutPanel() {
		setOpaque(true);

		this.setLayout(null);

		title = new JLabel();
		title.setBounds(70, 2, 200, 28);
		this.add(title);

		lbImage = new JLabel();
		lbImage.setBounds(2, 2, 64, 48);
		this.add(lbImage);

		this.setSize(200, 52);
		this.setPreferredSize(new Dimension(200, 52));
	}

	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {

		Shortcut shorcut = (Shortcut) value;
		title.setText(shorcut.getName());

		lbImage.setIcon(new ImageIcon(getClass().getResource(shorcut.getImage())));
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