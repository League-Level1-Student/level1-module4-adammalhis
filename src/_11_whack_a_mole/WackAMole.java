package _11_whack_a_mole;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WackAMole implements ActionListener {

	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	Random bob= new Random();
	int bob2;
	JButton[] buttons= new JButton[24];
	int buttonNumber;
	
	
	
	void mole() {
		bob2= bob.nextInt(24);
		panel.removeAll();
		frame.add(panel);
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(300, 500));
		drawButtons(bob2);
	
		
		
		
	}
	
	void drawButtons(int x) {
		for (int i=0; i<24; i++) {
			
			buttons[i]= new JButton();
			buttons[i].setPreferredSize(new Dimension(90, 45));
			buttons[i].addActionListener(this);
			if (i==x ) {
				buttons[i].setText("mole");
			}
			panel.add(buttons[i]);
			
			
		}
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() != buttons[bob2]) {
			speak("missed");
			buttonNumber= buttonNumber + 1;
		}
		if (buttonNumber==10) {
			speak("YOU LOOSE!");
		}
		frame.dispose();
		mole();
	}	
	
	
	
	
	
	
	 static void speak(String words) {
	        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
	            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
	                    + words + "');\"";
	            try {
	                Runtime.getRuntime().exec( cmd ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        } else {
	            try {
	                Runtime.getRuntime().exec( "say " + words ).waitFor();
	            } catch( Exception e ) {
	                e.printStackTrace();
	            }
	        }
	    }

}
