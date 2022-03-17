package chap08.book.s080503;

import chap08.book.s080502.*;

public class Car {

	Tire[] tires = {
		new HuankookTire(),
		new HuankookTire(),
		new HuankookTire(),
		new HuankookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
