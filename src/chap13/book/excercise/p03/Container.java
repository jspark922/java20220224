package chap13.book.excercise.p03;

public class Container<T, U> {
	private T filed1;
	private U filed2;
	public T getKey() {
		return filed1;
	}
	public void set(T filed1, U filed2) {
		this.filed1 = filed1;
		this.filed2 = filed2;
	}
	public U getValue() {
		return filed2;
	}

}
