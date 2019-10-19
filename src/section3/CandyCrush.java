package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String name =JOptionPane.showInputDialog( "What is your name?" );

		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, name+" is a nice name");
		// 3. Ask them who their best friend is
		String grace= JOptionPane.showInputDialog("Who is your best friemd");
		// 4. Tell them their best friend is as sweet as candy
		JOptionPane.showMessageDialog(null, "She is as sweet as candy");

	} 
}


