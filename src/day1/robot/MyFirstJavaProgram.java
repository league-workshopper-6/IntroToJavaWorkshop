package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot hi =new Robot();
hi.penDown();

hi.setSpeed(999999);


for (int i = 0; i < 99999; i++)
{hi.setRandomPenColor();
hi.move(100);
hi.turn(90);
hi.move(5);
hi.turn(90);
hi.move(100);
hi.turn(270);
}	

	

	}
	}
