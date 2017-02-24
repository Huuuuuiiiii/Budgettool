/*
 * Copyright 2017 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package diagramm;

import java.awt.Color;
import java.util.ArrayList;

public class Winkel {
	
	 private double value;
	 private Color color;
	 
	 public Winkel(Double value, Color color) {
		      this.value = value;
		      this.color = color;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
