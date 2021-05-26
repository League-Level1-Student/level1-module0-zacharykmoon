package _10_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener { 
	
	JButton Tv1 = new JButton("Ducks");
	JButton Tv2= new JButton("Frogs");
	JButton Tv3 = new JButton("Unicorns");
	public void showButton() {
        
        JFrame Tv = new JFrame ();
        JPanel panel = new JPanel();
        Tv.setVisible(true);
        
        panel.add(Tv1);
        
        
        panel.add(Tv2);
 
        
        panel.add(Tv3);
        Tv.add(panel);
        Tv.pack();
 
        Tv1.addActionListener(this);
        Tv2.addActionListener(this);
        Tv3.addActionListener(this);
}
	

void showDucks() {
    playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}

void showFrog() {
    playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}

void showFluffyUnicorns() {
    playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}

void playVideo(String videoID) {
    
    // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
    //work on some Linux implementations
    try {
    if (System.getProperty("os.name").toLowerCase().contains("linux")) {
    if (Runtime.getRuntime().exec(new String[] {
     "which", "xdg- open" }).getInputStream().read() != -1) {
    Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
    }
    } else {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    }      } catch (Exception e) {
         e.printStackTrace();
    }
}


@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource() == Tv1) {
		System.out.println("Ducks");
		showDucks();
	}
	if (e.getSource() == Tv2) {
		System.out.println("Frog");
		showFrog();
	}
	if (e.getSource()== Tv3) {
		System.out.println("Unicorns");
		showFluffyUnicorns();

	}
}
}