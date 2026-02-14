package springQus.start;




public class Main {
	
	public static boolean checkPalindrome(String str) {
		int n = str.length();
		
		StringBuilder sb = new StringBuilder(str);
		String reverse = sb.reverse().toString();
		
		return str.equals(reverse);
	}
	
	public static String reverseString(String str) {
		
		char[] carr = str.toCharArray();
		String ans = "";
		
		for(int i = carr.length-1; i >= 0; i--) {
			ans+= carr[i];
		}
		
		return ans;
	}
	
public static void main(String[] args) {
	System.out.println(reverseString("amit"));
	System.out.println(checkPalindrome("abA"));
}
}
