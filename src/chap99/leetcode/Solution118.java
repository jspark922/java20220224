package chap99.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        
        result.add(first);
        
        while(result.size() < numRows) {
            List<Integer> lastRow = result.get(result.size() -1);
            List<Integer> nextRow = nextRow(lastRow);
            
            result.add(nextRow);
        }
        
        return result;
    }
    
    private List<Integer> nextRow(List<Integer> cur) {
        List<Integer> next = new ArrayList<>();
        next.add(1);
        
        // 더하는 일
        for (int i = 0; i < cur.size() - 1; i++) {
            Integer sum = cur.get(i) + cur.get(i+1);
            next.add(sum);
        }
        
        next.add(1);
        
        return next;
//        List<List<Integer>> result = new ArrayList<>();
//        for(int i = 0; i < numRows; i++) {
//            List<Integer> list = new ArrayList<>();
//            for (int j = 0; j <= i; j++) {
//                if(j == 0 || j == i) {
//                    list.add(1);
//                } else {
//                    list.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
//                }
//            }
//            result.add(list);
//        } 
//        return result;
    }
}
