package cap14;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {
	public static void main(String[] args) {
		Integer i = 20;
		int j= Integer.valueOf(i);
		System.out.println(j);
		
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(Integer.valueOf(3));
		nums.add(Integer.valueOf(5));
		nums.remove(1);
		nums.remove(Integer.valueOf(5));
		System.out.println(nums);
		
		
		
	}
}
