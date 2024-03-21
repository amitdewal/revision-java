package com.qustion;

/* --deep copy and shallow copy-- 
 * deep copy means different memory address.
 * shallow copy means same memory address.
 * in shallow copy if we change the original object then
 * its effect we can see in the copy object(means copy object also change)
 * but this is not possible in the deep copy
 * */
import java.util.ArrayList;
import java.util.List;

class Student{
	int id;
	String name;
	
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
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
public class Launch {
public static void main(String[] args) {
	List<Student> originalList = new ArrayList<Student>();
	originalList.add(new Student(10, "sachin"));
	originalList.add(new Student(7, "dhoni"));
	
	List<Student>  copylist = new ArrayList<Student>(originalList);//shallow copy creation
	
	List<Student>  deepCopy = new ArrayList<Student>();//deep copy creation
	
	for (Student student : originalList) {//deep copy creation
		deepCopy.add(new Student(student.getId(), student.getName()));
	}
	//changing the original object
	originalList.get(0).setName("kohli");
	originalList.get(0).setId(18);
	
	System.out.println(originalList.hashCode());//-1880323442 => same address
	System.out.println(copylist.hashCode());//-1880323442     => same address
	System.out.println(deepCopy.hashCode());//-1292852930     => different address
	System.out.println(originalList);//[Student [id=18, name=kohli], Student [id=7, name=dhoni]]
	System.out.println(copylist);//[Student [id=18, name=kohli], Student [id=7, name=dhoni]]
	System.out.println(deepCopy);//[Student [id=10, name=sachin], Student [id=7, name=dhoni]]
}
}

