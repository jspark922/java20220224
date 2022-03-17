package chap08.leture.p02polymorphism;

import chap08.leture.p01interface.example_class.*;

public class App06 {
	public static void main(String[] args) {
		Helper helper = new Retriever();
		
		helper.help();
		
		Pet pet = (Pet) helper;
		pet.roll();
	}
}
