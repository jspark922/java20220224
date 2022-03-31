package chap99.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution1684 {
	public int countConsistentStrings(String allowed, String[] words) {
		int sum = 0;
		for (String word : words) {
			boolean match = true;
			for (char ch : word.toCharArray()) {
				if (!allowed.contains(String.valueOf(ch))) {
					match = false;
					break;
				}
			}
			if (match) {
				sum++;
			}
		}
		return sum;
	}

	public int countConsistentStrings2(String allowed, String[] words) {
		int cnt = 0;

		Set<Character> set = new HashSet<>();
		for (char c : allowed.toCharArray()) {
			set.add(c);
		}

		for (String word : words) {
			if (consistent(set, word)) {
				cnt++;
			}
		}

		return cnt;
	}

	private boolean consistent(Set<Character> set, String word) {
		for (char c : word.toCharArray()) {
			if (!set.contains(c)) {
				return false;
			}
		}
		return true;
	}
}
