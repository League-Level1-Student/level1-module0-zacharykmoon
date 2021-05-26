
package _09_sound_effects_machine;


import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;

public class memesound implements ActionListener {
	public void boat() {
		
	
	JFrame jef = new JFrame();
	jef.setVisible(true);
	JButton boot = new JButton();
	jef.add(boot);
	boot.addActionListener( this);
	}

	private void playSound(String soundFile) { 
	      try {
	           AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
	           sound.play();
	      } catch (Exception e) {
	           e.printStackTrace();
	      }
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		playSound("homer-woohoo.wav");
		System.out.println("ye");
	}
	}