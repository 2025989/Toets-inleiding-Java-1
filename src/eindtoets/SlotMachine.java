package eindtoets;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SlotMachine extends Applet {
	
	Button play = new Button("Speel");
	Button buy = new Button("Koop 10 kredietpunten");
	int credit = 10;
	String creditsWon = "";
	Image[] fruitImg = new Image[20];
	int fruitRandom1 = (int)(Math.random()*20);
	int fruitRandom2 = (int)(Math.random()*20);
	int fruitRandom3 = (int)(Math.random()*20);
	
	public void init() {
		setSize(500, 500);
		add(play);
		play.addActionListener(new PlayListener());
		add(buy);
		buy.addActionListener(new BuyListener());
		buy.setEnabled(false);
		for (int i = 0; i < fruitImg.length; i++) {
			fruitImg[i] = getImage(getCodeBase(), "eindtoets/fruitplaatjes/fruit_"+ (i+1) +".jpg");
		}
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		g.drawImage(fruitImg[fruitRandom1], x/2-100, 100, this);
		g.drawImage(fruitImg[fruitRandom2], x/2-29, 100, this);
		g.drawImage(fruitImg[fruitRandom3], x/2+42, 100, this);
		g.drawString("Krediet: "+ credit, x/2-100, 300);
		g.drawString(creditsWon, x/2-100, 325);
	}
	
	class PlayListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			fruitRandom1 = (int)(Math.random()*20);
			fruitRandom2 = (int)(Math.random()*20);
			fruitRandom3 = (int)(Math.random()*20);
			credit--;
			creditsWon = "";
			if (fruitRandom1 == fruitRandom2
			&& fruitRandom1 == fruitRandom3) {
				credit += 20;
				creditsWon = "Gewonnen: 20 punten!";
				AudioClip credits20 = getAudioClip(getCodeBase(), "eindtoets/20creditsWon.wav");
				credits20.play();
			}
			else if (fruitRandom1 == fruitRandom2
			|| fruitRandom2 == fruitRandom3
			|| fruitRandom3 == fruitRandom1) {
				credit += 4;
				creditsWon = "Gewonnen: 4 punten!";
				AudioClip credits4 = getAudioClip(getCodeBase(), "eindtoets/4creditsWon.wav");
				credits4.play();
			}
			if (credit == 0) {
				play.setEnabled(false);
				buy.setEnabled(true);
				buy.requestFocus();
			}
			repaint();
		}
	}
	
	class BuyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			credit = 10;
			play.setEnabled(true);
			buy.setEnabled(false);
			repaint();
		}
	}

}