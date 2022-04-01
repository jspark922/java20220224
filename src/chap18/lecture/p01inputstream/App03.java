package chap18.lecture.p01inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Arrays;

public class App03 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/p01inputstream/App03.java";
		
		InputStream is = new FileInputStream(path);
		
		byte[] dates = new byte[100];
		
		is.read(dates);
		System.out.println(Arrays.toString(dates));
		
		is.read(dates);
		System.out.println(Arrays.toString(dates));
		
		is.read(dates);
		System.out.println(Arrays.toString(dates));
	}
}
