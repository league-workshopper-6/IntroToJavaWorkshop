package day3;

import javax.swing.JOptionPane;

public class FromScratch {
public static void main(String[] args) {
	String answers = JOptionPane.showInputDialog("What is your name?");
	
	JOptionPane.showMessageDialog(null,answers+" is a good name!");
}
}
