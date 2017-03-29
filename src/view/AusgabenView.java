/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package view;

import design.Components;
import design.Farben;
import design.Rahmen;
import design.Schrift;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.util.Date;

import data.CsvWriter;
import data.DropdownReader;
import data.Kostenstelle;
import data.Waerung;
import data.WaerungReader;

public class AusgabenView extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JButton cancelButton, addButton;
	private JPanel editPanel, titelPanel;
	private JLabel betragLabel, datumLabel, personLabel, kategorieLabel, titel;
	private JTextField betragTextField;
	private JSpinner dateSpinner;
	private JComboBox<String> betragComboBox;
	private static JComboBox<String> personComboBox;
	private static JComboBox<String> kategorieComboBox;
	private ViewHandler mainPanel;
	private CsvWriter writer = new CsvWriter("Ausgaben");

    public AusgabenView(ViewHandler mainPanel) {

    	this.mainPanel = mainPanel;

    	setLayout(new BorderLayout(0, 0));
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setBackground(Farben.getDefaultBackgroundcolor());
        setSize(600, 600);
        titelPanel = new JPanel();
        add(titelPanel, BorderLayout.NORTH);

        titelPanel.setLayout(new BorderLayout(0, 0));
        titelPanel.setBackground(Farben.getDefaultBackgroundcolor());

        titel = new JLabel("Ausgaben");
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

        betragLabel = Components.createImageLabel("pic/money.png", 67, 83, 40, 40);
        editPanel.add(this.betragLabel);

        kategorieLabel = Components.createImageLabel("pic/folder.png", 67, 133, 40, 40);
        editPanel.add(this.kategorieLabel);

        datumLabel = Components.createImageLabel("pic/calendar.png", 67, 183, 40, 40);
        editPanel.add(this.datumLabel);

        personLabel = Components.createImageLabel("pic/person.png", 67, 233, 40, 40);
        editPanel.add(this.personLabel);

        betragTextField = Components.createTextField("", 147, 92, 116, 20);
        editPanel.add(this.betragTextField);

        betragComboBox = Components.createComboBox(273, 92, 80, 20);
        WaerungReader waerung = new WaerungReader();
        for(Waerung option : waerung.getOptions()){
        	betragComboBox.addItem(option.getAbkuerzung());
        }
        editPanel.add(this.betragComboBox);

        kategorieComboBox = Components.createComboBox(147, 142, 155, 20);
        listOptions("Kategorie", kategorieComboBox);
        editPanel.add(AusgabenView.kategorieComboBox);

        dateSpinner = Components.createSpinner(147, 192, 100, 20);
        editPanel.add(this.dateSpinner);

        personComboBox= Components.createComboBox(148, 242, 154, 20);
        listOptions("Person", personComboBox);
        editPanel.add(AusgabenView.personComboBox);
      
        addButton = Components.createButtom("Speichern");      
        addButton.setBounds(250, 292, 89, 23);
        addButton.setBorder(Rahmen.roundedBorder);
        addButton.addActionListener(this);
        editPanel.add(this.addButton);
    }

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == cancelButton){
			this.setVisible(false);
			mainPanel.getMainViewPanel().setVisible(true);
		}
		if (e.getSource() == addButton){
			writer.writer(new Kostenstelle(betragTextField.getText(), kategorieComboBox.getSelectedItem().toString(), ((Date) dateSpinner.getModel().getValue()), personComboBox.getSelectedItem().toString()));
			betragTextField.setText("");
			this.setVisible(false);
			mainPanel.getMainViewPanel().setVisible(true);
		}
	}
  	private static void listOptions(String Filename, JComboBox<String> ComboBox){
		 DropdownReader reader = new DropdownReader(Filename);
	     for(String option : reader.getOptions()){
	    	 ComboBox.addItem(option);
	     }
	}
	public static void uploadPerson() {
		listOptions("Person", personComboBox);
	}
	public static void uploadKategory(){
		listOptions("Kategorie", kategorieComboBox);
	}
}