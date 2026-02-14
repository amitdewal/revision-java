package stringOne.one;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LaunchClass {
	
	public static void maxFreq(String str) {
		
		int n = str.length();
		// freq arrat
		
		
		// a b c d
		int [] freq = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			
		 char ch = str.charAt(i);
		  int idx =  (int)ch-97;
		  freq[idx]++; // increase the array indexed value
		}
		
		int maxfreq = -1;
		for(int i = 0; i < freq.length; i++) {
			
			maxfreq = Math.max(maxfreq, freq[i]);
		}
		
		
        for(int i = 0; i < freq.length; i++) {
			
			if(maxfreq == freq[i]) {
				  char ch = (char) (i+97);
				  System.out.println(ch);
			}
		}
		
		
		
	}
	
	
	public static boolean isAnagramV2(String s, String t) {
		
		if(s.length() != t.length()) {
			return false;
		}
		
		char[] c1 = s.toCharArray();
		char[] c2 = t.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		for (int i = 0; i < c2.length; i++) {
			
			if(c1[i] != c2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isAnagram(String s, String t) {
		
		if(s.length() != t.length()){
			return false;
		}
		String str1 = Stream
							.of(s.split("")).map(ele -> ele.toLowerCase())
							.sorted()
							.collect(Collectors.joining());
		
		String str2 = Stream
							.of(t.split(""))
							.map(ele -> ele.toLowerCase())
							.sorted()
							
							.collect(Collectors.joining());
		System.out.println(str1);
		System.out.println(str2);
		 return str1.equals(str2);

	}
	public static void main(String[] args) {
//		String s = "anagram";
//		String t = "nagaram";
//		System.out.println(isAnagram(s, t));
//		System.out.println(isAnagramV2(s, t));
		String str = "aaaabbbbcccccgddsfg";
		maxFreq(str);
		
	}

}
