package chap06.book.Exercise.p18;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService obj1 = ShopService.getImstance();
		ShopService obj2 = ShopService.getImstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 shopService 객체 입니다.");
		} else {
			System.out.println("다른 shopService 객체 입니다.");
		}
	}
}
