/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import data.Shortcut;
import data.ShortcutReader;
import design.Components;
import design.Farben;
import design.Rahmen;
import design.Schrift;
import diagramm.Balkendiagramm;
import diagramm.Kreisdiagramm;

public class MainView extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel shortcutsPanel, manageShortcutPanel, titelPanel, dayliBudgetPanel, erfassungsPanel, uebersichtPanel, monthPanel; 
	private JButton removeShortcutButton, addShortcutButton, menuButton, plusButton, minusButton;
	private JLabel Titel, dayliBudgetLabel, monthBudgetLabel;
	private JList<Shortcut> shortcutlist;
	private static DefaultListModel<Shortcut> listModel = new DefaultListModel<>();
	private ViewHandler mainPanel;
	
	
	/**
	 * Create the panel.
	 */
	public MainView(ViewHandler mainPanel) {
		
		this.mainPanel = mainPanel;
		
		setBackground(Farben.getDefaultBackgroundcolor());
		setBorder(new EmptyBorder(10, 10, 10, 10));
		setLayout(new BorderLayout(10, 10));
		
		shortcutsPanel = new JPanel();
		add(shortcutsPanel, BorderLayout.EAST);
		shortcutsPanel.setBackground(Color.cyan);
		shortcutsPanel.setLayout(new BorderLayout(0, 0));
		
		manageShortcutPanel = new JPanel();
		shortcutsPanel.add(manageShortcutPanel, BorderLayout.SOUTH);
		manageShortcutPanel.setBackground(Farben.getDefaultBackgroundcolor());
		manageShortcutPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		removeShortcutButton = Components.createButtom("-");
		removeShortcutButton.setFont(Schrift.FETT);
		removeShortcutButton.setForeground(Farben.getDefaultFontcolor());
		removeShortcutButton.setBackground(Farben.getDefaultBackgroundcolor());
		removeShortcutButton.setBorder(Rahmen.defaultBorder);
		manageShortcutPanel.add(removeShortcutButton);
		
		addShortcutButton = Components.createButtom("+");
		addShortcutButton.setFont(Schrift.FETT);
		addShortcutButton.setForeground(Farben.getDefaultFontcolor());
		addShortcutButton.setBackground(Farben.getDefaultBackgroundcolor());
		addShortcutButton.setBorder(Rahmen.defaultBorder);
		manageShortcutPanel.add(addShortcutButton);
		
		shortcutlist = new JList<Shortcut>();
		shortcutlist.setBackground(Farben.getDefaultBackgroundcolor());
		shortcutlist.setCellRenderer(new ShortcutPanel());
		shortcutlist.setModel(listModel);
		shortcutlist.setBorder(Rahmen.defaultBorder);
		shortcutsPanel.add(new JScrollPane(shortcutlist), BorderLayout.CENTER);
		
		updateShortcuts();
//		listModel.addElement(new Shortcut("test", "pic/Buchstaben/P.png"));
		
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
		
		menuButton = Components.createButtom("");
		menuButton.setIcon(new ImageIcon("pic/menu.png"));
		menuButton.setBorder(null);
		titelPanel.add(menuButton, BorderLayout.WEST);
		
		uebersichtPanel = new JPanel();
		uebersichtPanel.setLayout(new BorderLayout(10,10));
		add(uebersichtPanel, BorderLayout.CENTER);
		uebersichtPanel.setBackground(Farben.getDefaultBackgroundcolor());
		uebersichtPanel.setLayout(new BorderLayout(0, 0));
		
		dayliBudgetPanel = new JPanel();
		uebersichtPanel.add(dayliBudgetPanel, BorderLayout.SOUTH);
		dayliBudgetPanel.setBackground(Farben.getDefaultBackgroundcolor());
		dayliBudgetPanel.setLayout(new BorderLayout(0, 0));
		
		Balkendiagramm balken = new Balkendiagramm(200, 1000);
		balken.setPreferredSize(new Dimension(0, balken.getHeight()));
		dayliBudgetPanel.add(balken, BorderLayout.CENTER);
		
		dayliBudgetLabel = new JLabel("Heute verfügbar");
		dayliBudgetPanel.add(dayliBudgetLabel, BorderLayout.NORTH);
		dayliBudgetLabel.setFont(Schrift.UBERSCHRIFT);
		dayliBudgetLabel.setForeground(Farben.getDefaultFontcolor());
		dayliBudgetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		monthPanel = new JPanel();
		uebersichtPanel.add(monthPanel, BorderLayout.CENTER);
		monthPanel.setBackground(Farben.getDefaultBackgroundcolor());
		monthPanel.setLayout(new BorderLayout(0, 0));
		monthPanel.setBorder(new EmptyBorder(50, 10, 30, 10));
		
		monthBudgetLabel = new JLabel("Restbetrag");
		monthBudgetLabel.setHorizontalAlignment(SwingConstants.CENTER);
		monthBudgetLabel.setFont(Schrift.UBERSCHRIFT);
		monthBudgetLabel.setForeground(Farben.getDefaultFontcolor());
		monthPanel.add(monthBudgetLabel, BorderLayout.NORTH);
		
		monthPanel.add(new Kreisdiagramm(60,300), BorderLayout.CENTER);
		
		erfassungsPanel = new JPanel();
		monthPanel.add(erfassungsPanel, BorderLayout.SOUTH);
		erfassungsPanel.setBackground(Farben.getDefaultBackgroundcolor());
		erfassungsPanel.setLayout(new GridLayout(1, 0, 0, 0));
		
		plusButton = Components.createButtom("");
		plusButton.setIcon(new ImageIcon("pic/plus.png"));
		plusButton.setBorder(null);
		erfassungsPanel.add(plusButton);
		
		minusButton = Components.createButtom("");
		minusButton.setIcon(new ImageIcon("pic/minus.png"));
		minusButton.setBorder(null);
		erfassungsPanel.add(minusButton);
		
		minusButton.addActionListener(this);
		plusButton.addActionListener(this);
		removeShortcutButton.addActionListener(this);
		addShortcutButton.addActionListener(this);
		menuButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == menuButton){
			this.setVisible(false);
			mainPanel.getSettingsViewPanel().setVisible(true);
		}
		if (e.getSource() == addShortcutButton){
			this.setVisible(false);
			mainPanel.getShortcutViewPanel().setVisible(true);
		}
		if (e.getSource() == minusButton){
			this.setVisible(false);
			mainPanel.getAusgabeViewPanel().setVisible(true);
		}
		if (e.getSource() == plusButton){
			this.setVisible(false);
			mainPanel.getEinnahmeViewPanel().setVisible(true);
		}	
	}
	
	public static void updateShortcuts(){
		listModel.clear();
		ShortcutReader read = new ShortcutReader();
		for(Shortcut a : read.getOptions() ) {
			listModel.addElement(a);
		}
	}
}
