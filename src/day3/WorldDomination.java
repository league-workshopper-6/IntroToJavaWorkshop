package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		String code = JOptionPane
				.showInputDialog("Do you know how to write code?");
		// 1. Ask the user if they know how to write code.

		// 2. If they say "yes", tell them they will rule the world.
		if (code.equals("yes")) {
			JOptionPane.showMessageDialog(null,
					"Yippe.");
		} 
		else if(code.equals("maybe")){
			//JOptionPane.showog(messag)
		}
		else {
			JOptionPane.showMessageDialog(null, "Good Luck washing dishes!!");
		}
		// 3. Otherwise, wish them good luck washing dishes.

	}
}
