package chap13.book.s130701;

public interface Storage<T> {
	public void add(T item, int index);
	public T get(int index);
}
