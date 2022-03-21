package chap10.lecture.p02try;

public class App07 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 0};

		try {
			int r = arr1[0] / arr1[2];

			System.out.println(r);
		} catch (ArithmeticException | NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("아리스메틱익셉션 또는 널포인트익셉션 또는 아르인덱스아웃오브바운스익셉션 발생");
		}
		// catch 블럭 여러개 작성시
		// 하위타입보다 상위타입을 아래에 작성

		System.out.println("프로그램 계속 실행");
	}
}
