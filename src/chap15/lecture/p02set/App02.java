package chap15.lecture.p02set;

import java.util.HashSet;
import java.util.Set;

public class App02 {
	public static void main(String[] args) {
		// Lotto : 1~45의임의의 값 6개
		
		// 1~45의임의의 값 6개
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
			set.add((int)(Math.random() * 45) +1);
		}

		System.out.println(set);
	}
}
