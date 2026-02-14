package com.array;

 final class Employee{
	 private final int id;
	 private final String name;
	 
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	 
 }
public class CustomClass{

	public static void main(String[] args) {
		 Employee emp = new Employee(10, "sachin");
		 Employee emp1;
		 emp1 = emp;
		 System.out.println(emp);
		 System.out.println(emp1);
		 System.out.println(emp.getId());
		 System.out.println(emp.getName());
	}
}
