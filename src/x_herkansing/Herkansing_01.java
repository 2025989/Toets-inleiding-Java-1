package x_herkansing;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Herkansing_01 extends Applet {

	int fooi = 15;
	String fooiString = "";
	String bedragString = "";
	Label bedragLabel = new Label("Rekening bedrag");
	TextField input = new TextField("", 5);
	Label fooiLabel = new Label("Percentage fooi");
	Label percFooi = new Label("15%");
	Button plus = new Button("+");
	Button min = new Button("-");
	Button enter = new Button("Enter");
	double inputSave = 0;
	String inputSaveString = "";
	
	public void init() {
		setSize(225, 200);
		add(bedragLabel);
		add(input); input.addActionListener(new InputListener());
		add(fooiLabel);
		add(percFooi);
		add(plus); plus.addActionListener(new PlusListener());
		add(min); min.addActionListener(new MinListener());
		add(enter); enter.addActionListener(new InputListener());
	}
	
	public void paint(Graphics g) {
		int x = getWidth();
		int y = getHeight();
		
		percFooi.setText(fooi +"%");
		g.drawString(""+ inputSaveString, x/2-35, y/2+30);
		g.drawString(""+ fooiString, x/2-25, y/2+45);
		g.drawString(""+ bedragString, x/2-70, y/2+60);
	}
	
	class PlusListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			fooi++;
			if ((inputSave*fooi/100) == (int) (inputSave*fooi/100)) {
				fooiString = "Fooi: € " + String.format("%.0f", (inputSave*fooi/100)) +",-";
			} else {
				fooiString = "Fooi: € " + String.format("%.2f", (inputSave*fooi/100));
			}
			if ((inputSave*fooi/100) == (int) (inputSave*fooi/100)) {
				bedragString = "Totaal incl fooi ("+ fooi +"%): "+ String.format("%.0f", (inputSave+inputSave*fooi/100)) +",-";
			} else {
				bedragString = "Totaal incl fooi ("+ fooi +"%): "+ String.format("%.2f", (inputSave+inputSave*fooi/100));
			}
			input.setText("");
			input.requestFocus();
			repaint();
		}
	}
	
	class MinListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (fooi > 0) {
				fooi--;
				if ((inputSave*fooi/100) == (int) (inputSave*fooi/100)) {
					fooiString = "Fooi: € " + String.format("%.0f", (inputSave*fooi/100)) +",-";
				} else {
					fooiString = "Fooi: € " + String.format("%.2f", (inputSave*fooi/100));
				}
				if ((inputSave*fooi/100) == (int) (inputSave*fooi/100)) {
					bedragString = "Totaal incl fooi ("+ fooi +"%): "+ String.format("%.0f", (inputSave+inputSave*fooi/100)) +",-";
				} else {
					bedragString = "Totaal incl fooi ("+ fooi +"%): "+ String.format("%.2f", (inputSave+inputSave*fooi/100));
				}
				input.setText("");
				input.requestFocus();
				repaint();
			}
		}
	}
	
	class InputListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			inputSave = Double.parseDouble(input.getText());
			if (inputSave == (int) inputSave) {
				inputSaveString = "Subtotaal: € "+ String.format("%.0f", inputSave) +",-";
			} else {
				inputSaveString = "Subtotaal: € "+ String.format("%.2f", inputSave);
			}
			if ((inputSave*fooi/100) == (int) (inputSave*fooi/100)) {
				fooiString = "Fooi: € " + String.format("%.0f", (inputSave*fooi/100)) +",-";
			} else {
				fooiString = "Fooi: € " + String.format("%.2f", (inputSave*fooi/100));
			}
			if ((inputSave*fooi/100) == (int) (inputSave*fooi/100)) {
				bedragString = "Totaal incl. fooi ("+ fooi +"%): € "+ String.format("%.0f", (inputSave+inputSave*fooi/100)) +",-";
			} else {
				bedragString = "Totaal incl. fooi ("+ fooi +"%): € "+ String.format("%.2f", (inputSave+inputSave*fooi/100));
			}
			input.setText("");
			input.requestFocus();
			repaint();
		}
	}
	
}