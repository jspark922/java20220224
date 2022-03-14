package chap06.book.s061005;

public class Singleton {
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInsSingleton() {
		return singleton;
	}
}
