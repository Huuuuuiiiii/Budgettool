/*
 * Copyright 2016 Coop, Informatik / Internet Entwicklung.
 * Use is subject to license terms.
 */

package view;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.border.*;

public class RoundedBorder implements Border {

    private int radius;


    public RoundedBorder(int radius) {
        this.radius = radius;
    }

    public boolean isBorderOpaque() {
        return true;
    }

	@Override
	public Insets getBorderInsets(java.awt.Component c){
		return new Insets(0, this.radius/2, 0, this.radius/2);
	}


	@Override
	public void paintBorder(java.awt.Component c, java.awt.Graphics g, int x, int y, int width, int height) {
		g.setColor(Color.lightGray);
		g.drawRoundRect(x, y, width-1, height-1, radius, radius);
	}
}
