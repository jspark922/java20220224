package chap18.lecture.p04writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class App02 {
	public static void main(String[] args) throws Exception {
		// 텍스트 파일 복사

		// 원본파일 
		String in = "src/chap18/lecture/p04writer/App02.java";
		// 복사파일
		String out = "output/WriterEx02.txt";

		Reader rd = new FileReader(in);

		Writer wr = new FileWriter(out);

		int data = 0;

		while ((data = rd.read()) != -1) {
			wr.write(data);
		}

		wr.flush();
		wr.close();
		rd.close();

		System.out.println("복사완료!!!!");
	}
}
