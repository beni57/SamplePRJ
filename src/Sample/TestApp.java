package Sample;

import java.util.*;

public class TestApp {

	public static void main(String[] args) {

	}
	
	
	public static boolean checkSum(int[] nums) {
		boolean flag = false;
		int sum =0;
		
		for(int i=0;i<nums.length;i++) {
		  sum += nums[i];	
		}
		
		if( sum % 2 ==0) {
			System.out.println(" we can split !!!");
		}
		
		int temp = sum /2;
		int second =0;
		
		HashSet<Integer> set = new HashSet<>();
		
	    for(int i=0;i<nums.length;i++) {
	    	second = temp - nums[i];
	    	if( !set.contains(second)) {
	    		set.add(second);
	    	}else {
	    		System.out.println( " first num : " + nums[i] + " and second num " +nums[i+1]);
	    		flag = true;
	    	}
	    		
	    }
	    return flag;
	}

}
