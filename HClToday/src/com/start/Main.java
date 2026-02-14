package com.start;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//(Morocco, Italy, Brazil, Mexico, Australia, Australia,
//South Africa, Madagascar)



public class Main {
	
	// start with 'm'
	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList(null, "Morocco", 
												"Italy", 
												"Brazil", 
												"Mexico", 
												"Australia", 
												"Australia",
												"South Africa", 
												"Madagascar",
												"","");		
		
		List<String> collect = list.stream()
				                   .filter(str -> str != null && !str.isEmpty() && !str.startsWith("M"))
				                   .collect(Collectors.toList());

		//System.out.println(collect);
		collect.forEach((s) -> System.out.print(s +" "));
	
		

		
		
	
	}
	
	//open h/progess  -> open h  
	//
	
	

}
