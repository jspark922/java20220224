package chap07.leture.p01inheritance;

public class App01 {
	public static void main(String[] args) {		
	Computer c1 = new Computer();
	c1.cpu = "펜티엄";
	c1.ram = "32g";
	c1.ssd = "1tb";
	c1.executeGame();
	
	
	QuantumComputer c2 = new QuantumComputer();
	c2.cpu = "양자cpu";
	c2.ram = "itb";
	c2.ssd = "32tb";
	c2.executeGame();
	c2.executeQuantum();
	
	System.out.println();
	}
}
