package day3;

import javax.swing.JOptionPane;

public class Adress {
	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Welcome...");
		String Adress = JOptionPane.showInputDialog("What is your Adress?");
		String Live = JOptionPane.showInputDialog("Where do you live?");
		String Email = JOptionPane.showInputDialog("What is your email?");
		JOptionPane.showMessageDialog(null, "I know your adress, is " + Adress
				+ " I know you live in " + Live + " and, I know your email: "
				+ Email + " Be careful!");
	}
}
