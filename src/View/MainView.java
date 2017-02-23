/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package View;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import Design.Farben;
import Design.Rahmen;
import Design.Schrift;

public class MainView extends JPanel {

	private JPanel mainPanel, shortcutsPanel, manageShortcutPanel, titelPanel, dayliBudgetPanel, erfassungsPanel, uebersichtPanel, monthPanel; 
	private JButton removeShortcutButton, addShortcutButton, menuButton, plusButton, minusButton;
	private JLabel Titel, dayliBudgetBalken, dayliBudgetLabel, monthBudgetLabel, kreisdiagrammLabel;
	private JList shortcutlist; 
	
	/**
	 * Create the panel.
	 */
	public MainView() {
		
		setBackground(Farben.getDefaultBackgroundcolor());
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BorderLayout(0, 0));
		
		shortcutsPanel = new JPanel();
		add(shortcutsPanel, BorderLayout.EAST);
		shortcutsPanel.setBackground(Color.cyan);
		shortcutsPanel.setLayout(new BorderLayout(0, 0));
		
		manageShortcutPanel = new JPanel();
		shortcutsPanel.add(manageShortcutPanel, BorderLayout.SOUTH);
		manageShortcutPanel.setBackground(Farben.getDefaultBackgroundcolor());
		manageShortcutPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		removeShortcutButton = new JButton("-");
		removeShortcutButton.setFont(Schrift.FETT);
		removeShortcutButton.setForeground(Farben.getDefaultFontcolor());
		removeShortcutButton.setBackground(Farben.getDefaultBackgroundcolor());
		removeShortcutButton.setBorder(Rahmen.defaultBorder);
		manageShortcutPanel.add(removeShortcutButton);
		
		addShortcutButton = new JButton("+");
		addShortcutButton.setFont(Schrift.FETT);
		addShortcutButton.setForeground(Farben.getDefaultFontcolor());
		addShortcutButton.setBackground(Farben.getDefaultBackgroundcolor());
		addShortcutButton.setBorder(Rahmen.defaultBorder);
		manageShortcutPanel.add(addShortcutButton);
		
		shortcutlist = new JList();
		JScrollPane scrollPane = new JScrollPane();
		shortcutlist.setBackground(Farben.getDefaultBackgroundcolor());
		shortcutlist.setBorder(Rahmen.defaultBorder);
		shortcutsPanel.add(scrollPane.add(shortcutlist), BorderLayout.CENTER);
		
		titelPanel = new JPanel();
		add(titelPanel, BorderLayout.NORTH);
		titelPanel.setLayout(new BorderLayout());
		titelPanel.setBackground(Farben.getDefaultBackgroundcolor());
		titelPanel.setForeground(Farben.getDefaultFontcolor());
		
		Titel = new JLabel("Übersicht");
		Titel.setFont(Schrift.TITEL);
		Titel.setHorizontalAlignment(SwingConstants.CENTER);
		Titel.setBackground(Farben.getDefaultBackgroundcolor());
		Titel.setForeground(Farben.getDefaultFontcolor());
		titelPanel.add(Titel, BorderLayout.CENTER);
		
		menuButton = new JButton("");
		menuButton.setBackground(UIManager.getColor("Button.disabledShadow"));
		menuButton.setIcon(new ImageIcon("pic/menu.png"));
		menuButton.setBorder(null);
		menuButton.setHorizontalAlignment(SwingConstants.RIGHT);
		menuButton.setForeground(Farben.getDefaultFontcolor());
		titelPanel.add(menuButton, BorderLayout.WEST);
		
		dayliBudgetPanel = new JPanel();
		add(dayliBudgetPanel, BorderLayout.SOUTH);
		dayliBudgetPanel.setBackground(Farben.getDefaultBackgroundcolor());
		dayliBudgetPanel.setLayout(new BorderLayout(0, 0));
		
		dayliBudgetBalken = new JLabel("Balken");
		dayliBudgetPanel.add(dayliBudgetBalken, BorderLayout.CENTER);
		dayliBudgetBalken.setHorizontalAlignment(SwingConstants.CENTER);
		dayliBudgetBalken.setForeground(Farben.getDefaultFontcolor());
		
		dayliBudgetLabel = new JLabel("Heute verfägbar");
		dayliBudgetPanel.add(dayliBudgetLabel, BorderLayout.NORTH);
		dayliBudgetLabel.setFont(Schrift.UBERSCHRIFT);
		dayliBudgetLabel.setForeground(Farben.getDefaultFontcolor());
		dayliBudgetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		monthPanel = new JPanel();
		add(monthPanel, BorderLayout.CENTER);
		monthPanel.setBackground(Farben.getDefaultBackgroundcolor());
		monthPanel.setLayout(new BorderLayout(0, 0));
		
		monthBudgetLabel = new JLabel("Restbetrag");
		monthBudgetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		monthBudgetLabel.setFont(Schrift.STANDART);
		monthBudgetLabel.setForeground(Farben.getDefaultFontcolor());
		monthPanel.add(monthBudgetLabel, BorderLayout.SOUTH);
		
		uebersichtPanel = new JPanel();
		uebersichtPanel.setBackground(Farben.getDefaultBackgroundcolor());
		monthPanel.add(uebersichtPanel, BorderLayout.CENTER);
		uebersichtPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
		uebersichtPanel.setLayout(new BorderLayout(0, 0));
		
		kreisdiagrammLabel = new JLabel("Kreisdiagramm");
		uebersichtPanel.add(kreisdiagrammLabel);
		kreisdiagrammLabel.setHorizontalAlignment(SwingConstants.CENTER);
		kreisdiagrammLabel.setForeground(Farben.getDefaultFontcolor());
		
		erfassungsPanel = new JPanel();
		uebersichtPanel.add(erfassungsPanel, BorderLayout.NORTH);
		erfassungsPanel.setBackground(Farben.getDefaultBackgroundcolor());
		erfassungsPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		plusButton = new JButton("");
		plusButton.setIcon(new ImageIcon("pic/plus.png"));
		plusButton.setBackground(Farben.getDefaultBackgroundcolor());
		plusButton.setBorder(null);
		erfassungsPanel.add(plusButton);
		
		minusButton = new JButton("");
		minusButton.setIcon(new ImageIcon("pic/minus.png"));
		minusButton.setBackground(Farben.getDefaultBackgroundcolor());
		minusButton.setBorder(null);
		erfassungsPanel.add(minusButton);
		
		this.setVisible(true);
	}
	
	public void setMenuButtonActionListener(ActionListener e){
		menuButton.addActionListener(e);
	}
	
	public void setAddShortcutButtonActionListener(ActionListener e){
		addShortcutButton.addActionListener(e);
	}
	
	public void setRemoveShortcutButtonctionListener(ActionListener e){
		removeShortcutButton.addActionListener(e);
	}
	
	public void setMinusButtonActionListener(ActionListener e){
		minusButton.addActionListener(e);
	}
	
	public void setPlusButtonActionListener(ActionListener e){
		plusButton.addActionListener(e);
	}
}
