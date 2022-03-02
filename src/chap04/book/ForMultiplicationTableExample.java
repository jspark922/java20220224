package chap04.book;

public class ForMultiplicationTableExample {
	public static void main(String[] args) {
		for (int m = 2; m <= 9; m++) {
			System.out.println("*** " + m + "단 ***");
			for (int n = 1; n <= 9; n++) {
				System.out.println(m + "*" + n + "=" + (m * n));
			}
		}
		
		// 9단 ~ 2단
		System.out.println("###########9단 ~ 2단");
		for (int x = 9; x >= 2; x--) {
			System.out.println("*** " + x + "단 ***");
			for (int y = 1; y <= 9; y++) {
				System.out.println(x + "*" + y + "=" + (x * y));
			}
		}
		
		// 9 X 9 = 81 ~~~~ 2 X 1 = 2 
		System.out.println("##########9 X 9 = 81 ~~~~ 2 X 1 =2");
		for (int x = 9; x >= 2; x--) {
			System.out.println("*** " + x + "단 ***");
			for (int y = 9; y >= 1; y--) {
				System.out.println(x + "*" + y + "=" + (x * y));
			}
		}
	}
}
