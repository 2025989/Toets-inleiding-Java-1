package x_herkansing;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Herkansing_02x_Redo extends Applet {

	Label label = new Label("Voer een uur in: ");
	TextField input = new TextField("", 5);
	Button enter = new Button("Toon tijden");
	int timeLonden = 0;
	int timeNewYork = 0;
	int timeTokyo = 0;
	int timeSydney = 0;
	String stringLonden = "";
	String stringNewYork = "";
	String stringTokyo = "";
	String stringSydney = "";
	
	public void init() {
		setSize(275, 250);
		add(label);
		add(input); input.addActionListener(new InputListener());
		add(enter); enter.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();

		g.drawString(""+ stringLonden, x/2-75, y/2-35);
		g.drawString(""+ stringNewYork, x/2-75, y/2-20);
		g.drawString(""+ stringTokyo, x/2-75, y/2-5);
		g.drawString(""+ stringSydney, x/2-75, y/2+10);
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int inputInt = Integer.parseInt(input.getText());
			if ((inputInt >= 0) && (inputInt <= 23)) {
				timeLonden = inputInt-1;
				if (timeLonden < 0) {
					timeLonden += 24;
				}
				if (timeLonden > 23) {
					timeLonden -= 24;
				}
				stringLonden = "Tijd in Londen: "+ timeLonden +":00 uur";
				
				timeNewYork = inputInt-6;
				if (timeNewYork < 0) {
					timeNewYork += 24;
				}
				if (timeNewYork > 23) {
					timeNewYork -= 24;
				}
				stringNewYork = "Tijd in New York: "+ timeNewYork +":00 uur";				
				
				timeTokyo = inputInt+7;
				if (timeTokyo < 0) {
					timeTokyo += 24;
				}
				if (timeTokyo > 23) {
					timeTokyo -= 24;
				}
				stringTokyo = "Tijd in Tokyo: "+ timeTokyo +":00 uur";
				
				timeSydney = inputInt+9;
				if (timeSydney < 0) {
					timeSydney += 24;
				}
				if (timeSydney > 23) {
					timeSydney -= 24;
				}
				stringSydney = "Tijd in Sydney: "+ timeSydney +":00 uur";
			}
			input.setText("");
			repaint();
		}
	}
	
}