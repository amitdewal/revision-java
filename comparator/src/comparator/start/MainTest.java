package comparator.start;

import java.util.HashMap;

public class MainTest {
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		Integer put = map.put("abc", 123);
		System.out.println(put);
		Integer temp = map.getOrDefault("mno", 100);
		//System.out.println(temp);
		//System.out.println(map);
		
		Integer orDefault = map.getOrDefault("xyz", 87);
		System.out.println(orDefault);
	}

}
