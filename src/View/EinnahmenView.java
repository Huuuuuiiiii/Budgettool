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

import com.sun.xml.internal.ws.encoding.fastinfoset.FastInfosetStreamReaderRecyclable;

import Design.Farben;
import Design.Rahmen;
import Design.Schrift;

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
		
		titelPanel = new JPanel();
		add(titelPanel, BorderLayout.NORTH);
		titelPanel.setLayout(new BorderLayout(0, 0));
		titelPanel.setBackground(Farben.getDefaultBackgroundcolor());
		titelPanel.setForeground(Farben.getDefaultFontcolor());
		
		titel = new JLabel("Einnahemen");
		titel.setFont(Schrift.TITEL);
		titel.setHorizontalAlignment(SwingConstants.CENTER);
		titel.setBackground(Farben.getDefaultBackgroundcolor());
		titel.setForeground(Farben.getDefaultFontcolor());
		titelPanel.add(titel, BorderLayout.CENTER);
		
		cancelButton = new JButton("< Zurück");
		cancelButton.setFont(Schrift.STANDART);
		cancelButton.setBorder(null);
		cancelButton.setBackground(Farben.getDefaultBackgroundcolor());
		cancelButton.setForeground(Farben.getDefaultFontcolor());
		titelPanel.add(cancelButton, BorderLayout.WEST);
		
		editPanel = new JPanel();
		add(editPanel, BorderLayout.CENTER);
		editPanel.setBackground(Farben.getDefaultBackgroundcolor());
		editPanel.setLayout(null);
		
		betragLabel = new JLabel("");
		betragLabel.setIcon(new ImageIcon("pic/money.png"));
		betragLabel.setBounds(67, 33, 40, 40);
		betragLabel.setBackground(Farben.getDefaultBackgroundcolor());
		editPanel.add(betragLabel);
		
		kategorieLabel = new JLabel("");
		kategorieLabel.setIcon(new ImageIcon("pic/folder.png"));
		kategorieLabel.setBounds(67, 83, 40, 40);
		kategorieLabel.setBackground(Farben.getDefaultBackgroundcolor());
		editPanel.add(kategorieLabel);
		
		datumLabel = new JLabel("");
		datumLabel.setIcon(new ImageIcon("pic/calendar.png"));
		datumLabel.setBounds(67, 133, 40, 40);
		datumLabel.setBackground(Farben.getDefaultBackgroundcolor());
		editPanel.add(datumLabel);
		
		personLabel = new JLabel("");
		personLabel.setIcon(new ImageIcon("pic/person.png"));
		personLabel.setBounds(67, 183, 40, 40);
		personLabel.setBackground(Farben.getDefaultBackgroundcolor());
		editPanel.add(personLabel);
		
		betragTextField = new JTextField();
		betragTextField.setBounds(147, 42, 116, 20);
		betragTextField.setFont(Schrift.STANDART);
		editPanel.add(betragTextField);
		betragTextField.setBackground(Farben.getDefaultBackgroundcolor());
		betragTextField.setForeground(Farben.getDefaultFontcolor());
		betragTextField.setBorder(Rahmen.defaultBorder);
		betragTextField.setColumns(10);
		
		kategorieComboBox = new JComboBox();
		kategorieComboBox.setFont(Schrift.STANDART);
		kategorieComboBox.setBounds(147, 92, 155, 20);
		kategorieComboBox.setBackground(Farben.getDefaultBackgroundcolor());
		kategorieComboBox.setForeground(Farben.getDefaultFontcolor());
		kategorieComboBox.setBorder(Rahmen.defaultBorder);
		editPanel.add(kategorieComboBox);
		
		daySpinner = new JSpinner();
		daySpinner.setFont(Schrift.STANDART);
		daySpinner.setBounds(147, 142, 40, 20);
		daySpinner.setBackground(Farben.getDefaultBackgroundcolor());
		daySpinner.setForeground(Farben.getDefaultFontcolor());
		daySpinner.setBorder(Rahmen.defaultBorder);
		editPanel.add(daySpinner);
		
		monthSpinner = new JSpinner();
		monthSpinner.setFont(Schrift.STANDART);
		monthSpinner.setBounds(197, 142, 40, 20);
		monthSpinner.setBackground(Farben.getDefaultBackgroundcolor());
		monthSpinner.setForeground(Farben.getDefaultFontcolor());
		monthSpinner.setBorder(Rahmen.defaultBorder);
		editPanel.add(monthSpinner);
		
		yearSpinner = new JSpinner();
		yearSpinner.setFont(Schrift.STANDART);
		yearSpinner.setBounds(247, 142, 55, 20);
		yearSpinner.setBackground(Farben.getDefaultBackgroundcolor());
		yearSpinner.setForeground(Farben.getDefaultFontcolor());
		yearSpinner.setBorder(Rahmen.defaultBorder);
		editPanel.add(yearSpinner);
		
		personComboBox = new JComboBox();
		personComboBox.setFont(Schrift.STANDART);
		personComboBox.setBounds(148, 192, 154, 20);
		personComboBox.setBackground(Farben.getDefaultBackgroundcolor());
		personComboBox.setForeground(Farben.getDefaultFontcolor());
		personComboBox.setBorder(Rahmen.defaultBorder);
		editPanel.add(personComboBox);
		
		betragComboBox = new JComboBox();
		betragComboBox.setFont(Schrift.STANDART);
		betragComboBox.setBounds(273, 42, 66, 20);
		betragComboBox.setBackground(Farben.getDefaultBackgroundcolor());
		betragComboBox.setForeground(Farben.getDefaultFontcolor());
		betragComboBox.setBorder(Rahmen.defaultBorder);
		editPanel.add(betragComboBox);
		
		addButton = new JButton("Enter");
		addButton.setBounds(250, 242, 89, 23);
		addButton.setFont(Schrift.STANDART);
		addButton.setBorder(Rahmen.defaultBorder);
		addButton.setBackground(Farben.getDefaultBackgroundcolor());
		addButton.setForeground(Farben.getDefaultFontcolor());
		editPanel.add(addButton);

	}
	
	public void setCancelButtonActionListener(ActionListener e){
		cancelButton.addActionListener(e);
	}
	
	public void setAddButtonActionListener(ActionListener e){
		addButton.addActionListener(e);
	}
}
