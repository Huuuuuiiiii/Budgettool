package diagramm;
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class Kreisdiagramm extends JComponent {
	private Diagramm[] slices;
	
	public Kreisdiagramm(double ausgaben, double restbetrag) {
		Diagramm[] slices = { 
				new Diagramm(ausgaben, new Color(248, 69, 69)), 
				new Diagramm(restbetrag, new Color(45, 203, 112))
		};
		this.slices = slices;
	}
   
	public void paint(Graphics g) {
		drawPie((Graphics2D) g, getBounds(), slices);
	}
   
	private void drawPie(Graphics2D g, Rectangle area, Diagramm[] slices) {
		double total = 0.0;
		for (int i = 0; i < slices.length; i++) {
			total += slices[i].getValue();
		}
		double curValue = 0.0D;
		int startAngle = 0;
		int grösse;
		for (int i = 0; i < slices.length; i++) {
			startAngle = (int) (curValue * 360 / total);
			int arcAngle = (int) (slices[i].getValue() * 360 / total);
			g.setColor(slices[i].getColor());
			if (area.width <= area.height){
				grösse = area.width -30;
			}else 
				grösse = area.height -30;
			g.fillArc((area.width - grösse)/2, (area.height - grösse)/2, grösse, grösse, startAngle, arcAngle);
			System.out.println((area.x + grösse)/2);
			curValue += slices[i].getValue();
		}
	}
}