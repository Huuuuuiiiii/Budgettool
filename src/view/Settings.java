package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;

import javax.swing.JSplitPane;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.CardLayout;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import data.DropdownWriter;
import data.Waerung;
import data.WaerungReader;
import design.Components;
import design.Farben;
import design.Rahmen;
import design.Schrift;

import javax.swing.JToggleButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;

/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

public class Settings extends JPanel implements ActionListener {

	private JPanel titelPanel, settingsPanel, settingsLayoutPanel, settingsAddPanel, settingsBudgetPanel,
			settingsKathegoriePanel;
	private JButton cancelButton, personButton, kategorieButton;
	private JSplitPane splitPane;
	private JLabel darkdesignLabel, personLabel, namePersonLabel, waerungLabel, finazMothLabel, mothBudgetLabel,
			zyklusLabel, kategorieNameLabel, kategorieLabel, Titel;
	private JToggleButton darkdesignToggleButton, settingsBudgetButton, settingsViewButton, settingsAddButton;
	private JTextField personTextField, kategorieTextField, mothBudgetTextField;
	private JComboBox<String> zyklusComboBox, mothBudgetComboBox, waerungComboBox;
	private JSpinner finazMothSpinner;
	private ViewHandler mainPanel;
	private DropdownWriter personWriter = new DropdownWriter("Person");
	private DropdownWriter kategorieWriter = new DropdownWriter("Kategorie");
	private WaerungReader waerung = new WaerungReader();

	/**
	 * Create the panel.
	 */
	public Settings(ViewHandler mainPanel) {

		this.mainPanel = mainPanel;
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

		cancelButton = Components.createButtom("< Zurück");
		titelPanel.add(cancelButton, BorderLayout.WEST);
		cancelButton.addActionListener(this);

		splitPane = new JSplitPane();
		splitPane.setBackground(Farben.getDefaultBackgroundcolor());
		splitPane.setBorder(null);
		add(splitPane);

		settingsPanel = new JPanel();
		settingsPanel.setBackground(Farben.getDefaultBackgroundcolor());
		splitPane.setRightComponent(settingsPanel);
		settingsPanel.setLayout(new CardLayout(0, 0));

		settingsLayoutPanel = new JPanel();
		settingsLayoutPanel.setBackground(Farben.getDefaultBackgroundcolor());
		settingsPanel.add(settingsLayoutPanel, "name_3361411458953");
		settingsLayoutPanel.setLayout(null);

		darkdesignLabel = Components.createLabel("Dark Design", 20, 36, 100, 14);
		settingsLayoutPanel.add(darkdesignLabel);


		darkdesignToggleButton = Components.createToggleButton("ON / OFF");
		darkdesignToggleButton.setBounds(122, 29, 128, 23);
		settingsLayoutPanel.add(darkdesignToggleButton);

		settingsAddPanel = new JPanel();
		settingsAddPanel.setBackground(Farben.getDefaultBackgroundcolor());
		settingsPanel.add(settingsAddPanel, "name_3363203520759");
		settingsAddPanel.setLayout(null);

		personLabel = Components.createLabel("Person", 10, 11, 110, 14);
		settingsAddPanel.add(personLabel);

		namePersonLabel = Components.createLabel("Name", 20, 36, 100, 14);
		settingsAddPanel.add(namePersonLabel);

		personTextField = Components.createTextField("", 122, 33, 128, 20);
		settingsAddPanel.add(personTextField);

		personButton = Components.createButtom("Person hinzufügen");
		personButton.setBounds(30, 60, 155, 20);
		personButton.setBorder(Rahmen.roundedBorder);
		personButton.addActionListener(this);
		settingsAddPanel.add(personButton);

		kategorieLabel = Components.createLabel("Kategorie", 10, 125, 110, 14);
		kategorieLabel.setFont(Schrift.STANDART);
		settingsAddPanel.add(kategorieLabel);

		kategorieNameLabel = Components.createLabel("Kategorie", 20, 150, 100, 14);
		settingsAddPanel.add(kategorieNameLabel);

		kategorieTextField = Components.createTextField("", 122, 147, 128, 20);
		settingsAddPanel.add(kategorieTextField);

		kategorieButton = Components.createButtom("Kategorie hinzufügen");
		kategorieButton.setBounds(20, 175, 155, 20);
		kategorieButton.setBorder(Rahmen.roundedBorder);
		kategorieButton.addActionListener(this);
		settingsAddPanel.add(kategorieButton);

		settingsBudgetPanel = new JPanel();
		settingsBudgetPanel.setBackground(Farben.getDefaultBackgroundcolor());
		settingsPanel.add(settingsBudgetPanel, "name_3368500105902");
		settingsBudgetPanel.setLayout(null);

		waerungLabel = Components.createLabel("Währung", 20, 36, 100, 14);
		settingsBudgetPanel.add(waerungLabel);

		mothBudgetLabel = Components.createLabel("Monatsbudget", 20, 76, 100, 14);
		settingsBudgetPanel.add(mothBudgetLabel);

		finazMothLabel = Components.createLabel("Finazmonatsbeginn", 20, 116, 100, 14);
		settingsBudgetPanel.add(finazMothLabel);

		zyklusLabel = Components.createLabel("Zyklus", 20, 156, 100, 14);
		settingsBudgetPanel.add(zyklusLabel);

		waerungComboBox = Components.createComboBox(122, 33, 80, 20);
		for (Waerung option : waerung.getOptions()) {
			waerungComboBox.addItem(option.getAbkuerzung());
		}
		settingsBudgetPanel.add(waerungComboBox);

		mothBudgetTextField = Components.createTextField("", 122, 73, 86, 20);
		settingsBudgetPanel.add(mothBudgetTextField);

		finazMothSpinner = Components.createSpinner(122, 113, 90, 20);
		settingsBudgetPanel.add(finazMothSpinner);

		mothBudgetComboBox = Components.createComboBox(218, 73, 80, 20);
		for (Waerung option : waerung.getOptions()) {
			mothBudgetComboBox.addItem(option.getAbkuerzung());
		}
		settingsBudgetPanel.add(mothBudgetComboBox);

		zyklusComboBox = Components.createComboBox(122, 153, 90, 20);

		zyklusComboBox.addItem("Täglich");
		zyklusComboBox.addItem("Wöchentlich");
		zyklusComboBox.addItem("Monatlich");
		zyklusComboBox.addItem("Jährlich");
		settingsBudgetPanel.add(zyklusComboBox);

		settingsKathegoriePanel = new JPanel();
		splitPane.setLeftComponent(settingsKathegoriePanel);
		settingsKathegoriePanel.setBackground(Farben.getDefaultBackgroundcolor());
		settingsKathegoriePanel.setLayout(new GridLayout(10, 1, 0, 0));

		settingsViewButton = Components.createToggleButton("Ansicht");
		settingsViewButton.setBorder(Rahmen.defaultBorder);
		settingsKathegoriePanel.add(settingsViewButton);
		settingsViewButton.addActionListener(this);

		settingsAddButton = Components.createToggleButton("Hinzufügen");
		settingsAddButton.setBorder(Rahmen.defaultBorder);
		settingsKathegoriePanel.add(settingsAddButton);
		settingsAddButton.addActionListener(this);

		settingsBudgetButton = Components.createToggleButton("Budget");
		settingsBudgetButton.setBorder(Rahmen.defaultBorder);
		settingsKathegoriePanel.add(settingsBudgetButton);
		settingsBudgetButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == cancelButton) {
			this.setVisible(false);
			mainPanel.getMainViewPanel().setVisible(true);
		}

		if (e.getSource() == settingsAddButton) {
			setSettingsViewPanelVisible(false);
			setsettingsBudgetPanelVisible(false);
			setsettingsAddPanelVisible(true);
		}

		else if (e.getSource() == settingsViewButton) {
			setSettingsViewPanelVisible(true);
			setsettingsBudgetPanelVisible(false);
			setsettingsAddPanelVisible(false);
		}

		else if (e.getSource() == settingsBudgetButton) {
			setSettingsViewPanelVisible(false);
			setsettingsBudgetPanelVisible(true);
			setsettingsAddPanelVisible(false);
		}

		if (e.getSource() == personButton) {
			personWriter.writer(personTextField.getText());
			personTextField.setText("");
			EinnahmenView.uploadPerson();
			AusgabenView.uploadPerson();
			ShortcutView.uploadPerson();
		}
		if (e.getSource() == kategorieButton) {
			kategorieWriter.writer(kategorieTextField.getText());
			kategorieTextField.setText("");
			EinnahmenView.uploadKategory();
			AusgabenView.uploadKategory();
			ShortcutView.uploadKategory();
		}
	}

	private void setSettingsViewPanelVisible(boolean visible) {
		settingsLayoutPanel.setVisible(visible);
		settingsViewButton.setSelected(visible);
	}

	private void setsettingsAddPanelVisible(boolean visible) {
		settingsAddPanel.setVisible(visible);
		settingsAddButton.setSelected(visible);
	}

	private void setsettingsBudgetPanelVisible(boolean visible) {
		settingsBudgetPanel.setVisible(visible);
		settingsBudgetButton.setSelected(visible);
	}
}
