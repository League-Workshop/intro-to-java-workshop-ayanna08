package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	//2. Create new robot
	Robot rachel = new Robot ();

	void go() {
		// 4. Set speed
		rachel.setSpeed(100);
		rachel.penDown();
		// 5. Set the pen width to 5
		rachel.setPenWidth(5);

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for(int i=0;i<4;i++) {
			
			// 7. Set the pen color to random
		rachel.setRandomPenColor();
		
	
			// 1. Call the drawSquare() method
		drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
		//rachel.turn(90);

		}
	}

	
	void drawSquare() {
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
	
		rachel.move(100);
		rachel.turn(90);
		rachel.move(100);
		rachel.turn(90);
		rachel.move(100);
		rachel.turn(90);
		rachel.move(100);
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



