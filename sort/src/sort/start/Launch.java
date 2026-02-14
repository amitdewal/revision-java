package sort.start;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Launch {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Sachin","Rahul","abc","b","a","mo");
		
		
		//sort first lengthwise then alpha
		
		List<String> collect = list.stream().sorted().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
			
			System.out.println(collect);
			
			
	
	}

}
