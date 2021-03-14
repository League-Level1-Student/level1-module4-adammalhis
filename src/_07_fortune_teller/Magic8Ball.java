package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */


import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {
		
	
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		
		Random bob= new Random();
		int randomNumber= bob.nextInt(3);
		
		
	// 3. Print out this variable
		System.out.println(bob);
	// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog("Ask a question for the magic 8 ball.")
	// 5. If the random number is 0
		
	// -- tell the user "Yes"
		if (randomNumber == 0) {
			JOptionPane.showMessageDialog(null, "yes");
		}
	// 6. If the random number is 1
		
	// -- tell the user "No"
		else if (randomNumber == 1) {
			JOptionPane.showMessageDialog(null, "no");
		}
	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"
		else if (randomNumber == 2) {
			JOptionPane.showMessageDialog(null, "Maybe you should ask google");
		}
	// 8. If the random number is 3

	// -- write your own answer
		if (randomNumber == 3) {
			JOptionPane.showMessageDialog(null, "I don't care");
		}
	}
}
