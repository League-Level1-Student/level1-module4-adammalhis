package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTuter implements KeyListener {


	char currentLetter;
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JLabel label= new JLabel();
	boolean correctKey;
	
	
	
	public static void main(String[] args) {
		
		
		
		new TypingTuter().setup();
		
	
		
	}
	
	char generateRandomLetter() {
	    Random r = new Random();
	    return (char) (r.nextInt(26) + 'a');
	}
	
	void setup() {

		
		
		
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		
		frame.setVisible(true);
		labelThing();
		
	
		
	}
	
	void labelThing() {
		currentLetter = generateRandomLetter(); 
		label.setText(currentLetter+"");
		frame.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You pressed: " + e.getKeyChar());
		if (currentLetter == e.getKeyChar()) {
			System.out.println("CORRECT");
			panel.setBackground(Color.GREEN);
		}
		else {
			System.out.println("INCORRECT");
			panel.setBackground(Color.RED);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		labelThing();
	}
	
	
	
	
	
}
