package chap07.leture.p06polymorphism;

import chap07.leture.p99polymorphism_class.Animal;
import chap07.leture.p99polymorphism_class.Canine;
import chap07.leture.p99polymorphism_class.Chihuahua;
import chap07.leture.p99polymorphism_class.Feline;
import chap07.leture.p99polymorphism_class.StreetCat;

public class App04 {
	public static void main(String[] args) {
		method(new Animal());
		method(new Canine());
		method(new Feline());
		method(new Chihuahua());
		method(new StreetCat());
	}
	
	public static void method(Animal animal) {
		animal.breathe();
		animal.cry();
	}
}
