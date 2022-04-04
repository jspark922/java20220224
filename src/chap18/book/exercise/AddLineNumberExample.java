package chap18.book.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		// 정확한 경로로 수정하세요.
		String filePath = "src/chap18/book/s180502/BufferedReaderExample.java";
		
		// 작성 위치
		BufferedReader br = new BufferedReader(new FileReader(filePath));

		String line = "";
		int lineNumber = 1; 
		while((line = br.readLine()) != null) {
			System.out.println(lineNumber + ": " + line);
			lineNumber++;
		}
		
		br.close();
	}
}
