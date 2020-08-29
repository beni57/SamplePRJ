package Testtt;

public class AppString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "javajee";
		printStr(str);
	}
	
	public static  void printStr(String input) {
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<input.length();i++) {
		//	System.out.println( input.charAt(i));
		//	sb.append(input.charAt(i));
			for(int j=0;j<=i;j++) {
				System.out.println( input.charAt(j));
			}
		}
	}

}
