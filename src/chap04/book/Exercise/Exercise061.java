package chap04.book.Exercise;

public class Exercise061 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 5; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// *****
		//  ****
		//   ***
		//    **
		//     *
		
		for (int i = 5; i > 0; i--) {
			for (int k = 5; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		for (int i = 0; i < 5; i++) {
			for (int k = 5; k > (i + 1); k--) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i + 1); j++) {
				System.out.print("*");
			}
			System.out.println();
			}
		}
	}

