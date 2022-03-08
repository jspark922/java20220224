package chap99.codingbat;

public class String1 {
	public String firstTwo(String str) {
		if (str.length() > 1) {
			return str.substring(0, 2);
		}
		return str;
	}

	public String nTwice(String str, int n) {

		String a = str.substring(0, n);
		String b = str.substring(str.length() - n);
		return a + b;
	}

	public String firstHalf(String str) {
		if (str.length() > 1) {
			return str.substring(0, (str.length() / 2));
		}
		return "";
	}

	public String middleThree(String str) {
		int middle = str.length() / 2;

		return str.substring(middle - 1, middle + 2);
	}

	public boolean hasBad(String str) {
		int i = str.indexOf("bad");

		return ((i == 0) || (i == 1));

	}

	public boolean frontAgain(String str) {
		if (str.length() < 2) {
			return false;
		}
		String end = str.substring(str.length() - 2);
		int i = str.indexOf(end);
		return i == 0;
	}

	public String seeColor(String str) {
		int r = str.indexOf("red");
		int b = str.indexOf("blue");
		if (r == 0) {
			return "red";
		} else if (b == 0) {
			return "blue";
		}
		return "";
	}
}
