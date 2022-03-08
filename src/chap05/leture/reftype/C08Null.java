package chap05.leture.reftype;

public class C08Null {
	public static void main(String[] args) {
		String s1 = new String("java");
		String s2 = "java";
		int[] a1 = new int[] {3, 4};
		int[] a2 = {3, 4};
		
		String s3 = null; // 가르키는 인스턴스(객체)가 없음
		String[] a3 = new String[3];
		System.out.println(a3[0]);
		System.out.println(a3[1]);
		System.out.println(a3[2]);
		
		// null인 참조변수 사용
		System.out.println(a3[0].equals("java"));
		
		System.out.println("프로그램 진행....");
	}
}
