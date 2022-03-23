package chap11.lecutre.p01object;

public class App07HashCode {
	public static void main(String[] args) {
		Keybord k1 = new Keybord("abc");
		Keybord k2 = new Keybord("def");
		Keybord k3 = new Keybord("abc");
		
		System.out.println(k1.equals(k2)); // false
		System.out.println(k1.equals(k3)); // true
		
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
		System.out.println(k3.hashCode());
	}
}

class Keybord {
	private String model;
	
	Keybord(String model) {
		this.model = model;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Keybord) {
			Keybord k = (Keybord) obj;
			
			return this.model.equals(k.model);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return model.hashCode();
	}
}
