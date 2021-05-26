package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class fortune_cookie implements ActionListener {
	public void showButton() {
        System.out.println("Button clicked");
        JFrame frame = new JFrame();
        frame.setVisible(true);
        JButton button = new JButton();
        frame.add(button);
        frame.pack();
        button.addActionListener( this);        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		  System.out.println("A light carries you with hard times");
		  int rand = new Random().nextInt(5);
	
		  
		// TODO Auto-generated method stub
		
	}

}
