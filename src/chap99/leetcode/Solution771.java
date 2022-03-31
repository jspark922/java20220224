package chap99.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution771 {
	 public int numJewelsInStones(String jewels, String stones) {
	        int sum = 0;
	        
	        for (int i = 0; i < jewels.length(); i++) {
	            for (int j = 0; j < stones.length(); j++) {
	                if (jewels.charAt(i) == stones.charAt(j)) {
	                    sum++;
	                }
	            }
	        }
	        
	        return sum;
	    }
	 
	 public int numJewelsInStones2(String jewels, String stones) {
	        Set<Character> set = new HashSet<>();
	        for (char c : jewels.toCharArray()) {
	            set.add(c);
	        }
	        int sum = 0;
	        for (char c : stones.toCharArray()) {
	            if (set.contains(c)) {
	                sum++;                
	            }
	        }
	        return sum;
	    }
}
