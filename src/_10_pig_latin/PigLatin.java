package _10_pig_latin;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin {

	
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JTextField textframe= new JTextField(20);
	JTextField textframe2= new JTextField(20);
	JButton button= new JButton();
	
	
	void oink() {
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(textframe);
		panel.add(textframe2);
		panel.add(button);
		button.setText("translate");
		frame.pack();
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
