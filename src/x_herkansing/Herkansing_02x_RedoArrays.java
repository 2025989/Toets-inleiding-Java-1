package x_herkansing;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Herkansing_02x_RedoArrays extends Applet {

	Label label = new Label("Voer een uur in: ");
	TextField input = new TextField("", 5);
	Button enter = new Button("Toon tijden");
	String[] cities = {"Londen!-1", "New York!-6", "Tokyo!+7", "Sydney!+9"};
	// Voeg hierboven een stad toe met "<stadsnaam>!<tijdsverschil>"
	String[] string = new String[cities.length];

	public void init() {
		setSize(275, 200+15*cities.length);
		add(label);
		add(input); input.addActionListener(new InputListener());
		add(enter); enter.addActionListener(new InputListener());
		for (int i = 0; i < cities.length; i++) {string[i] = "";}
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();

		for (int i = 0; i < cities.length; i++) {
			g.drawString(""+ string[i], x/2-75, (y/2-15*cities.length/2)+15*i);
		}
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int inputInt = Integer.parseInt(input.getText());
			int[] time = new int[cities.length];
			if ((inputInt >= 0) && (inputInt <= 23)) {
				for (int i = 0; i < cities.length; i++) {
					time[i] = Integer.parseInt(cities[i].split("!")[1]) + inputInt;
					if (time[i] < 00) {time[i] += 24;}
					if (time[i] > 23) {time[i] -= 24;}
					string[i] = "Tijd in "+ cities[i].split("!")[0] +": "+ time[i] +":00";
					input.setText("");
					repaint();
				}
			}	
		}
	}
	
}