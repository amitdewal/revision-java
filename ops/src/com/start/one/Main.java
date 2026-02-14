package com.start.one;

import java.util.Arrays;
import java.util.List;

class Employee{
	
	int age;
	String name;
	String city;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(int age, String name, String city) {
		super();
		this.age = age;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", city=" + city + "]";
	}
	
	
}
public class Main {
	
	public static void main(String[] args) {
		  List<Employee> list = Arrays.asList(new Employee(55, "sachin", "mumbai"), 
				                      		  new Employee(32, "virat", "delhi"),
				                      		  new Employee(51, "dhoni", "pune"));
		  
		  
		  
		  
		 
	}
	

}
