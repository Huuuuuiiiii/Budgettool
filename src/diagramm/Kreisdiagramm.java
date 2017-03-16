package diagramm;
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Kreisdiagramm extends JComponent {
	private Winkel[] slices;
	
	public Kreisdiagramm(double ausgaben, double restbetrag) {
		Winkel[] slices = { 
				new Winkel(ausgaben, new Color(248, 69, 69)), 
				new Winkel(restbetrag, new Color(45, 203, 112))
		};
		this.slices = slices;
	}
   
	public void paint(Graphics g) {
		drawPie((Graphics2D) g, getBounds(), slices);
	}
   
	private void drawPie(Graphics2D g, Rectangle area, Winkel[] slices) {
		double total = 0.0;
		double curValue = 0.0;
		int startAngle = 0;
		int groesse;
		
		if (area.width <= area.height){
			groesse = area.width -30;
		}else 
			groesse = area.height -30;
		
		for (int i = 0; i < slices.length; i++) {
			total += slices[i].getValue();
		}
		for (int i = 0; i < slices.length; i++) {
			startAngle = (int) (360 * curValue / total);
			int arcAngle = (int) (slices[i].getValue() * 360 / total);
			g.setColor(slices[i].getColor());
			g.fillArc((area.width - groesse)/2, (area.height - groesse)/2, groesse, groesse, startAngle, arcAngle);
			curValue += slices[i].getValue();
		}
	}
}