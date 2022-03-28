package chap12.lecutre.p01thread;

public class App07 {
	public static void main(String[] args) {
		Thread t1 = new MyThread71();
		Thread t2 = new MyThread72();
		t1.start();
		t2.start();
	}
}

class MyThread71 extends Thread {
	@Override
	public void run() {
		int locarVar = 0;
		for (int i = 0; i < 1000000; i++) {
			locarVar++;
		}
		System.out.println("thread71: " + locarVar);
	}
}

class MyThread72 extends Thread {
	@Override
	public void run() {
		int locarVar = 0;
		for (int i = 0; i < 1000000; i++) {
			locarVar++;
		}
		System.out.println("thread72: " + locarVar);
	}
}