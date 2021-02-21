package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame frame= new JFrame();
	JPanel panel= new JPanel();
	JButton button1= new JButton();
	JButton button2= new JButton();
	public static void main(String[] args) {
		new ChuckleClicker().makeButtons();
	}
	void makeButtons() {
		button1.setText("Joke");
		button2.setText("Punchline");
		button1.setVisible(true);
		button1.addActionListener(this);
		button2.setVisible(true);
		button2.addActionListener(this);
		panel.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.setVisible(true);
		frame.setLocation(800, 450);
		frame.pack();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "hi");
		if (e.getSource()==button1) {
			JOptionPane.showMessageDialog(null, "this is very funny because it's a joke.");
		}
		else if (e.getSource()==button2) {
			JOptionPane.showMessageDialog(null, "punchline");
		}
	}
	
}
