package chap08.book.s080502;

public class Car {
	Tire frontLeftTire = new HuankookTire();
	Tire frontRightTire = new HuankookTire();
	Tire BackLeftTire = new HuankookTire();
	Tire BackRightTire = new HuankookTire();
	
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		BackLeftTire.roll();
		BackRightTire.roll();
	}
}
