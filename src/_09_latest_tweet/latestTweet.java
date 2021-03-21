package _09_latest_tweet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class latestTweet implements ActionListener {

	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JTextField textfield= new JTextField(20);	
	JButton button= new JButton();
	
	
	
	void tweet() {
		
		frame.setVisible(true);
		frame.setTitle("tweet thing");
		frame.add(panel);
		panel.add(textfield);
		panel.add(button);
		button.addActionListener(this);
		button.setText("search for tweet");
		frame.pack();
		
		
		
		
		
		
		
		
		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("tweet tweet");
		
		
		
		
		
	}
}
	