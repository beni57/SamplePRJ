package Testtt;

import java.util.*;

public class AnagramApp {

	public static void main(String[] args) {

		String str1= "mary";
		String str2="army";
		
		System.out.println(" result :::: "+ isAnagram(str1, str2));
	}
	
	public static boolean isAnagram(String str1,String str2) {
		
		char[] chars_1 = str1.toCharArray();
		char[] chars_2 = str2.toCharArray();
		boolean flag = false;
		
		
		Arrays.sort(chars_1);
		Arrays.sort(chars_2);

		if ( Arrays.equals(chars_1, chars_2)) {
			flag = true;
		}else
			flag = false;
		
		return flag;
	}

}
