/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package design;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.*;

import view.RoundedBorder;

public class Rahmen {
	
	public static Border defaultBorder = BorderFactory.createLineBorder(Color.lightGray);
	public static Border roundedBorder = new RoundedBorder(10);
}
