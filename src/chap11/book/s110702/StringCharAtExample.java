package chap11.book.s110702;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '2':
			System.out.println("남자 입니다.");
			break;
		case '3':
		case '4':
			System.out.println("여자 입니다.");
			break;
		}
	}
}
