package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		Robot ayanna = new Robot();	
		ayanna.penDown();
		ayanna.setSpeed(10);
		ayanna.setRandomPenColor();
		ayanna.move(100);
		ayanna.turn(90);
		ayanna.setRandomPenColor();
		ayanna.move(100);
		ayanna.turn(90);
		ayanna.setRandomPenColor();
		ayanna.move(100);
		ayanna.turn(90);
		ayanna.setRandomPenColor();
		ayanna.move(100);
		ayanna.turn(90);
		
		
		
		}
}
