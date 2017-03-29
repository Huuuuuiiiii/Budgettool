/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package design;

import design.Farben;
import design.Rahmen;
import design.Schrift;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SpinnerDateModel;
import javax.swing.JSpinner.DateEditor;

public class Components {
    public static JLabel createImageLabel(String icon, int x, int y, int white, int higet) {
        JLabel label = createLabel("", x, y, white, higet);
        label.setIcon(new ImageIcon(icon));
        return label;
    }

    public static JTextField createTextField(String name, int x, int y, int white, int higet) {
        JTextField textField = new JTextField(name);
        textField.setFont(Schrift.STANDART);
        textField.setColumns(10);
        textField.setBounds(x, y, white, higet);
        textField.setForeground(Farben.getDefaultFontcolor());
        textField.setBackground(Farben.getDefaultBackgroundcolor());
        textField.setBorder(Rahmen.roundedBorder);
        return textField;
    }

    public static JComboBox<String> createComboBox(int x, int y, int white, int higet) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setFont(Schrift.STANDART);
        comboBox.setBounds(x, y, white, higet);
        comboBox.setForeground(Farben.getDefaultFontcolor());
        comboBox.setBackground(Farben.getDefaultBackgroundcolor());
        return comboBox;
    }

    public static JSpinner createSpinner(int x, int y, int white, int higet) {
    	SpinnerDateModel sdm = new SpinnerDateModel();
		JSpinner spinner = new JSpinner(sdm);
        spinner.setEditor(new DateEditor(spinner,"dd.MM.yyyy"));
        spinner.setFont(Schrift.STANDART);
        spinner.setBounds(x, y, white, higet);
        spinner.setForeground(Farben.getDefaultFontcolor());
        spinner.setBackground(Farben.getDefaultBackgroundcolor());
        return spinner;
    }

    public static JButton createButtom(String name) {
        JButton button = new JButton(name);
        button.setFont(Schrift.STANDART);
        button.setForeground(Farben.getDefaultFontcolor());
        button.setBackground(Farben.getDefaultBackgroundcolor());
        button.setBorder(null);
        return button;
    }
    
    public static JLabel createLabel(String name, int x, int y, int white, int higet) {
        JLabel label = new JLabel(name);
        label.setBounds(x, y, white, higet);
        label.setBackground(Farben.getDefaultBackgroundcolor());
        label.setForeground(Farben.getDefaultFontcolor());
        label.setFont(Schrift.STANDART);
        return label;
    }
    
    public static JToggleButton createToggleButton(String name) {
    	JToggleButton toggleButton = new JToggleButton(name);
    	toggleButton.setFont(Schrift.STANDART);
    	toggleButton.setForeground(Farben.getDefaultFontcolor());
    	toggleButton.setBackground(Farben.getDefaultBackgroundcolor());
        return toggleButton;
    }
    
}