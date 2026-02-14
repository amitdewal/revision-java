package stringOne.one;

public class LaunchMain {
	
	public static String chnageAtEvenPlace(String str) {
		
		int n = str.length();
		String temp = "";
		
		for(int i = 0; i < n; i++) {
			if( i % 2 == 0) {
				temp = temp + "a";
			}
			else {
				temp = temp + str.charAt(i);
			}
		}
		return temp;
	}
	
public static void main(String[] args) {
	String str = "sachin tendulkar";
	System.out.println(chnageAtEvenPlace(str));
}
}