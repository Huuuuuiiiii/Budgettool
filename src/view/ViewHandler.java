package view;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import design.Farben;
import java.awt.Color;
/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

public class ViewHandler {

	private JFrame frame;
	private JPanel mainPanel;
	private MainView mainViewPanel = new MainView();
	private ShortcutView shortcutViewPanel = new ShortcutView();
	private Settings settingsViewPanel = new Settings();
	private EinnahmenView einnahmeViewPanel = new EinnahmenView();
	private AusgabenView ausgabeViewPanel = new AusgabenView();
	private Farben farben = new Farben();
	
	/**
	 * Create the application.
	 */
	public ViewHandler() {
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 505, 502);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Farben.getDefaultBackgroundcolor());
		frame.getContentPane().add(mainPanel, "name_4264670569464");
		mainPanel.setLayout(new CardLayout(0, 0));
		
		mainPanel.add(mainViewPanel, "MainView");
		mainPanel.add(einnahmeViewPanel, "Einnahmen");
		mainPanel.add(ausgabeViewPanel, "Ausgaben");
		mainPanel.add(shortcutViewPanel, "Shortcut");
		mainPanel.add(settingsViewPanel, "Settings");	
		
		frame.setVisible(true);
	}

	public MainView getMainViewPanel() {
		return mainViewPanel;
	}


	public ShortcutView getShortcutViewPanel() {
		return shortcutViewPanel;
	}


	public Settings getSettingsViewPanel() {
		return settingsViewPanel;
	}


	public EinnahmenView getEinnahmeViewPanel() {
		return einnahmeViewPanel;
	}


	public AusgabenView getAusgabeViewPanel() {
		return ausgabeViewPanel;
	}
}