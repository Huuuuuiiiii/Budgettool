/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;


import data.Shortcut;
import data.ShortcutWriter;
import data.DropdownReader;
import data.Waerung;
import data.WaerungReader;
import design.Components;
import design.Farben;
import design.Rahmen;
import design.Schrift;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShortcutView extends JPanel implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton cancelButton, addButton;
	private JPanel editPanel, titelPanel;
	private JLabel betragLabel, personLabel, kategorieLabel, titel, nameLabel;
	private JTextField betragTextField, nameTextField;
	// private JSpinner daySpinner, monthSpinner, yearSpinner;
	private JComboBox<String> betragComboBox;
	private static JComboBox<String> personComboBox;
	private static JComboBox<String> kategorieComboBox;
	private ViewHandler mainPanel;

	/**
	 * Create the panel.
	 */
	public ShortcutView(ViewHandler mainPanel) {

		this.mainPanel = mainPanel;

		setLayout(new BorderLayout(0, 0));
    
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setBackground(Farben.getDefaultBackgroundcolor());
        setSize(600, 600);
        titelPanel = new JPanel();
        add(titelPanel, BorderLayout.NORTH);

        titelPanel.setLayout(new BorderLayout(0, 0));
        titelPanel.setBackground(Farben.getDefaultBackgroundcolor());

        titel = new JLabel("Shortcut");
        titel.setFont(Schrift.TITEL);
        titel.setHorizontalAlignment(0);
        titel.setBackground(Farben.getDefaultBackgroundcolor());
        titel.setForeground(Farben.getDefaultFontcolor());
        titelPanel.add(titel, BorderLayout.CENTER);

        cancelButton = Components.createButtom("< Zurück");
        titelPanel.add(cancelButton,  BorderLayout.WEST);
        cancelButton.addActionListener(this);

        editPanel = new JPanel();
        add(editPanel, BorderLayout.CENTER);
        editPanel.setBackground(Farben.getDefaultBackgroundcolor());
        editPanel.setLayout(null);

        nameLabel = Components.createImageLabel("pic/pencil.png", 67, 33, 40, 40);
        editPanel.add(nameLabel);

        betragLabel = Components.createImageLabel("pic/money.png", 67, 83, 40, 40);
        editPanel.add(betragLabel);

        kategorieLabel = Components.createImageLabel("pic/folder.png", 67, 133, 40, 40);
        editPanel.add(kategorieLabel);

        personLabel = Components.createImageLabel("pic/person.png", 67, 183, 40, 40);
        editPanel.add(personLabel);

        nameTextField = Components.createTextField("", 147, 42, 155, 20);
        editPanel.add(nameTextField);

        betragTextField = Components.createTextField("", 147, 92, 116, 20);
        editPanel.add(betragTextField);

        betragComboBox = Components.createComboBox(273, 92, 80, 20);
        WaerungReader waerung = new WaerungReader();
		for (Waerung option : waerung.getOptions()) {
			betragComboBox.addItem(option.getAbkuerzung());
		}
		editPanel.add(this.betragComboBox);

        kategorieComboBox = Components.createComboBox(147, 142, 155, 20);
        listOptions("Kategorie", kategorieComboBox);
		editPanel.add(ShortcutView.kategorieComboBox);

        personComboBox = Components.createComboBox(147, 192, 154, 20);
        listOptions("Person", personComboBox);
		editPanel.add(ShortcutView.personComboBox);

        addButton = Components.createButtom("Speichern");
        addButton.setBounds(250, 292, 89, 23);
        addButton.setBorder(Rahmen.roundedBorder);
        addButton.addActionListener(this);
        editPanel.add(addButton);
    }

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == cancelButton){
			mainPanel.getShortcutViewPanel().setVisible(false);
			mainPanel.getMainViewPanel().setVisible(true);
		}
		if (e.getSource() == addButton){
			String image = "pic/Buchstaben/" + String.valueOf(Character.toUpperCase(nameTextField.getText().charAt(0))) + ".png";
			new ShortcutWriter(new Shortcut(nameTextField.getText(), image, betragTextField.getText(), kategorieComboBox.getSelectedItem().toString(), personComboBox.getSelectedItem().toString()));
			
			MainView.updateShortcuts();
			this.setVisible(false);
			mainPanel.getMainViewPanel().setVisible(true);
		}
	}

	private static void listOptions(String Filename, JComboBox<String> ComboBox) {
		DropdownReader reader = new DropdownReader(Filename);
		for (String option : reader.getOptions()) {
			ComboBox.addItem(option);
		}
	}

	public static void uploadPerson() {
		listOptions("Person", personComboBox);
	}

	public static void uploadKategory() {
		listOptions("Kategorie", kategorieComboBox);
	}
}
