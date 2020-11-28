package _02_my_first_swing_gui;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFirstSwingGUI {
	public void run() {

		// 1. Declare and initialize an object of the JFrame class
JFrame rob = new JFrame();
rob.setVisible(true);
		// 2. Set your JFrame object to be visible

		// 3. Open MyFirstSwingGUIRunner and run your program. Do you see your window? It's probably very
		// small.

		// 4. Use your JFrame to call setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
rob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 5. Declare and initialize an object of the JPanel class
JPanel bob = new JPanel();
		// 6. Declare and initialize an object of the JLabel class
JLabel dec = new JLabel();
		// 7. Set the text of the JLabel to a lovely greeting
dec.setText("Good Morning Zachary lolol ha ha I play MINECRAFT REEEEEEEEEE");
		// 8. Add the JPanel object to the JFrame
 rob.add(bob);
		// 9. Add the JLabel object to the JPanel
bob.add(dec);
		// 10. Pack your JFrame
rob.pack();
		// 11. Run your program again. Do you see your message?

		// 12. Use your JLabel to call setIcon(loadImage())

		// 13. Re-pack the JFrame object
rob.pack();;
		// 14. Run the program one more time. Do you see the image?

	}

	public ImageIcon loadImage() {
		try {
			return new ImageIcon(ImageIO.read(new MyFirstSwingGUI().getClass().getResourceAsStream("java.png")));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
