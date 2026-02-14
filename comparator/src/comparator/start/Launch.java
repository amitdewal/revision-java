package comparator.start;

import java.util.HashMap;

public class Launch {
	
	public static int method(String str) {
		
		int n = str.length();
		
		String[] arr = str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		
		for( String s: arr) {
			
			map.put(s, map.getOrDefault(s, 0)+1);
			
		}
		System.out.println(map);
		
		for( int count : map.values()) 
		
		{
			
			
		}
		
		return n;
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "java is good and python is good";
		method(str);
	}

}
