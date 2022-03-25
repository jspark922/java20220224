package chap14.book.s140303;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface f1;
		
		f1 = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		f1.method(2);
		
		f1 = (x) -> {
			System.out.println(x*5);
		};
		f1.method(2);
		
		f1 = x -> System.out.println(x*5);
		f1.method(2);
	}
}
