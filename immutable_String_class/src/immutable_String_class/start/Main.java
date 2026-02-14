package immutable_String_class.start;

import java.util.HashMap;

public class Main {
public static void main(String[] args) {
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	map.put("101", "abc");
	map.put("102", "xyz");
	map.put("103", "mno");
	
	CustomImmutableClass obj = new CustomImmutableClass(10, "sachin", map);
	
	System.out.println(obj.getId());
	System.out.println(obj.getName());
	
	System.out.println(obj.getMetaData());
	
	map.put("102", "mno");
	
	
	System.out.println(obj.getMetaData());
	
}


}
