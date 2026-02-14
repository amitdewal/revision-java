package stringOne.builder;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InsertAndDelete {
	
	public static StringBuilder reverseString(StringBuilder sb) {
		int n = sb.length();
		
		int start = 0;
		int end = n-1;
		
		while(start < end) {//abcdef
			
			//swappig 
			char temp = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, temp);
			
			start++;
			end--;
		}
		return sb;
		
	}
	public static void main(String[] args) {
		
//		StringBuilder sb = new StringBuilder("abcdef");
//		System.out.println(sb);
//		sb.deleteCharAt(1);
//		System.out.println(sb);
		
		StringBuilder sb = new StringBuilder("abc");
		StringBuilder result = reverseString(sb);
		//System.out.println(result);
		String temp ="";
		String str = "dsdfgbvc";
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		for(char c : ch) {
			temp = c+temp; 
		}
		System.out.println(temp);
	}

}
