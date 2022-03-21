package chap10.lecture.p01exception;

import chap08.leture.p01interface.example_class.*;

public class App04 {
	public static void main(String[] args) {
		// CalssCastException

		Animal animal = new Cat();

		Chihuahua chihuahua = (Chihuahua) animal; // Exception

		System.out.println("프로그램 실행 계속....");
	}
}
