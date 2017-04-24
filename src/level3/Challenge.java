package level3;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level3.Processing");
	}
	void goStraight(int howLong) {
	driveDirect(500, 500);
	sleep(howLong);
	}
	void turnRight(int howLong){
	driveDirect(500,0);
	sleep(howLong);
	}
	void turnleft(int howLong){
		driveDirect(0,500);
		sleep(howLong);
		}
	
	
	public Challenge(Roomba roomba) {
		super(roomba);
	}

	public void initialize() {
	goStraight(2500);
	turnleft(500);
	goStraight(2000);
	turnRight(500);
	goStraight(2500);
	turnleft(500);
	goStraight(2500);
	turnRight(500);
	
	
	}

	public void loop() {
	
	}
}
