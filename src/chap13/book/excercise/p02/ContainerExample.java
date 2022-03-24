package chap13.book.excercise.p02;

public class ContainerExample {
	public static void main(String[] args) {
		Contaniner<String> container1 = new Contaniner<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Contaniner<Integer> contaniner2 = new Contaniner<Integer>();
		contaniner2.set(6);
		int value = contaniner2.get();
	}
}
