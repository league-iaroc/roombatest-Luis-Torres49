package level2;

import level1.Sonar;
import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;
static int speed = 500;

	public static void main(String[] args) {
		PApplet.main("level2.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
		Sonar sonar = new Sonar(roomba);
	}

	public void initialize() {
driveDirect(500, 500);
sleep(2900);
driveDirect(200,500);
sleep(800);
driveDirect(650,650);
	sleep(3500);
	driveDirect(500, 250);
	sleep(1000);
	driveDirect(500,500);
	}

	public void loop() {
	
	}
}
