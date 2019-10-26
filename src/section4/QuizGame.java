package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;

		// 2. Ask the user a question
		String question = JOptionPane.showInputDialog(null, "What is 20 + 75?");

		// 3. Use an if statement to check if their answer is correct
		if (question.equals("95")) {

			// 4. if the user's answer was correct, add one to their score
			score += 1;
		}
		// 5. Create more questions by repeating steps 1, 2, and 3 below.
		String questionTwo = JOptionPane.showInputDialog(null, "What is 40 + 175?");
		if (questionTwo.equals("215")) {

			score += 1;
		}
		String questionThree = JOptionPane.showInputDialog(null, "What is 789 + 123?");
		if (questionThree.equals("912")) {

			score += 1;
		}
		String questionFour = JOptionPane.showInputDialog(null, "What is 66 + 456?");
		if (questionFour.equals("522")) {

			score += 1;
		}

		// 6. After all the questions have been asked, print the user's score
		System.out.println(score);
	}
}
