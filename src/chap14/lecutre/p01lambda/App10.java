package chap14.lecutre.p01lambda;

import java.util.ArrayList;

public class App10 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();

		list1.add("java");
		list1.add("spring");
		list1.add("hello");
		list1.add("jsp");
		list1.add("frinday");
		
		list1.replaceAll(c -> c.toUpperCase());
		
		list1.forEach(s -> System.out.println(s));
	}
}

