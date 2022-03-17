package chap08.leture.p03extends;

public interface MySuperInterface1 {

	void superMethod1();
	
	default void superDefaultMethod1() {
		System.out.println("슈퍼 디폴트 메소드1 !");
	}
}
