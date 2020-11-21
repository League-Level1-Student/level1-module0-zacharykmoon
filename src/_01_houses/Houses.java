package _01_houses;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	Robot rob = new Robot();

	public void run() {

		rob.setY(300);
		rob.setX(30);

		rob.setSpeed(50);
		rob.penDown();
		for (int i = 0; i < 10; i++) {

			if (0 == i % 3) {
				drawHouse("small");

			}

			else if (1 == i % 3) {
				drawHouse("medium");

			} else if (2 == i % 3) {
				drawHouse("large");

			}
		}

	}

	public void drawHouse(String height) {

		if(height.equals("small")) {
			rob.move(60);
			drawPointyRoof();
			rob.move(60);
		}
		if(height.equals("medium")) {
			rob.move(80);
			drawPointyRoof();
			rob.move(80);
		}
		if(height.equals("large")) {
			rob.move(100);
			drawPointyRoof();
			rob.move(100);
		}
		
		rob.turn(-90);
		rob.move(30);
		rob.turn(-90);

	}

	public void drawPointyRoof() {

		rob.turn(45);
		rob.move(30);
		rob.turn(90);
		rob.move(30);
		rob.turn(45);
	}
}
