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

public class ViewHandler extends JFrame{

	private JPanel mainPanel;
	private MainView mainViewPanel = new MainView(this);
	private ShortcutView shortcutViewPanel = new ShortcutView(this);
	private Settings settingsViewPanel = new Settings(this);
	private EinnahmenView einnahmeViewPanel = new EinnahmenView(this);
	private AusgabenView ausgabeViewPanel = new AusgabenView(this);
	
	/**
	 * Create the application.
	 */
	public ViewHandler() {
		
		this.getContentPane().setBackground(Color.WHITE);
		this.setBounds(100, 100, 505, 502);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setLayout(new CardLayout(0, 0));
		
		mainPanel = new JPanel();
		mainPanel.setBackground(Farben.getDefaultBackgroundcolor());
		this.getContentPane().add(mainPanel, "name_4264670569464");
		mainPanel.setLayout(new CardLayout(0, 0));
		
		
		mainPanel.add(mainViewPanel, "MainView");
		mainPanel.add(einnahmeViewPanel, "Einnahmen");
		mainPanel.add(ausgabeViewPanel, "Ausgaben");
		mainPanel.add(shortcutViewPanel, "Shortcut");
		mainPanel.add(settingsViewPanel, "Einstellungen");	
		
		this.setVisible(true);
	}

	public MainView getMainViewPanel() {
		return this.mainViewPanel;
	}


	public ShortcutView getShortcutViewPanel() {
		return this.shortcutViewPanel;
	}


	public Settings getSettingsViewPanel() {
		return this.settingsViewPanel;
	}


	public EinnahmenView getEinnahmeViewPanel() {
		return this.einnahmeViewPanel;
	}


	public AusgabenView getAusgabeViewPanel() {
		return this.ausgabeViewPanel;
	}

	public JPanel getMainPanel() {
		return this.mainPanel;
	}
}