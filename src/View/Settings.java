package View;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

import javax.swing.JSplitPane;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.CardLayout;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Design.Farben;
import Design.Rahmen;
import Design.Schrift;

import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;


/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

public class Settings extends JPanel {

	private JPanel titelPanel, settingsPanel, settingsLayoutPanel, settingsAddPanel, settingsBudgetPanel, settingsKathegoriePanel;
	private JButton cancelButton, personButton, kategorieButton;
	private JSplitPane splitPane;
	private JLabel darkdesignLabel, personLabel, namePersonLabel, waerungLabel, finazMothLabel, mothBudgetLabel, zyklusLabel, kategorieNameLabel, kategorieLabel, Titel;
	private JToggleButton darkdesignToggleButton, settingsBudgetButton, settingsViewButton, settingsAddButton;
	private JTextField personTextField, kategorieTextField, mothBudgetTextField;
	private JComboBox zyklusComboBox, mothBudgetComboBox, waerungComboBox;
	private JSpinner finazMothSpinner;

	/**
	 * Create the panel.
	 */
	public Settings() {
		setBackground(Farben.getDefaultBackgroundcolor());
		setLayout(new BorderLayout(0, 0));
		setBorder(new EmptyBorder(10, 10, 10, 10));
		
		titelPanel = new JPanel();
		add(titelPanel, BorderLayout.NORTH);
		titelPanel.setLayout(new BorderLayout(0, 0));
		titelPanel.setBackground(Farben.getDefaultBackgroundcolor());
		titelPanel.setForeground(Farben.getDefaultFontcolor());
		
		Titel = new JLabel("Einstellungen");
		Titel.setFont(Schrift.TITEL);
		Titel.setHorizontalAlignment(SwingConstants.CENTER);
		Titel.setBackground(Farben.getDefaultBackgroundcolor());
		Titel.setForeground(Farben.getDefaultFontcolor());
		titelPanel.add(Titel, BorderLayout.CENTER);
		
		cancelButton = new JButton("< Zurück");
		cancelButton.setFont(Schrift.STANDART);
		cancelButton.setBorder(null);
		cancelButton.setBackground(Farben.getDefaultBackgroundcolor());
		cancelButton.setForeground(Farben.getDefaultFontcolor());
		titelPanel.add(cancelButton, BorderLayout.WEST);
		
		splitPane = new JSplitPane();
		splitPane.setBackground(Farben.getDefaultBackgroundcolor());
		add(splitPane);
		
		settingsPanel = new JPanel();
		settingsPanel.setBackground(Farben.getDefaultBackgroundcolor());
		splitPane.setRightComponent(settingsPanel);
		settingsPanel.setLayout(new CardLayout(0, 0));
		
		settingsLayoutPanel = new JPanel();
		settingsLayoutPanel.setBackground(Farben.getDefaultBackgroundcolor());
		settingsPanel.add(settingsLayoutPanel, "name_3361411458953");
		settingsLayoutPanel.setLayout(null);
		
		darkdesignLabel = new JLabel("Durkdesign");
		darkdesignLabel.setBounds(20, 36, 100, 14);
		darkdesignLabel.setForeground(Farben.getDefaultFontcolor());
		darkdesignLabel.setFont(Schrift.STANDART);
		settingsLayoutPanel.add(darkdesignLabel);
		
		darkdesignToggleButton = new JToggleButton("ON / OF");
		darkdesignToggleButton.setBounds(122, 29, 128, 23);
		darkdesignToggleButton.setForeground(Farben.getDefaultFontcolor());
		darkdesignToggleButton.setBackground(Farben.getDefaultBackgroundcolor());
		darkdesignToggleButton.setFont(Schrift.STANDART);
		darkdesignToggleButton.setBorder(Rahmen.defaultBorder);
		settingsLayoutPanel.add(darkdesignToggleButton);
		
		settingsAddPanel = new JPanel();
		settingsAddPanel.setBackground(Farben.getDefaultBackgroundcolor());
		settingsPanel.add(settingsAddPanel, "name_3363203520759");
		settingsAddPanel.setLayout(null);
		
		personLabel = new JLabel("Person");
		personLabel.setBounds(10, 11, 110, 14);
		personLabel.setForeground(Farben.getDefaultFontcolor());
		personLabel.setFont(Schrift.STANDART);
		settingsAddPanel.add(personLabel);
		
		namePersonLabel = new JLabel("Name");
		namePersonLabel.setBounds(20, 36, 100, 14);
		namePersonLabel.setForeground(Farben.getDefaultFontcolor());
		namePersonLabel.setFont(Schrift.STANDART);
		settingsAddPanel.add(namePersonLabel);
		
		personTextField = new JTextField();
		personTextField.setBounds(122, 33, 128, 20);
		personTextField.setBackground(Farben.getDefaultBackgroundcolor());
		personTextField.setForeground(Farben.getDefaultFontcolor());
		personTextField.setFont(Schrift.STANDART);
		personTextField.setBorder(Rahmen.defaultBorder);
		settingsAddPanel.add(personTextField);
		personTextField.setColumns(10);
		
		personButton = new JButton("Person hinzufügen");
		personButton.setBounds(30, 60, 155, 23);
		personButton.setBackground(Farben.getDefaultBackgroundcolor());
		personButton.setForeground(Farben.getDefaultFontcolor());
		personButton.setFont(Schrift.STANDART);
		personButton.setBorder(Rahmen.defaultBorder);
		settingsAddPanel.add(personButton);
		
		kategorieLabel = new JLabel("Kategorie");
		kategorieLabel.setBounds(10, 125, 110, 14);
		kategorieLabel.setForeground(Farben.getDefaultFontcolor());
		kategorieLabel.setFont(Schrift.STANDART);
		settingsAddPanel.add(kategorieLabel);
		
		kategorieNameLabel = new JLabel("Kategorie");
		kategorieNameLabel.setForeground(Farben.getDefaultFontcolor());
		kategorieNameLabel.setBounds(20, 150, 100, 14);
		kategorieNameLabel.setFont(Schrift.STANDART);
		settingsAddPanel.add(kategorieNameLabel);
		
		kategorieTextField = new JTextField();
		kategorieTextField.setColumns(10);
		kategorieTextField.setBounds(122, 147, 128, 20);
		kategorieTextField.setBackground(Farben.getDefaultBackgroundcolor());
		kategorieTextField.setForeground(Farben.getDefaultFontcolor());
		kategorieTextField.setFont(Schrift.STANDART);
		kategorieTextField.setBorder(Rahmen.defaultBorder);
		settingsAddPanel.add(kategorieTextField);
		
		kategorieButton = new JButton("Kategorie hinzufügen");
		kategorieButton.setBackground(Farben.getDefaultBackgroundcolor());
		kategorieButton.setForeground(Farben.getDefaultFontcolor());
		kategorieButton.setBounds(30, 175, 155, 23);
		kategorieButton.setFont(Schrift.STANDART);
		kategorieButton.setBorder(Rahmen.defaultBorder);
		settingsAddPanel.add(kategorieButton);
		
		settingsBudgetPanel = new JPanel();
		settingsBudgetPanel.setBackground(Farben.getDefaultBackgroundcolor());
		settingsPanel.add(settingsBudgetPanel, "name_3368500105902");
		settingsBudgetPanel.setLayout(null);
		
		waerungLabel = new JLabel("Wärung");
		waerungLabel.setForeground(Farben.getDefaultFontcolor());
		waerungLabel.setBounds(20, 36, 100, 14);
		waerungLabel.setFont(Schrift.STANDART);
		settingsBudgetPanel.add(waerungLabel);
		
		mothBudgetLabel = new JLabel("Monatsbudget");
		mothBudgetLabel.setForeground(Farben.getDefaultFontcolor());
		mothBudgetLabel.setBounds(20, 76, 100, 14);
		mothBudgetLabel.setFont(Schrift.STANDART);
		settingsBudgetPanel.add(mothBudgetLabel);
		
		finazMothLabel = new JLabel("Finazmonatsbeginn");
		finazMothLabel.setForeground(Farben.getDefaultFontcolor());
		finazMothLabel.setBounds(20, 116, 100, 14);
		finazMothLabel.setFont(Schrift.STANDART);
		settingsBudgetPanel.add(finazMothLabel);
		
		zyklusLabel = new JLabel("Zyklus");
		zyklusLabel.setBounds(20, 156, 100, 14);
		zyklusLabel.setForeground(Farben.getDefaultFontcolor());
		zyklusLabel.setFont(Schrift.STANDART);
		settingsBudgetPanel.add(zyklusLabel);
		
		waerungComboBox = new JComboBox();
		waerungComboBox.setBounds(122, 33, 62, 20);
		waerungComboBox.setFont(Schrift.STANDART);
		waerungComboBox.setBorder(Rahmen.defaultBorder);
		settingsBudgetPanel.add(waerungComboBox);
		
		mothBudgetTextField = new JTextField();
		mothBudgetTextField.setBounds(122, 73, 86, 20);
		mothBudgetTextField.setFont(Schrift.STANDART);
		settingsBudgetPanel.add(mothBudgetTextField);
		mothBudgetTextField.setBorder(Rahmen.defaultBorder);
		mothBudgetTextField.setColumns(10);
		
		finazMothSpinner = new JSpinner();
		finazMothSpinner.setBounds(122, 113, 62, 20);
		finazMothSpinner.setFont(Schrift.STANDART);
		finazMothSpinner.setBorder(Rahmen.defaultBorder);
		settingsBudgetPanel.add(finazMothSpinner);
		
		mothBudgetComboBox = new JComboBox();
		mothBudgetComboBox.setBounds(218, 73, 62, 20);
		mothBudgetComboBox.setFont(Schrift.STANDART);
		mothBudgetComboBox.setBorder(Rahmen.defaultBorder);
		settingsBudgetPanel.add(mothBudgetComboBox);
		
		zyklusComboBox = new JComboBox();
		zyklusComboBox.setBounds(122, 153, 62, 20);
		zyklusComboBox.setFont(Schrift.STANDART);
		zyklusComboBox.setBorder(Rahmen.defaultBorder);
		settingsBudgetPanel.add(zyklusComboBox);
		
		settingsKathegoriePanel = new JPanel();
		splitPane.setLeftComponent(settingsKathegoriePanel);
		settingsKathegoriePanel.setBorder(new LineBorder(Color.GRAY));
		settingsKathegoriePanel.setBackground(Farben.getDefaultBackgroundcolor());
		settingsKathegoriePanel.setLayout(new GridLayout(10, 1, 0, 0));
		
		settingsViewButton = new JToggleButton("View");
		settingsKathegoriePanel.add(settingsViewButton);
		settingsViewButton.setBorder(new LineBorder(Color.GRAY));
		settingsViewButton.setForeground(Farben.getDefaultFontcolor());
		settingsViewButton.setBackground(Farben.getDefaultBackgroundcolor());
		settingsViewButton.setBorder(Rahmen.defaultBorder);
		settingsViewButton.setFont(Schrift.STANDART);
		
		settingsAddButton = new JToggleButton("Add");
		settingsAddButton.setBackground(Farben.getDefaultBackgroundcolor());
		settingsAddButton.setForeground(Farben.getDefaultFontcolor());
		settingsAddButton.setFont(Schrift.STANDART);
		settingsAddButton.setBorder(Rahmen.defaultBorder);
		settingsKathegoriePanel.add(settingsAddButton);
	
		settingsBudgetButton = new JToggleButton("Budget");
		settingsBudgetButton.setBackground(Farben.getDefaultBackgroundcolor());
		settingsBudgetButton.setForeground(Farben.getDefaultFontcolor());
		settingsBudgetButton.setFont(Schrift.STANDART);
		settingsBudgetButton.setBorder(Rahmen.defaultBorder);
		settingsKathegoriePanel.add(settingsBudgetButton);

		settingsAddPanel.setVisible(true);
		settingsBudgetPanel.setVisible(false);
		settingsLayoutPanel.setVisible(false);
	}
	
	public void setCancelButtonActionListener(ActionListener e){
		cancelButton.addActionListener(e);
	}
	
	public void setPersonButtonActionListener(ActionListener e){
		personButton.addActionListener(e);
	}
	
	public void setKategorieButtonActionListener(ActionListener e){
		kategorieButton.addActionListener(e);
	}
	
	public void setdarkdesignToggleButtonActionListener(ActionListener e){
		darkdesignToggleButton.addActionListener(e);
	}
	
	public void setSettingsBudgetButtonActionListener(ActionListener e){
		settingsBudgetButton.addActionListener(e);
	}
	
	public void setSettingsViewButtonActionListener(ActionListener e){
		settingsViewButton.addActionListener(e);
	}
	
	public void setSettingsAddButtonButtonActionListener(ActionListener e){
		settingsAddButton.addActionListener(e);
	}

	public JPanel getSettingsLayoutPanel() {
		return settingsLayoutPanel;
	}

	public JPanel getSettingsAddPanel() {
		return settingsAddPanel;
	}

	public JPanel getSettingsBudgetPanel() {
		return settingsBudgetPanel;
	}
	
	public JToggleButton getDarkdesignToggleButton() {
		return darkdesignToggleButton;
	}

	public JToggleButton getSettingsBudgetButton() {
		return settingsBudgetButton;
	}

	public JToggleButton getSettingsViewButton() {
		return settingsViewButton;
	}

	public JToggleButton getSettingsAddButton() {
		return settingsAddButton;
	}
}
