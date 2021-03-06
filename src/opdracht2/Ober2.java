package opdracht2;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ober2 extends Applet {

	Button fris = new Button("Fris: �2,00");
	Button bier = new Button("Bier: �2,25");
	Button wijn = new Button("Wijn: �2,50");
	Button koffie = new Button("Koffie: �1,75");
	Button binDist = new Button("Binn. gedist.: �2,75");
	Button buitDist = new Button("Buit. gedist.: �3,50");
	Button newOrder = new Button("Nieuwe bestelling");
	double orderTotal = 0;
	double dailyTotal = 0;
	
	public void init() {
		setSize(800, 600);
		add(fris); fris.addActionListener(new FrisListener());
		add(bier); bier.addActionListener(new BierListener());
		add(wijn); wijn.addActionListener(new WijnListener());
		add(koffie); koffie.addActionListener(new KoffieListener());
		add(binDist); binDist.addActionListener(new BinDistListener());
		add(buitDist); buitDist.addActionListener(new BuitDistListener());
		add(newOrder); newOrder.addActionListener(new NewOrderListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
			g.drawString("Bestelling totaal: �"+ 
			(String.format("%.2f", orderTotal)), x/2-50, y/2-05);
			
			g.drawString("Totaal dagomzet: �"+ 
			(String.format("%.2f", dailyTotal)), x/2-50, y/2+10);

	}
	
	class FrisListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			orderTotal += 2.00;
			repaint();
		}
	}
	class BierListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			orderTotal += 2.25;
			repaint();
		}
	}
	class WijnListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			orderTotal += 2.50;
			repaint();
		}
	}
	class KoffieListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			orderTotal += 1.75;
			repaint();
		}
	}
	class BinDistListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			orderTotal += 2.75;
			repaint();
		}
	}
	class BuitDistListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			orderTotal += 3.50;
			repaint();
		}
	}
	class NewOrderListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			dailyTotal += orderTotal;
			orderTotal = 0;
			repaint();
		}
	}
	
}