package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot a=new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
a.setSpeed(9999999);
		// 5. Set the pen width to 5
a.penDown();
a.setPenWidth(5);
		// 6. Do steps #6 to #7 four times...
for (int i = 0; i < 4; i++) {
	

			// 7. Set the pen color to random
a.setRandomPenColor();
	
			// 1. Call the drawSquare() method
	drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
a.turn(90);
	}}
	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		for (int i = 0; i < 4; i++) {
			a.move(200);
			a.turn(90);
			
		}

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
