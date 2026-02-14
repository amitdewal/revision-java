package oops.start;

import java.util.HashMap;
import java.util.Map;

final class Student{
	private final int id;
	private final String name;
	private final Map<String, String> metaData;
	
	public Student(int id,String name,Map<String,String> metaData){
		this.id = id;
		this.name= name;
		
		HashMap<String, String> tempMap = new HashMap<String, String>();
		
		for(Map.Entry<String, String> entry : metaData.entrySet()) {
			
			tempMap.put(entry.getKey(), entry.getValue());
		}
		
		this.metaData = tempMap;
		
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Map<String, String>  getMetaData() {
		
		HashMap<String, String> tempMap = new HashMap<String, String>();
		
		for(Map.Entry<String, String> entry :this.metaData.entrySet()) {
			tempMap.put(entry.getKey(),entry.getValue());
		}
		return tempMap;
	}
	
}


public class Launch {
public static void main(String[] args) {
	
	HashMap<String, String> map = new HashMap<String, String>();
	map.put("101", "abc");
	
	//map.put("102", "xyz");
	Student student = new Student(10, "sachin",map);
	
	System.out.println(student.getId());
	System.out.println(student.getName());
	System.out.println(student.getMetaData());
	
	student.getMetaData().put("125", "ghi");
	student.getMetaData().put("56", "kbc");
	System.out.println(student.getMetaData());
	student.getMetaData().put("125", "ghi");
	student.getMetaData().put("56", "kbc");
	
}

}
