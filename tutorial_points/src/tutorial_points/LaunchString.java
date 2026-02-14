package tutorial_points;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LaunchString {
	public static void main(String[] args) {
	
		
//		//String s =  "Java Coforge Interview for today";
//		String s =  "amit";
//		
//		    String reverse = Stream.of(s.split("")).collect(Collectors.reducing("",(s1, s2) -> s2 +s1));
//		  	System.out.println(reverse);
		 /*list of strings, sort them according to increasing order of their length */
			/*
			 * List<String> list = Arrays.asList("Saching", "Atul", "Amit", "Subham",
			 * "PratushVenkatheshIyer", "DikshaNitrate");
			 * 
			 * 
			 * list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach
			 * ((st) -> System.out.println(st));
			 */
		
        List<String> originalList = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        
        List<String> list = originalList.stream()
        						.filter(s -> Character.isDigit(s.charAt(0))).collect(Collectors.toList());
        	System.out.println(list);
		
		
		
		
		
		
		
	
	}

}
