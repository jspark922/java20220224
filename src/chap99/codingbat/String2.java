package chap99.codingbat;

public class String2 {
	public String doubleChar(String str) {
		String db = "";
		for (int i = 0; i < str.length(); i++) {
			// db += (str.substring(i, i + 1) + str.substring(i, i + 1));
			db += str.charAt(i);
			db += str.charAt(i);
		}
		return db;
	}

	public int countHi(String str) {
		int result = 0;

		for (int i = 0; i < str.length() - 1; i++) {
			String sub = str.substring(i, i + 2);
			if (sub.equals("hi")) {
				result++;

			}
		}
		return result;
	}
	
	public boolean catDog(String str) {
		  int c = 0;
		  int d = 0;
		  
		  for (int i = 0; i < (str.length() - 2); i++) {
		    String sub = str.substring(i, i + 3);
		    if (sub.equals("cat")) {
		     c++; 
		    }
		    if (sub.equals("dog")) {
		     d++;
		    }
		  }  
		  return d == c;
		}

}
