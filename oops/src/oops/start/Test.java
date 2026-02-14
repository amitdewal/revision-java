package oops.start;

import java.util.HashMap;

public class Test {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<String,Integer>();
	int n = 16;
	map.put("aA", 19);
	map.put("BB", 29);
	map.put("aaa", 39);
	
	
	System.out.println("AC".hashCode() & (n-1));
	System.out.println("BD".hashCode() & (n-1));
	System.out.println("aaa".hashCode() & (n-1));
	
	

}
}
