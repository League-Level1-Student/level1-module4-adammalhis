package _05_typing_tutor;

import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingTuter {


	char currentLetter;
	
	
	public static void main(String[] args) {
		
		
		
		new TypingTuter().setup();
		
		
		
		
		
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	
	void setup() {
		
		
		
		
		currentLetter = generateRandomLetter(); 
		
		JFrame frame= new JFrame();
		JPanel panel= new JPanel();
		JLabel label= new JLabel();
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setText(currentLetter+"");
		label.setVisible(true);
		panel.add(label);
		panel.setVisible(true);
		frame.add(panel);
		frame.setVisible(true);
		
		
		
		
		
		
	}
	
	
	
	
	
}
