package chap06.lecture.p09getter_setter;

public class App01 {
	public static void main(String[] args) {		
	Computer com1 = new Computer();
//	com1.ram = 16;
	com1.setRam(16);
	
	Computer com2 = new Computer();
//	com2.ram = 32;
	com2.setRam(32);
	
	System.out.println(com1.getRam());
	System.out.println(com2.getRam());
	
	}
}
