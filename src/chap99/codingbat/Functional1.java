package chap99.codingbat;

import java.util.List;

public class Functional1 {
	public List<Integer> doubling(List<Integer> nums) {
		  nums.replaceAll(n -> n * 2);
		  return nums;
		}

	public List<Integer> square(List<Integer> nums) {
		  nums.replaceAll(c -> c * c);
		  return nums;
		}	
	
	public List<String> addStar(List<String> strings) {
		  strings.replaceAll(c -> c + "*");
		  return strings;
		}
	
	public List<String> copies3(List<String> strings) {
//		  strings.replaceAll(c -> c + c + c);
		  strings.replaceAll(c -> {
			 String result = "";
			 for (int i = 0; i < 3; i++) {
				 result += c;
			 }
			 return result;
		  });
		  return strings;
		}

	public List<String> moreY(List<String> strings) {
		  strings.replaceAll(c -> "y" + c + "y");
		  return strings;
		}

	public List<Integer> math1(List<Integer> nums) {
		  nums.replaceAll(c -> (c+1) * 10);
		  return nums;
		}

	public List<Integer> rightDigit(List<Integer> nums) {
		  nums.replaceAll(c -> c % 10);
		  return nums;
		}

	public List<String> lower(List<String> strings) {
		  strings.replaceAll(c -> c.toLowerCase());
//		  for (int i = 0; i < strings.size(); i++) {
//			    String e = strings.get(i);
//			    
//			    strings.set(i, e.toLowerCase());
//			  }
		  return strings;
		}

	public List<String> noX(List<String> strings) {
		  strings.replaceAll(c -> c.replace("x", ""));
		  // for (int i = 0; i < strings.size(); i++) {
		  //   String r = strings.get(i);
		  //   r = r.replace("x", "");
		    
		  //   strings.set(i, r);
		  // }
		  return strings;
		}

}
