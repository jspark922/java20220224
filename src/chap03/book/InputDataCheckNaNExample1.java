package chap03.book;

public class InputDataCheckNaNExample1 {
	public static void main (String[] ages) {
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
