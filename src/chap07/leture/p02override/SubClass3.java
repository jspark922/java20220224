package chap07.leture.p02override;

public class SubClass3 extends SuperClass3 {

	public void subMethod1() {
		System.out.println("서브메소드1!");
		super.superMethod1();
		System.out.println("서브메소드2@");
		super.superMethod2();
		System.out.println("서브메소드3#");
//		super.superMethod3(); // private 멤버 접근 불가
	}
	
}


