package Sample;

import java.util.*;

public class ArrayApp1 {

	public static void main(String[] args) {

		int[] nums = {2, 11, 5, 1, 4, 7};
		System.out.println( checkSum(nums));
	}

	public static boolean checkSum(int[] nums) {
		
		boolean flag = false;
		int sum =0;
		for(int i=0;i< nums.length;i++) {
			sum += nums[i];
		}
		
		if( sum % 2 != 0) {
//			System.out.println(" the pair not exits!!");
//			flag = false;
			return false;
		}
		 
		sum = sum / 2;
		
		HashSet<Integer> set = new HashSet<>();
		int val =0;
		
		for(int i=0;i< nums.length;i++) {
			 val = sum - nums[i];
			 
			 if( set.contains(val) && 
					 val == (int) set.toArray()[set.size() - 1] ){
				 System.out.println(" the elements matches " + nums[i] + " " +val  );
				// flag = true;
				 return true;
			 }
			 set.add(val);
		}
		return false;
	}
	
}
