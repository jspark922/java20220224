package chap15.lecture.p02set;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

public class App04 {
	
	@Test
	public void test() {
		Set<Integer> r1 = solution(new int[] {1, 2, 2, 3, 4});
		assertEquals(1, r1.size());
		assertTrue(r1.contains(2));
		
		Set<Integer> r2 = solution(new int[] {4, 5, 6, 7});
		assertEquals(0, r2.size());
		
		Set<Integer> r3 = solution(new int[] {3, 3, 4, 4, 4, 5});
		assertEquals(2, r3.size());
		assertTrue(r3.contains(3));
		assertTrue(r3.contains(4));
	}
	
	public Set<Integer> solution(int[] nums) {
		// nums 배열에 2개 이상 있는 값을 set에 넣어서 리턴
		Set<Integer> set = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		
		for(int num : nums) {
			if (set.contains(num)) {
				result.add(num);
			} else {
				set.add(num);
			}
		}
		
		return result;
	}
	
}
