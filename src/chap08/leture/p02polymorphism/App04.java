package chap08.leture.p02polymorphism;

import chap08.leture.p01interface.example_class.*;

public class App04 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		Pet pet1 = chihuahua;
		
		Cat cat = new Cat();
		Pet pet2 = cat;
		
		pet1.roll();
		pet2.roll();
		
		Tiger tirger = new Tiger();
//		Pet pet3 = tirger; // xxx
		Wolf wolf = new Wolf();
//		Pet pet4 = wolf; // xxx
		
		method(pet1);
		method(pet2);
		method(new Cat());
		method(new Chihuahua());
	}
	
	public static void method(Pet pet) {
		pet.roll();
	}
}
