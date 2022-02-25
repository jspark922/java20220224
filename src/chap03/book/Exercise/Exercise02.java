package chap03.book.Exercise;

public class Exercise02 {
	public static void main(String[] args) {
		// page 102p
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); // z = 11 + 20
		
		System.out.println(z); // 31
		System.out.println(x); // 11
		System.out.println(y); // 21
	}
}
