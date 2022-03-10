package chap99.leetcode;

public class Solution1480 {
	class Solution {
		public int[] runningSum(int[] nums) {
			int[] result = new int[nums.length];
			for (int i = 0; i < nums.length; i++) {
				if (i == 0) {
					result[i] = nums[i];
				} else {
					result[i] = result[i - 1] + nums[i];
				}
			}
			return result;
		}
	}
}
