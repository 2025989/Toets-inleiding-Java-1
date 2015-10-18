package x_herkansing;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Herkansing_02 extends Applet {

	Label label = new Label("Voer een uur in: ");
	TextField input = new TextField("", 5);
	Button enter = new Button("Toon tijden");
	String timeLonden = "";
	String timeNewYork = "";
	String timeTokyo = "";
	String timeSydney = "";
	
	public void init() {
		setSize(275, 250);
		add(label);
		add(input); input.addActionListener(new InputListener());
		add(enter); enter.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();

		g.drawString(""+ timeLonden, x/2-75, y/2-35);
		g.drawString(""+ timeNewYork, x/2-75, y/2-20);
		g.drawString(""+ timeTokyo, x/2-75, y/2-5);
		g.drawString(""+ timeSydney, x/2-75, y/2+10);
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			switch (Integer.parseInt(input.getText())) {
				case 0:
					timeLonden = "Tijd in Londen: 23:00 uur";
					timeNewYork = "Tijd in New York: 18:00 uur";
					timeTokyo = "Tijd in Tokyo: 7:00 uur";
					timeSydney = "Tijd in Sydney: 9:00 uur";
				break;
				case 1:
					timeLonden = "Tijd in Londen: 0:00 uur";
					timeNewYork = "Tijd in New York: 19:00 uur";
					timeTokyo = "Tijd in Tokyo: 8:00 uur";
					timeSydney = "Tijd in Sydney: 10:00 uur";
				break;
				case 2:
					timeLonden = "Tijd in Londen: 1:00 uur";
					timeNewYork = "Tijd in New York: 20:00 uur";
					timeTokyo = "Tijd in Tokyo: 9:00 uur";
					timeSydney = "Tijd in Sydney: 11:00 uur";
				break;
				case 3:
					timeLonden = "Tijd in Londen: 2:00 uur";
					timeNewYork = "Tijd in New York: 21:00 uur";
					timeTokyo = "Tijd in Tokyo: 10:00 uur";
					timeSydney = "Tijd in Sydney: 12:00 uur";
				break;
				case 4:
					timeLonden = "Tijd in Londen: 3:00 uur";
					timeNewYork = "Tijd in New York: 22:00 uur";
					timeTokyo = "Tijd in Tokyo: 11:00 uur";
					timeSydney = "Tijd in Sydney: 13:00 uur";
				break;
				case 5:
					timeLonden = "Tijd in Londen: 4:00 uur";
					timeNewYork = "Tijd in New York: 23:00 uur";
					timeTokyo = "Tijd in Tokyo: 12:00 uur";
					timeSydney = "Tijd in Sydney: 14:00 uur";
				break;
				case 6:
					timeLonden = "Tijd in Londen: 5:00 uur";
					timeNewYork = "Tijd in New York: 0:00 uur";
					timeTokyo = "Tijd in Tokyo: 13:00 uur";
					timeSydney = "Tijd in Sydney: 15:00 uur";
				break;
				case 7:
					timeLonden = "Tijd in Londen: 6:00 uur";
					timeNewYork = "Tijd in New York: 1:00 uur";
					timeTokyo = "Tijd in Tokyo: 14:00 uur";
					timeSydney = "Tijd in Sydney: 16:00 uur";
				break;
				case 8:
					timeLonden = "Tijd in Londen: 7:00 uur";
					timeNewYork = "Tijd in New York: 2:00 uur";
					timeTokyo = "Tijd in Tokyo: 15:00 uur";
					timeSydney = "Tijd in Sydney: 17:00 uur";
				break;
				case 9:
					timeLonden = "Tijd in Londen: 8:00 uur";
					timeNewYork = "Tijd in New York: 3:00 uur";
					timeTokyo = "Tijd in Tokyo: 16:00 uur";
					timeSydney = "Tijd in Sydney: 18:00 uur";
				break;
				case 10:
					timeLonden = "Tijd in Londen: 9:00 uur";
					timeNewYork = "Tijd in New York: 4:00 uur";
					timeTokyo = "Tijd in Tokyo: 17:00 uur";
					timeSydney = "Tijd in Sydney: 19:00 uur";
				break;
				case 11:
					timeLonden = "Tijd in Londen: 10:00 uur";
					timeNewYork = "Tijd in New York: 5:00 uur";
					timeTokyo = "Tijd in Tokyo: 18:00 uur";
					timeSydney = "Tijd in Sydney: 20:00 uur";
				break;
				case 12:
					timeLonden = "Tijd in Londen: 11:00 uur";
					timeNewYork = "Tijd in New York: 6:00 uur";
					timeTokyo = "Tijd in Tokyo: 19:00 uur";
					timeSydney = "Tijd in Sydney: 21:00 uur";
				break;
				case 13:
					timeLonden = "Tijd in Londen: 12:00 uur";
					timeNewYork = "Tijd in New York: 7:00 uur";
					timeTokyo = "Tijd in Tokyo: 20:00 uur";
					timeSydney = "Tijd in Sydney: 22:00 uur";
				break;
				case 14:
					timeLonden = "Tijd in Londen: 13:00 uur";
					timeNewYork = "Tijd in New York: 8:00 uur";
					timeTokyo = "Tijd in Tokyo: 21:00 uur";
					timeSydney = "Tijd in Sydney: 23:00 uur";
				break;
				case 15:
					timeLonden = "Tijd in Londen: 14:00 uur";
					timeNewYork = "Tijd in New York: 9:00 uur";
					timeTokyo = "Tijd in Tokyo: 22:00 uur";
					timeSydney = "Tijd in Sydney: 0:00 uur";
				break;
				case 16:
					timeLonden = "Tijd in Londen: 15:00 uur";
					timeNewYork = "Tijd in New York: 10:00 uur";
					timeTokyo = "Tijd in Tokyo: 23:00 uur";
					timeSydney = "Tijd in Sydney: 1:00 uur";
				break;
				case 17:
					timeLonden = "Tijd in Londen: 16:00 uur";
					timeNewYork = "Tijd in New York: 11:00 uur";
					timeTokyo = "Tijd in Tokyo: 0:00 uur";
					timeSydney = "Tijd in Sydney: 2:00 uur";
				break;
				case 18:
					timeLonden = "Tijd in Londen: 17:00 uur";
					timeNewYork = "Tijd in New York: 12:00 uur";
					timeTokyo = "Tijd in Tokyo: 1:00 uur";
					timeSydney = "Tijd in Sydney: 3:00 uur";
				break;
				case 19:
					timeLonden = "Tijd in Londen: 18:00 uur";
					timeNewYork = "Tijd in New York: 13:00 uur";
					timeTokyo = "Tijd in Tokyo: 2:00 uur";
					timeSydney = "Tijd in Sydney: 4:00 uur";
				break;
					case 20:
					timeLonden = "Tijd in Londen: 19:00 uur";
					timeNewYork = "Tijd in New York: 14:00 uur";
					timeTokyo = "Tijd in Tokyo: 3:00 uur";
					timeSydney = "Tijd in Sydney: 5:00 uur";
				break;
				case 21:
					timeLonden = "Tijd in Londen: 20:00 uur";
					timeNewYork = "Tijd in New York: 15:00 uur";
					timeTokyo = "Tijd in Tokyo: 4:00 uur";
						timeSydney = "Tijd in Sydney: 6:00 uur";
				break;
				case 22:
					timeLonden = "Tijd in Londen: 21:00 uur";
					timeNewYork = "Tijd in New York: 16:00 uur";
					timeTokyo = "Tijd in Tokyo: 5:00 uur";
					timeSydney = "Tijd in Sydney: 7:00 uur";
				break;
				case 23:
					timeLonden = "Tijd in Londen: 22:00 uur";
					timeNewYork = "Tijd in New York: 17:00 uur";
					timeTokyo = "Tijd in Tokyo: 6:00 uur";
					timeSydney = "Tijd in Sydney: 8:00 uur";
				break;
				default:
				break;
			}
			input.setText("");
			repaint();
		}
	}
	
}