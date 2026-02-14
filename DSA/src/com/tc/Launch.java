package com.tc;

import java.util.Objects;

class Student{
	int id;
	String name;
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
public class Launch {
	public static void main(String[] args) {
		
		Student s1 = new Student(10, "sachin");
		Student s2 = new Student(10, "sachin");
		
		
		System.out.println(s1.hashCode());//1651191114
		System.out.println(s2.hashCode());//1651191114
		System.out.println(s1.equals(s2));//false
	}
	

}
