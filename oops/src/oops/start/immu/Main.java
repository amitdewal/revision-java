package oops.start.immu;

import java.util.HashMap;
import java.util.Map;

final class CustomImmutabl {
	private final int id;
	private final String name;
	private final Map<String, String> map;
	
	
	public CustomImmutabl(int id, String name, Map<String, String> map) {
		this.id = id;
		this.name = name;
		
		
		
		//empty map
		 HashMap<String, String> temp = new HashMap<String, String>();
		 
		 for(Map.Entry<String, String> entry: map.entrySet()) {
			 
			 temp.put(entry.getKey(), entry.getValue());
		 }
		 
		 this.map = temp;
		 
	}


	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}
	
	
	
	
}

public class Main {

	public static void main(String[] args) {
			CustomImmutabl obj = new CustomImmutabl(10,"sachin", null);
			System.out.println(obj.hashCode());
//			System.out.println(obj.getId());
//			System.out.println(obj.getName());
			CustomImmutabl obj1 = new CustomImmutabl(7,"dhoni", null);
			System.out.println(obj1.getId());
			System.out.println(obj1.getName());
			System.out.println(obj1.hashCode());

			
			
	}

}
// make class final
//make varibale final and private
// make only getter 
// dont provie any settter

