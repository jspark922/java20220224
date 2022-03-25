package chap14.book.s140304;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface f1;

		f1 = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(f1.method(2, 5));
		
		
		f1 = (x, y) -> {
			return x + y;
		};
		System.out.println(f1.method(2, 5));
		
		f1 = (x, y) -> x + y;
		System.out.println(f1.method(2, 5));
		
		f1 = (x, y) -> sum(x, y);
		System.out.println(f1.method(2, 5));
	}
	
	public static int sum(int x,int y) {
		return (x + y);
	}
}
