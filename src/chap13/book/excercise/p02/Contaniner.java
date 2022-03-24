package chap13.book.excercise.p02;

public class Contaniner<T> {
	private T content;
	
	public void set(T content) {
		this.content = content;
	}
	
	public T get() {
		return content;
	}
}
