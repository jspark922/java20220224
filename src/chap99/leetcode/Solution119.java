package chap99.leetcode;

import java.util.*;

public class Solution119 {
	public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        
        // 일 잘 하고
        for (int i = 0; i < rowIndex; i++) {
            result = nextRow(result);
        }
        
        
        return result;
    }
    
    private List<Integer> nextRow(List<Integer> cur) {
        List<Integer> next = new ArrayList<>();
        
        next.add(1);
        
        // 더하는 일
        for (int i = 0; i < cur.size() - 1; i++){
            Integer sum = cur.get(i) + cur.get(i+1);
            next.add(sum);
        }
        
        next.add(1);
        
        return next;
//        List<List<Integer>> index = new ArrayList<>();
//        for(int i = 0; i <= rowIndex; i++) {
//        	List<Integer> row = new ArrayList<>();
//        	for (int j = 0; j <= i; j++) {
//        		if (j == 0 || j == i) {
//        			row.add(1);
//        		} else {
//        			row.add(index.get(i-1).get(j-1) + index.get(i-1).get(j));
//        		}
//        	}
//        	index.add(row);
//        }
//        return index.get(index.size() - 1);
    }
}

