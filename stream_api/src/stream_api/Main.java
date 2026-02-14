package stream_api;

import java.util.HashMap;
import java.util.Map;

public class Main {
public static void main(String[] args) {
	
	String str = "amit dewal";
	
	String[] arr = str.split("");
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	
	for(String s: arr) {
		
		map.put(s, map.getOrDefault(s, 0) + 1);
	}
	//System.out.println(map);
	
	for(Map.Entry<String, Integer> m : map.entrySet()) {
		
		if(m.getValue()>1) {
		System.out.println(m.getKey() + " - "+ m.getValue());
		}
	}
	
	
	
	
	
	
}
}
