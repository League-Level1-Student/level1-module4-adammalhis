package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener{
	
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton button1= new JButton();
	JButton button2= new JButton();
	
	
	
	public void run() {
		
		button1.setText("Trick");
		button1.setVisible(true);
		button1.addActionListener(this);
		button2.setText("Treat");
		button2.setVisible(true);
		button2.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.setVisible(true);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	

	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == button1) {
			
			showPictureFromTheInternet("https://i.pinimg.com/originals/e6/3d/2c/e63d2c80d0603f41f9455a5389694fae.jpg");
				
		}
		
		else {
			showPictureFromTheInternet("https://images.squarespace-cdn.com/content/v1/5b3a59f93e2d0904012f9010/1596741556321-OQT1G3ORREMG55RG478L/ke17ZwdGBToddI8pDm48kNiSItaeTwM1Dat9071ipL17gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1UbobqQwvhm4R9t-pl4OuuR043I8olIWYlJx7gpZYBriIELQUv11dQuHZj93ZCN1-8g/Nun.jpg?format=2500w");
			
		}
		
	}
	
	
	
	
	
	
	
	
	
}
