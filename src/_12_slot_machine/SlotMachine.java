package _12_slot_machine;

import java.net.MalformedURLException;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine {

	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	Random bob= new Random();
	int x[];
	void machine() {
		frame.add(panel);
		frame.setVisible(true);
		for (int i=0; i<3; i++) {
		
			x[i]= bob.nextInt(3);
		
			if (x[i]==0) {
			createLabelImage("cherrypicture.jpg");
			
		}
		if (x[i]==1) {
		createLabelImage("limeFruit.jpg");
			
			
		}
		
		
		
		
		}
		
		
	}
	
	
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
		return new JLabel();
	}
	Icon icon = new ImageIcon(imageURL);
	JLabel imageLabel = new JLabel(icon);
	return imageLabel;
}
	
	
}
