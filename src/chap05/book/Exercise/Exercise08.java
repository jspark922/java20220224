package chap05.book.Exercise;

public class Exercise08 {
	public static void main(String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		// 작성 위치
		int leng = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <array[i].length; j++) {
				sum += array[i][j];
			}
			leng += array[i].length;
//			avg = (double)sum / array[i].length;
		}
		avg = (double)sum / leng;
		
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
