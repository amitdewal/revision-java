package com.start;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*first repeated character in a 
 * String str =  "Java Coforge Interview for today";
*/
public class Launch {
	
	public static void main(String[] args) {
		String str =  "Java Coforge Interview for today";
	
		
		
		
 String string = Arrays
		          .asList(str.toLowerCase().trim().split(""))
		          .stream()
    		   	  .sorted()
    		   	  .filter(s-> !s.isBlank())
    		      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
    		      .entrySet()
    		      .stream()
    		      .filter(entry -> entry.getValue() > 1)
    		      .map(entry -> entry.getKey())
    		      .findFirst()
    		      .orElse(null);
 System.out.println(string);
 
// List<Integer> lis = Arrays.asList(1,2,3,4,5);
// 
// Integer f = lis.parallelStream().findFirst().get();
// System.out.println(f);
 
 
// Integer f1 = lis.parallelStream().findAny().get();
// System.out.println(f1);
 

 
 



    
   				
		     
     
     
     
     
	}
	
	

}
