package diagramm;
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Balkendiagramm extends JComponent {
	private Strecke[] slices;
	private int height = 40;

	public Balkendiagramm(double ausgaben, double restbetrag) {
		Strecke[] slices = { 
				new Strecke(ausgaben, new Color(248, 69, 69)), 
				new Strecke(restbetrag, new Color(45, 203, 112))
		};
		this.slices = slices;
	}
   
	public void paint(Graphics g) {
		drawRect((Graphics2D) g, getBounds(), slices);
	}
   
	private void drawRect(Graphics2D g, Rectangle area, Strecke[] slices) {
		double total = 0.0;
		int start = 0;
		int lenth = area.width;
		this.height = area.height;
		
		for (int i = 0; i < slices.length; i++) {
			total += slices[i].getValue();
		}
		for (int i = 0; i < slices.length; i++) {
			start = (int) (start * lenth / total);
			int arcAngle = (int) (slices[i].getValue() * lenth / total);
			g.setColor(slices[i].getColor());
			g.fillRect(area.x + start, area.y, arcAngle, this.height);
			start += slices[i].getValue();
		}
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}