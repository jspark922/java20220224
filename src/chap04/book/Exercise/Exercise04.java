package chap04.book.Exercise;

public class Exercise04 {
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		while (x + y != 5) {
			x = (int)(Math.random()*6) + 1;
			y = (int)(Math.random()*6) + 1; 
			System.out.println("(" + x + ", " + y + ")");
		}
//		boolean more =true;
//		while (more) {
//			int num1 = (int)(Math.random()*6) + 1;
//			int num2 = (int)(Math.random()*6) + 1;
//			
//			System.out.println("(" + num1 + ", " + num2 + ")");
//			
//			if ((num1 + num2) == 5) {
//				more = false;
//			}
//		}
				
	}
}
