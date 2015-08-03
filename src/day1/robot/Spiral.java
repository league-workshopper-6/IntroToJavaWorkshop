package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot and set its pen to the down position
Robot hi=new Robot();		hi.penDown(); 

		// 3. Set the robot to go at max speed (10)
		hi.setSpeed(4);

		// 4. Do the following (steps 5-8) 75 times
for (int i = 0; i < 75; i++) {

hi.sparkle();
	

			// 6. Change the pen color to random
	hi.setRandomPenColor();
			// 5. Move the robot 5 times the current line number you are drawing (5*i)
	hi.move(5*i);
			// 2. Turn the robot 1/3 of 360 degrees to the right
			hi.turn(360/99);

			// 7. Change the number of sides to 7 (don’t add a new line of code for this one!)
	
			// 8. Set the pen width to i
			hi.setPenWidth(i);
	}	
		

	}
}
