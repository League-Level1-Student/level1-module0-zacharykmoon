package _08_jack_in_the_box;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class JackintheBox implements ActionListener {
	int clicked = 0;
	public void showButton() {
		JFrame Jack = new JFrame();
		Jack.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel();
		Jack.add(panel);
		Jack.setVisible(true);
		JButton button = new JButton("Surpise");
		panel.add(button);
		
		button.addActionListener(this);
		JLabel image = createLabelImage("jackInTheBox.png");
		panel.add(image);
		Jack.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		clicked = clicked + 1;
		if (clicked == 5) {
			playSound("homer-woohoo.wav");
			JOptionPane.showMessageDialog(null, "Boo!");
		}
	}

	private void image() {
		// TODO Auto-generated method stub
		
	}

	///

	private void showPicture(String fileName) {
		try {
			JLabel imageLabel = createLabelImage(fileName);
			JFrame frame = new JFrame();
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private JLabel createLabelImage(String fileName) {
		try {
			URL imageURL = getClass().getResource(fileName);
			if (imageURL == null) {
				System.err.println("Could not find image " + fileName);
				return new JLabel();
			} else {
				Icon icon = new ImageIcon(imageURL);
				JLabel imageLabel = new JLabel(icon);
				return imageLabel;
			}
		} catch (Exception e) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		
	}
	
	private void playSound(String soundFile) {
	     try {
	          AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	          sound.play();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
}
