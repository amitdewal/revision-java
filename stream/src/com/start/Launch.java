package com.start;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*Use Java streams to sort the entries by key and collect them into a new HashMap
*/
public class Launch {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(22, "A");
        hashmap.put(55, "B");
        hashmap.put(33, "Z");
        hashmap.put(44, "M");
        hashmap.put(99, "I");
        hashmap.put(88, "X");

        
        List<String> list = Arrays.asList("1","2","3","4");
        int[] array = list.stream().mapToInt(i -> Integer.parseInt(i)).toArray();
        
        long[] array2 = list.stream().mapToLong(i -> Long.parseLong(i)).toArray();
        
        double[] array3 = list.stream().mapToDouble(i -> Double.parseDouble(i)).toArray();
        for (int j : array) {
			//System.out.print(j +" ");
        	
        	List<Integer> l = Arrays.asList(2,1,4,7,10);
        	
        	Stream<Integer> peek = l.stream().filter( i -> i >= 3).peek((i) -> System.out.println(i));
        	
        	//peek.count();
        	
        	Stream<Integer> peek2 = l.stream()
        			                 .filter(n -> n >= 3)
        			                 .peek(System.out::println)
        			                 .map(n -> n * -1)
        			                 .peek(System.out::println)
        			                 .sorted()
        			                 .peek(System.out::println);
        	
        	//List<Integer> collect = peek2.collect(Collectors.toList());
        	//System.out.println(collect);
        	
        	 List<Integer> list2 = Arrays.asList(2,1,4,7,10);
        	 list2.stream().filter(i -> i >= 3).forEach(i-> System.out.println(i));
        	
        	
		}
         
        
        		   
	}

}
