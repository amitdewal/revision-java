package com.day10;

public class Main {
	
	public static boolean checkPalindromeV2(String str) {
			int end = str.length()-1;
			int start = 0;
			
			while(start <= end) {
				if(str.charAt(end) != str.charAt(start)) {
					return false;
				}
				start++;
				end--;
			}
			return true;
	}
	
	public static boolean checkPalindromeV1(String str) {
		
		String reverse = "";
		
		for(int i = str.length()-1; i >= 0; i--){
			reverse = reverse  + str.charAt(i);
		}
		
		return str.equals(reverse);
		
	}

	public static void main(String[] args) {
		String str = "101";
		//System.out.println(Main.checkPalindromeV1(str));
		System.out.println(Main.checkPalindromeV1(str));
		
	}

	

}
