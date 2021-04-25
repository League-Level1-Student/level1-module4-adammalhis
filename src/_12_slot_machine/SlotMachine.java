package _12_slot_machine;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Random bob = new Random();
	JButton button= new JButton();
	
	int[] x = new int[3];

	void machine() {
		panel.removeAll();
		frame.add(panel);
		button= new JButton();
		panel.add(button);
		frame.setVisible(true);
		button.setText("SPIN!!!");
		button.addActionListener(this);
	
		for (int i = 0; i < 3; i++) {
			
			
			x[i] = bob.nextInt(3);
			System.out.println(x[i]);
			
			if (x[i] == 0) {
				JLabel label = createLabelImage("cherrypicture.jpg");
				panel.add(label);
			}
			if (x[i] == 1) {
				JLabel label = createLabelImage("limeFruit.jpg");
				panel.add(label);

			}
			if (x[i] == 2) {
				JLabel label = createLabelImage("OrangeFruit.jpg");
				panel.add(label);
			}
			
			frame.pack();
			
		}
		
			if (x[1]==x[2]&&x[0]==x[2]) {
				JOptionPane.showMessageDialog(frame, "YOU WIN");
			}
			
		
		
	}

	private JLabel createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		imageLabel.setPreferredSize(new Dimension(150, 150));
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		machine();
		
		
		
		
		
	}

}
