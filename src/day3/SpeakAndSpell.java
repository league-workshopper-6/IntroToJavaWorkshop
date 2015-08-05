package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak &
 * Spell was introduced at the summer Consumer Electronics Show in June 1978,
 * making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you
 * would make this program. Allow them to code it themselves, or use this
 * recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		speak("Spell lollapalooza");
		String answer = JOptionPane.showInputDialog("Spell the spoken word.");
		if (answer.equals("lollapalooza")) {
			speak("correct");
		} else {
			speak("wrong");
	
		}

		
		
		
		speak("Spell gnat");
		String answer2 = JOptionPane.showInputDialog("Spell the spoken word.");
		if (answer2.equals("gnat")) {
			speak("correct");
		} else {
			speak("wrong");
	
		}

		
		
		
		
		
		speak("Spell  prospicience ");
		String answer3 = JOptionPane.showInputDialog("Spell the spoken word.");
		if (answer3.equals(" prospicience ")) {
			speak("correct");
		} else {
			speak("wrong");
	
		}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
