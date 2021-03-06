package chap10.lecture.p03checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App02 {
	public static void main(String[] args) {
		String s = "10";
		
		int i = Integer.parseInt(s);
		// NumberFormatException 발생 가능
		// NumberFormatException은 RuntimeException(unchecked exception)
		// 이어서 컴파일러가 검사안함 (uncheck)

		try {
			FileReader fr = new FileReader("");
			// FilenotFoundException 발생 가능
			// FilenotFoundException은 RuntimeException을 상속 받지 않음(check exception)
			// 그래서 컴파일러가 검사함 (check)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
