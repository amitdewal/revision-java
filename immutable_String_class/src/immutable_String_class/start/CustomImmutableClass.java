package immutable_String_class.start;

import java.util.HashMap;
import java.util.Map;

//1 make final class -> to stop inheritance
//no setter
final public class CustomImmutableClass {
	
	final private  int id;
	final private String name;
	
	final private Map<String, String> metaData;
	
	public CustomImmutableClass(int id, String name, Map<String, String> map) {
		
		this.id = id;
		this.name = name;
		
		
		Map<String, String> temp = new HashMap<String, String>();
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			
			temp.put(entry.getKey(), entry.getValue());
		}
		
		this.metaData = temp;
		
		
		
	}
	
	
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
	public Map<String, String> getMetaData(){
		Map<String, String> temp = new HashMap<String, String>();
		
		
		for(Map.Entry<String, String> entry : this.metaData.entrySet()) {
			temp.put(entry.getKey(), entry.getValue());
		}
		
		return temp;
	}
	
	
	

}
