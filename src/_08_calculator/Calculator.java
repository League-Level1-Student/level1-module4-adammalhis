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
	JTextField textField1= new JTextField(20);
	JTextField textField2= new JTextField(20);
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
		panel.add(label);
		frame.pack();
		
		
		
		
		
		
		
		
		
		
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (button1 == e.getSource()) {
			String Stext= textField1.getText();
			String Stext2= textField2.getText();
			int text1= Integer.parseInt(Stext);
			int text2= Integer.parseInt(Stext2);
			int sum= text1+ text2;
			label.setText("sum: " + sum);
			frame.pack();
		}
		else if (button2 == e.getSource()) {
			String Stext= textField1.getText();
			String Stext2= textField2.getText();
			int text1= Integer.parseInt(Stext);
			int text2= Integer.parseInt(Stext2);
			int difference= text1- text2;
			label.setText("difference: " + difference);
			frame.pack();
			
			
		}
		else if (button3 == e.getSource()) {
			String Stext= textField1.getText();
			String Stext2= textField2.getText();
			int text1= Integer.parseInt(Stext);
			int text2= Integer.parseInt(Stext2);
			int product= text1* text2;
			label.setText("product: " + product);
			frame.pack();
			
		}
		else if (button4 == e.getSource()) {
			String Stext= textField1.getText();
			String Stext2= textField2.getText();
			int text1= Integer.parseInt(Stext);
			int text2= Integer.parseInt(Stext2);
			int quotent= text1/ text2;
			label.setText("quotent: " + quotent);
			frame.pack();
			
		}
		
		
	}
	
	
	
	
	

	
}
