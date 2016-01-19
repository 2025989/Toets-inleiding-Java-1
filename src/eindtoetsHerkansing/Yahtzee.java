package eindtoetsHerkansing;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Yahtzee Applet.
 */
public class Yahtzee extends Applet implements ActionListener {
	
	Image[] imgArray;
	int[] worp, telling;
	int highNum, points;
	String yahtzee, highest, score;
	AudioClip applause;
	Button button;
	
	/**
	 * Initializing method of the Applet.
	 */
	public void init() {
		setSize(640, 350);
		setFont(new Font("Arial", Font.PLAIN, 16));
		
		imgArray = new Image[5];
		worp = new int[imgArray.length];
		telling = new int[6];
		highNum = 0;
		points = 0;
		yahtzee = "";
		highest = "";
		score = "";
		applause = getAudioClip(getCodeBase(), "eindtoetsHerkansing/applaus.wav");
		
		button = new Button("Throw dice");
		button.addActionListener(this);
		add(button);
	}
	
	/**
	 * Draw things on screen.
	 * @param g Variable to refer to the Graphics.
	 */
	public void paint(Graphics g) {
		g.setFont(new Font("Arial", Font.BOLD, 16));
		int x = getWidth()/2;
		for (int i = -2; i <= 2; i++) {
			g.drawImage(imgArray[i+2], x-50+120*i, 75, 100, 100, this);
			g.drawString(yahtzee, x-35, 250);
			g.drawString(score, x-35, 275);
			g.drawString(highest, x-35, 300);
		}
	}
	
	/**
	 * ActionListener method. Performs the events of the ActionListener.
	 * @param e Variable to refer to the ActionEvent.
	 */
	public void actionPerformed(ActionEvent e) {
		points = 0;
		for (int i = 0; i < imgArray.length; i++) {
			worp[i] = (int)(Math.random()*6+1);
			
			//TESTCODE
			//worp[i] = 6;
			
			imgArray[i] = getImage(getCodeBase(), "eindtoetsHerkansing/img/dobbel"+worp[i]+".jpg");
			points += worp[i];
		}
		if (highNum < points) {
			highNum = points;
		}
		score = "Current score: "+points;
		highest = "High score: "+highNum;
		tel();
		analyseer();
		repaint();
	}
	
	/**
	 * Count on how many dice a number occurs and save the results in int[] telling.
	 */
	public void tel() {
        for(int ogen = 1; ogen <= 6; ogen++) {
            telling[ogen-1] = getAantal(ogen, worp);
        }
    }
	
	/**
	 * Check what has been thrown. Change String yahtzee accordingly.
	 */
	public void analyseer() {
		if (getAantal(5, telling) == 1) {
			yahtzee = "Yahtzee";
			applause.play();
		}
		else if (getAantal(4, telling) == 1) {
			yahtzee = "Carré";
		}
		else if (getAantal(3, telling) == 1) {
			if (getAantal(2, telling) == 1) {
				yahtzee = "Full House";
			}
			else {
				yahtzee = "Three of a Kind";
			}
		}
		else if (getAantal(1, telling) == 5) {
			if (getAantal(1, worp) == 0 || getAantal(6, worp) == 0) {
				yahtzee = "Large Strait";
			}
			else if (getAantal(2, worp) == 0 || getAantal(5, worp) == 0) {
				yahtzee = "Small Strait";
			}
			else {
				yahtzee = "Nothing";
			}
		}
		else if (getAantal(1, telling) == 3) {
			if ((getAantal(5, worp) == 0 && getAantal(6, worp) == 0)
			|| (getAantal(1, worp) == 0 && getAantal(6, worp) == 0)
			|| (getAantal(1, worp) == 0 && getAantal(2, worp) == 0)) {
				yahtzee = "Small Strait";
			}
			else {
				yahtzee = "Nothing";
			}
		}
		else {
			yahtzee = "Nothing";
		}
	}
	
	/**
	 * Count the occurrences of int getal in int[] lijst.
	 * @param getal Number to count.
	 * @param lijst Array to use for counting.
	 * @return The amount of occurences of int getal.
	 */
	private int getAantal(int getal, int[] lijst) {
		int aantal = 0;
		for (int item : lijst) {
			if (item == getal) {
				aantal++;
			}
		}
		return aantal;
	}
	
}