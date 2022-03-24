package chap15.lecture.p01list;

import java.util.ArrayList;
import java.util.List;

public class App03 {
	public static void main(String[] args) {
		int sum = 0;
		double sum2 = 0.0;
		
		List<Integer> list = new ArrayList<>(); 
		list.add(95);
		list.add(86);
		list.add(83);
		list.add(92);
		list.add(96);
		list.add(78);
		list.add(83);
		list.add(93);
		list.add(87);
		list.add(88);
		
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		sum2 = (double) sum / list.size();
		System.out.println(sum);
		System.out.println(sum2);
	}
}
