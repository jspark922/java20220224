package chap06.book.Exercise.p18;

public class ShopService {
	
	private static ShopService shopService = new ShopService();
	
	private ShopService() {
		
	}

	public static ShopService getImstance() {
		return shopService;
	}
}
