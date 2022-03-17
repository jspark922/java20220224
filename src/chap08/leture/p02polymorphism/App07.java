package chap08.leture.p02polymorphism;

import chap08.leture.p01interface.example_class.*;

public class App07 {
	public static void main(String[] args) {
		Pet pet = new Chihuahua();
		pet.roll();
		
		Helper helper = (Helper) pet; // ClassCastException
		helper.help();
		
		
	}
}
