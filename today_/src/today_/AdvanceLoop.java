package today_;

import java.util.Arrays;
import java.util.List;

class Student{
	
	int id ;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	
	
	
}

public class AdvanceLoop {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(new Student(10,"sachin"), 
				                           new Student(45,"rohit"));
		
		///list to mao converion   k - id   v - name;
		
		
    // basic 
		
				
		
		
		  
		  

	}

}
