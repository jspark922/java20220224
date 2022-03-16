package chap07.leture.p05promotion;

import chap07.leture.p99polymorphism_class.Animal;
import chap07.leture.p99polymorphism_class.Canine;
import chap07.leture.p99polymorphism_class.Chihuahua;
import chap07.leture.p99polymorphism_class.Feline;
import chap07.leture.p99polymorphism_class.StreetCat;

public class App06 {
	public static void main(String[] args) {
		Chihuahua chihuahua = new Chihuahua();
		StreetCat streetCat = new StreetCat();
		
		Canine canine = new Chihuahua();
		Feline feline = new StreetCat();
		
		Animal animal1 = new Canine();
		Animal animal2 = new Feline();
		
		Animal animal3 = new Chihuahua();
		Animal animal4 = new StreetCat();
	}
}
