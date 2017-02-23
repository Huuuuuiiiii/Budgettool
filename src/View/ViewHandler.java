package View;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import Design.Farben;
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
	
		mainViewPanel.setMenuButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				settingsViewPanel.setVisible(true);
				mainViewPanel.setVisible(false);
			}
		});
		
		mainViewPanel.setAddShortcutButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shortcutViewPanel.setVisible(true);
				mainViewPanel.setVisible(false);
			}
		});
	
		mainViewPanel.setRemoveShortcutButtonctionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
			}
		});
	
			mainViewPanel.setPlusButtonActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainViewPanel.setVisible(false);
				einnahmeViewPanel.setVisible(true);
			}
		});
	
		mainViewPanel.setMinusButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainViewPanel.setVisible(false);
				ausgabeViewPanel.setVisible(true);
			}
		});
		mainPanel.add(mainViewPanel, "MainView");
	
	
		einnahmeViewPanel.setCancelButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainViewPanel.setVisible(true);
				einnahmeViewPanel.setVisible(false);
			}
		});
		einnahmeViewPanel.setAddButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		mainPanel.add(einnahmeViewPanel, "Einnahmen");
		
		
		ausgabeViewPanel.setCancelButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainViewPanel.setVisible(true);
				ausgabeViewPanel.setVisible(false);
			}
		});
		ausgabeViewPanel.setAddButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		mainPanel.add(ausgabeViewPanel, "Ausgaben");
		
		
		shortcutViewPanel.setCancelButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				shortcutViewPanel.setVisible(false);
				mainViewPanel.setVisible(true);
			}
		});
		shortcutViewPanel.setAddButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		mainPanel.add(shortcutViewPanel, "Shortcut");
		
		
		settingsViewPanel.setCancelButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				settingsViewPanel.setVisible(false);
				mainViewPanel.setVisible(true);	
				System.out.println(Farben.isDarkdesign());
				}
		});
		
		settingsViewPanel.setPersonButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		settingsViewPanel.setKategorieButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		settingsViewPanel.setSettingsViewButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				settingsViewPanel.getSettingsLayoutPanel().setVisible(true);
				settingsViewPanel.getSettingsAddPanel().setVisible(false);
				settingsViewPanel.getSettingsBudgetPanel().setVisible(false);
				settingsViewPanel.getSettingsAddButton().setSelected(false);
				settingsViewPanel.getSettingsBudgetButton().setSelected(false);
				settingsViewPanel.getSettingsViewButton().setSelected(true);
			}
		});
		
		settingsViewPanel.setSettingsAddButtonButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				settingsViewPanel.getSettingsLayoutPanel().setVisible(false);
				settingsViewPanel.getSettingsAddPanel().setVisible(true);
				settingsViewPanel.getSettingsBudgetPanel().setVisible(false);
				settingsViewPanel.getSettingsBudgetButton().setSelected(false);
				settingsViewPanel.getSettingsViewButton().setSelected(false);
				settingsViewPanel.getSettingsAddButton().setSelected(true);
				
			}
		});
		
		settingsViewPanel.setSettingsBudgetButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				settingsViewPanel.getSettingsLayoutPanel().setVisible(false);
				settingsViewPanel.getSettingsAddPanel().setVisible(false);
				settingsViewPanel.getSettingsBudgetPanel().setVisible(true);
				settingsViewPanel.getSettingsAddButton().setSelected(false);
				settingsViewPanel.getSettingsViewButton().setSelected(false);
				settingsViewPanel.getSettingsBudgetButton().setSelected(true);
			}
		});
		
		settingsViewPanel.setdarkdesignToggleButtonActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		mainPanel.add(settingsViewPanel, "Settings");
		
		frame.setVisible(true);
	}
}