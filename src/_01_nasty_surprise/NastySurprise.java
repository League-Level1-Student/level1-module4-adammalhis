package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class NastySurprise implements ActionListener{
	
	JFrame frame= new JFrame();
	JLabel label= new JLabel();
	JButton button1= new JButton();
	JButton button2= new JButton();
	private ActionEvent ActionEvent;
	
	
	public void Framething() {
		
		button1.setText("Trick");
		button2.setText("Treat");
		button1.addActionListener(this);
		button2.addActionListener(this);
		frame.add(label);
		label.add(button1);
		label.add(button2);
		frame.setVisible(true);
		frame.pack();
		
	}
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == button1) {
			
			JOptionPane.showMessageDialog(null, "https://i.pinimg.com/originals/e6/3d/2c/e63d2c80d0603f41f9455a5389694fae.jpg");
			
		}
		
		else {
			
			JOptionPane.showMessageDialog(null, "https://images.squarespace-cdn.com/content/v1/5b3a59f93e2d0904012f9010/1596741556321-OQT1G3ORREMG55RG478L/ke17ZwdGBToddI8pDm48kNiSItaeTwM1Dat9071ipL17gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1UbobqQwvhm4R9t-pl4OuuR043I8olIWYlJx7gpZYBriIELQUv11dQuHZj93ZCN1-8g/Nun.jpg?format=2500w");
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	
}
