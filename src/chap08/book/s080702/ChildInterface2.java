package chap08.book.s080702;

public interface ChildInterface2 extends ParentInterface{
	@Override
	public default void method2() {
		/* 실행문 */
	}
	
	public void method3();
}
