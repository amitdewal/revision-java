package interview.com;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	
	public static boolean checkAnagram(String strOne, String strTwo) {
		
		List<String> listOne = Stream.of(strOne).sorted().collect(Collectors.toList());
		List<String> listTwo = Stream.of(strTwo).sorted().collect(Collectors.toList());
	
		String string1 = listOne.toString();
		String string2 = listTwo.toString();
		return string1.equals(string2);
		
	
	}
	
 public static void main(String[] args) {
	 
	 String str1 = "listen";
	 String str2 = "silent";
	 
	 System.out.println(checkAnagram(str1,str2));
	 

	 
	 
	
}
}
