package chap06.book.s061005;

public class SingletonExample {
	public static void main(String[] args) {
		/*
		 * singleton obj1 = new Singleton(); // 컴파일 오류
		 * singleton obj2 = new Singleton(); // 컴파일 오류
		 */
		
		Singleton obj1 = Singleton.getInsSingleton();
		Singleton obj2 = Singleton.getInsSingleton();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
