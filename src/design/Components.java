/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package design;

import design.Farben;
import design.Rahmen;
import design.Schrift;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Components {
    public static JLabel createImageLabel(String icon, int x, int y, int white, int higet) {
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon(icon));
        label.setBounds(x, y, white, higet);
        label.setBackground(Farben.getDefaultBackgroundcolor());
        return label;
    }

    public static JTextField createTextField(String name, int x, int y, int white, int higet) {
        JTextField textField = new JTextField(name);
        textField.setFont(Schrift.STANDART);
        textField.setColumns(10);
        textField.setBounds(x, y, white, higet);
        textField.setForeground(Farben.getDefaultFontcolor());
        textField.setBackground(Farben.getDefaultBackgroundcolor());
        textField.setBorder(Rahmen.defaultBorder);
        return textField;
    }

    public static JComboBox createComboBox(int x, int y, int white, int higet) {
        JComboBox comboBox = new JComboBox();
        comboBox.setFont(Schrift.STANDART);
        comboBox.setBounds(x, y, white, higet);
        comboBox.setForeground(Farben.getDefaultFontcolor());
        comboBox.setBackground(Farben.getDefaultBackgroundcolor());
        comboBox.setBorder(Rahmen.defaultBorder);
        return comboBox;
    }

    public static JSpinner createSpinner(int x, int y, int white, int higet) {
        JSpinner spinner = new JSpinner();
        spinner.setFont(Schrift.STANDART);
        spinner.setBounds(x, y, white, higet);
        spinner.setForeground(Farben.getDefaultFontcolor());
        spinner.setBackground(Farben.getDefaultBackgroundcolor());
        spinner.setBorder(Rahmen.defaultBorder);
        return spinner;
    }

    public static JButton createButtom(String name) {
        JButton button = new JButton(name);
        button.setFont(Schrift.STANDART);
        button.setForeground(Farben.getDefaultFontcolor());
        button.setBackground(Farben.getDefaultBackgroundcolor());
        button.setBorder(Rahmen.defaultBorder);
        return button;
    }
}