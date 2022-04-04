package chap18.lecture.p06filter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class App06 {
	public static void main(String[] args) throws Exception {
		// bufferedReader, bufferedWirter 사용해서
		// output/FilterExample51.txt
		// output/FilterExample6.txt 로 복사
		String in = "output/FilterExample51.txt";
		String out = "output/FilterExample6.txt";
		
		Reader br = new BufferedReader(new FileReader(in));
		Writer bw = new BufferedWriter(new FileWriter(out));
		
		int data = 0;
		while((data = br.read()) != -1) {
			bw.write(data);
		}
		
		bw.close();
		br.close();
	}
}
