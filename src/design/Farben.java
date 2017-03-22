/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package design;

import java.awt.Color;
import java.awt.Font;

public class Farben {

	private static Color defaultBackgroundcolor;
	private static Color defaultFontcolor;
	private static boolean darkdesign = false;

	/**
	 * reteun whether darkdesign is aktive or not
	 * 
	 * @return Darkdesign
	 */
	public static boolean isDarkdesign() {
		return darkdesign;
	}

	/**
	 * Change the design from Normal to Dark and the other way around.
	 */
	public static void setDarkdesign(boolean darkdesign) {
		Farben.darkdesign = darkdesign;
	}

	/**
	 * Return the color of the Background with take darkdesign into account
	 * 
	 * @return Backgroundcolor
	 */
	public static Color getDefaultBackgroundcolor() {
		if (darkdesign) {
			setDefaultBackgroundcolor(Color.darkGray);
		} else {
			setDefaultBackgroundcolor(Color.WHITE);
		}
		return defaultBackgroundcolor;
	}

	private static void setDefaultBackgroundcolor(Color Backgroundcolor) {
		defaultBackgroundcolor = Backgroundcolor;
	}

	/**
	 * Return the color of Font with take darkdesign into account
	 * 
	 * @return Font
	 */
	public static Color getDefaultFontcolor() {
		if (darkdesign) {
			setDefaultFontcolor(Color.WHITE);
		} else {
			setDefaultFontcolor(Color.BLACK);
		}
		return defaultFontcolor;
	}

	private static void setDefaultFontcolor(Color Fontcolor) {
		defaultFontcolor = Fontcolor;
	}
}
