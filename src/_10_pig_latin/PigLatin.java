package _10_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatin implements ActionListener{

	
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
		button.addActionListener(this);
		
		
		
		
		
		
	}
	/**
	* Method to test whether a character is a letter or not.
	* @param c The character to test
	* @return True if it's a letter
	*/
	private static boolean isLetter(char c) {
	return ( (c >= 'A' && c <= 'Z') || (c >='a' && c <= 'z') );
	}
	    
	/**
	* Method to translate one word into pig latin.
	* @param word The word in english
	* @return The pig latin version
	*/
	private static String pigWord(String word) {
	int split = firstVowel(word);
	return word.substring(split)+"-"+word.substring(0, split)+"ay";
	}
		
	/**
	* Method to translate a sentence word by word.
	* @param s The sentence in English
	* @return The pig latin version
	*/
	public String translate(String s) {
	String latin = "";
	int i = 0;
	while (i < s.length()) {
	// Take care of punctuation and spaces
	while (i < s.length() && !isLetter(s.charAt(i))) {
	latin = latin + s.charAt(i);
	i++;
	}
	// If there aren't any words left, stop.
	if (i>=s.length()) break;
	// Otherwise we're at the beginning of a word.
	int begin = i;
	while (i < s.length() && isLetter(s.charAt(i))) {
	i++;
	}
	// Now we're at the end of a word, so translate it.
	int end = i;
	latin = latin + pigWord(s.substring(begin, end));
	}
	return latin;
	}
	/**
	* Method to find the index of the first vowel in a word.
	* @param word The word to search
	* @return The index of the first vowel
	*/
		  private static int firstVowel(String word) {
	word = word.toLowerCase();
	for (int i=0; i < word.length(); i++)
	if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
	word.charAt(i)=='i' || word.charAt(i)=='o' ||
	word.charAt(i)=='u')
	return i;
	return 0;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
String texttextFrame= textframe.getText();
		String textthing= translate(texttextFrame);
		textframe2.setText(textthing);
		
		
		
		
		
		
	}
	
	
	

	
	
	
	
	
	
}
