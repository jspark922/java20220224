package chap10.lecture.p02try;

public class App06 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 0};

		try {
			int r = arr1[0] / arr1[2];

			System.out.println(r);
		} catch (RuntimeException e) {
			System.out.println("런타임익셉셥 발생");
		}
		// catch 블럭 여러개 작성시
		// 하위타입보다 상위타입을 아래에 작성

		System.out.println("프로그램 계속 실행");
	}
}
