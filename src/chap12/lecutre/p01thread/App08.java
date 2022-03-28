package chap12.lecutre.p01thread;

public class App08 {
	static int shareVar = 0;
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000000; i++) {
					shareVar++;
				}
				System.out.println("Thread81: " + shareVar);
			};
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 1000000; i++) {
					shareVar++;
				}
				System.out.println("Thread82: " + shareVar);
			};
		};
		
		t1.start();
		t2.start();
	}
}
