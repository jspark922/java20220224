package chap99.codingbat;

import java.util.List;

public class Functional2 {
	public List<Integer> noNeg(List<Integer> nums) {
		nums.removeIf(c -> c < 0);
		return nums;
	}

	public List<Integer> no9(List<Integer> nums) {
		nums.removeIf(c -> (c % 10 == 9));
		return nums;
	}

	public List<Integer> noTeen(List<Integer> nums) {
		nums.removeIf(c -> (c >= 13 && c <= 19));
		return nums;
	}

	public List<String> noZ(List<String> strings) {
		// List<String> result = new ArrayList<>();

		// for (String str : strings) {
		//   if (str.length() < 4) {
		//     result.add(str);
		//   } 
		// }

		// return result;
		strings.removeIf(s -> s.contains("z"));
		return strings;
	}

	public List<String> noLong(List<String> strings) {
		strings.removeIf(s -> (s.length() >= 4));
		return strings;
	}

	public List<String> no34(List<String> strings) {
		strings.removeIf(s -> s.length() >= 3 && s.length() <= 4);
		return strings;
	}

	public List<String> noYY(List<String> strings) {
		strings.replaceAll(s -> s + "y");
		strings.removeIf(s -> s.contains("yy"));
		return strings;
	}

	public List<Integer> two2(List<Integer> nums) {
		nums.replaceAll(n -> n * 2);
		nums.removeIf(n -> n % 10 == 2);
		return nums;
	}

	public List<Integer> square56(List<Integer> nums) {
		nums.replaceAll(n -> n * n + 10);
		nums.removeIf(n -> (n % 10 == 5 || n % 10 == 6));
		return nums;
	}

}
