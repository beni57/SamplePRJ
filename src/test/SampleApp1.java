package test;

import java.util.*;

public class SampleApp1 {

	public static void main(String[] args) {

		
		int input = 4;
		System.out.println(" result n =4 ::::::  " + sum(input));
		
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(10, "test1");
		map.put(15,"test2");
		 
		//map.equals(o)
		
	}

	public static int sum(int n) {
				
		if( n <=1) {
			return n;
		}
		
		return	n+ sum(n-1);
	}
	
}
