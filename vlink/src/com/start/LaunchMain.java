package com.start;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Amit Kumar
12:21 AM
List<String> list = new ArrayList<String>();

List.add(“Apple”);
List.add(“banana”);
List.add(“Mango”);
List.add(“Apple”);

Apple->2
Bana->1
Mango->1


HashMap<String, Integer> map=new HashMap<String, Integer>();


for(int I=0;i<list.size();I++){ 
if(!map.contanceKey(list.get(i))){
  Map.put(list.get(i), 1);
}
Else{
  Map.put(list.get(i), map.velue(1)+1);
}
}


Sysout.out.println(map);*/

public  class LaunchMain {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("Apple");
		list.add("banana");
		
		list.add("Mango");
		list.add("Apple");
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		
		
		
		  for( String s  : list) {
			map.put(s, map.getOrDefault(s, 0) + 1);
		  }
		  
		 
		  
		  for(Map.Entry<String, Integer> entry:   map.entrySet()) {
			  
			  
			 // System.out.println(entry.getKey()  + " " +  entry.getValue() );
		  }
		  
		  
		  // java 8 
		  
		  	map.forEach((k,v)  -> System.out.println("key -> "+k + "  value "+" -> "+ v));
	}
	
	
				// map iterate
	            
				
			
	
	 

}
