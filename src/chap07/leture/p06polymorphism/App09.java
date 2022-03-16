package chap07.leture.p06polymorphism;

import chap07.leture.p99polymorphism_class.Animal;
import chap07.leture.p99polymorphism_class.Chihuahua;
import chap07.leture.p99polymorphism_class.StreetCat;

public class App09 {
	public static void main(String[] args) {
		Animal animal = new StreetCat();
		animal.breathe();
		animal.cry();
		
		// angry 메소드 실행하고 싶다.
		Chihuahua chihuahua = (Chihuahua) animal;
		chihuahua.angry();
		
		// *강제 형변환(casting)는 매우 주의해서 작성해야함.
		
		System.out.println("명령문 진행 계속.........");
		
	}
}
