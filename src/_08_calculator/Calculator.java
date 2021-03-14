package _08_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

	
	
	
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JLabel label= new JLabel();
	JTextField textField1= new JTextField();
	JTextField textField2= new JTextField();
	JButton button1= new JButton();
	JButton button2= new JButton();
	JButton button3= new JButton();
	JButton button4=new JButton();
	
	
	public void calculate() {
		
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button1);
		button1.setText("add");
		button1.addActionListener(this);
		panel.add(button2);
		button2.setText("sub");
		button2.addActionListener(this);
		panel.add(button3);
		button3.setText("mul");
		button3.addActionListener(this);
		panel.add(button4);
		button4.setText("div");
		button4.addActionListener(this);
		panel.add(textField1);
		panel.add(textField2);
		frame.pack();
		
		
		textField1.toString();
		number1= Integer.parseInt(textField1);
		textField2.toString();
		number2= Integer.parseInt(textField2);
		
		
		
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

	
}
