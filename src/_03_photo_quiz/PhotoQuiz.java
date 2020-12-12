package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame quizWindow = new JFrame();
		quizWindow.setVisible(true);
		// This will make sure the program exits when you close the window
		quizWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		// 2. create a variable of type "Component" that will hold your image
		Component comp = createImage(
				"https://upload.wikimedia.org/wikipedia/en/0/00/The_Child_aka_Baby_Yoda_%28Star_Wars%29.jpg");
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
		quizWindow.add(comp);
		// 5. call the pack() method on the quiz window

		// 6. ask a question that relates to the image
		String Jedi = JOptionPane.showInputDialog("Who is this ");
		if (Jedi.equals("Grogu")) {
			JOptionPane.showMessageDialog(null, "CORRECT");
		} else {
			JOptionPane.showMessageDialog(null, "INcorrect");

		}

		// 7. print "CORRECT" if the user gave the right answer

		// 8. print "INCORRECT" if the answer is wrong

		// 9. remove the component from the quiz window (you may not see the
		// effect of this until step 12)
		quizWindow.remove(comp);
		// 10. find another image and create it (might take more than one line
		// of code)
		Component blue = createImage(
				"https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.theverge.com%2F2019%2F8%2F23%2F20830478%2Fobi-wan-kenobi-standalone-spinoff-series-disney-plus-series-ewan-mcgregor-streaming-star-wars&psig=AOvVaw2UoeLbg4Wuyu_NXxEMYNaI&ust=1607215663184000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCMjF8YjPte0CFQAAAAAdAAAAABAI");
		// 11. add the second image to the quiz window
		quizWindow.add(blue);
		// 12. pack the quiz window

		// 13. ask another question

		// 14+ check answer, say if correct or incorrect, etc.
		String Master = JOptionPane.showInputDialog("Is Obi wan Kenobi a Jedi?");
		if (Master.equals("Yes")) {
			JOptionPane.showMessageDialog(null, "Ah yes the negotiater Hello there");
		}
	}

	

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	// *15. make something happen when mouse enters image
	// (imageComponent.addMouseMotionListener())
}
