/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package view;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import design.Components;
import design.Farben;
import design.Rahmen;
import design.Schrift;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.event.ActionListener;

public class EinnahmenView extends JPanel {

	private JButton cancelButton, addButton;
	private JPanel editPanel, titelPanel;
	private JLabel betragLabel, datumLabel, personLabel, kategorieLabel, titel;
	private JTextField betragTextField;
	private JSpinner daySpinner, monthSpinner, yearSpinner;
	private JComboBox betragComboBox, personComboBox, kategorieComboBox;

	/**
	 * Create the panel.
	 */
	public EinnahmenView() {
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
        
        editPanel = new JPanel();
        add(editPanel, BorderLayout.CENTER);
        editPanel.setBackground(Farben.getDefaultBackgroundcolor());
        editPanel.setLayout(null);
        
        betragLabel = Components.createImageLabel("pic/money.png", 67, 83, 40, 40);
        editPanel.add(this.betragLabel);
        
        kategorieLabel = Components.createImageLabel("pic/money.png", 67, 83, 40, 40);
        editPanel.add(this.kategorieLabel);
        
        datumLabel = Components.createImageLabel("pic/calendar.png", 67, 183, 40, 40);
        editPanel.add(this.datumLabel);
        
        personLabel = Components.createImageLabel("pic/person.png", 67, 233, 40, 40);
        editPanel.add(this.personLabel);
        
        betragTextField = Components.createTextField("", 147, 92, 116, 20);
        editPanel.add(this.betragTextField);
        
        betragComboBox = Components.createComboBox(273, 92, 66, 20);
        editPanel.add(this.betragComboBox);
        
        kategorieComboBox = Components.createComboBox(147, 142, 155, 20);
        editPanel.add(this.kategorieComboBox);
        
        daySpinner = Components.createSpinner(147, 192, 40, 20);
        editPanel.add(this.daySpinner);
        
        monthSpinner = Components.createSpinner(197, 192, 40, 20);
        editPanel.add(this.monthSpinner);
        
        yearSpinner = Components.createSpinner(247, 192, 55, 20);
        editPanel.add(this.yearSpinner);
        
        personComboBox = Components.createComboBox(148, 242, 154, 20);
        editPanel.add(this.personComboBox);
        
        addButton = Components.createButtom("Enter");
        addButton.setBounds(250, 292, 89, 23);
        editPanel.add(this.addButton);
    }

	public void setCancelButtonActionListener(ActionListener e) {
		cancelButton.addActionListener(e);
	}

	public void setAddButtonActionListener(ActionListener e) {
		addButton.addActionListener(e);
	}
}
