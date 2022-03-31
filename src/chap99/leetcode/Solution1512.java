package chap99.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution1512 {
	public int numIdenticalPairs(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sum++;
                }
            }
        }
        return sum;
    }
	
	public int numIdenticalPairs2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int result = 0;
        java.util.Collection<Integer> values = map.values();
        for (Integer value : values) {
            result += (value) * (value -1) / 2;
        }
        return result;
    }
}
