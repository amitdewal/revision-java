package com.start;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
	 private int id;
	 private int age;
	 private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int id, int age, int salary) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
	
	}
public class Example {
	
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(10, 31, 30000),
											new Employee(7, 29, 31000), 
											new Employee(18, 28, 29000),
											new Employee(45, 33, 25000));
		
//		Integer sum = list.stream().filter(emp -> emp.getAge() < 30)
//		             .map(emp -> emp.getSalary()).reduce(0,(a,b) -> a + b);
//		             System.out.println(sum);
//		             
//		             list.stream().filter(emp -> emp.getAge() < 30)
//		             .map(emp -> emp.getSalary()).forEach((emp) -> System.out.println(emp));
//		             
//		             list.stream().sorted(Comparator.comparing(Employee::getAge)
//		            		 .thenComparing(Employee::getId)).forEach((emp) -> System.out.println(emp));
		
		list.forEach(emp -> System.out.print(emp.getSalary() +" "));
		System.out.println();
//		Collections.sort(list, Comparator.comparing(Employee::getSalary));
//		list.forEach(emp -> System.out.print(emp.getSalary() +" "));
		
		List<Integer> reslist = list.stream()
									.sorted(Comparator.comparing(Employee::getSalary, Comparator.reverseOrder()))
									.map(emp -> emp.getSalary()).limit(2).skip(1)
									.collect(Collectors.toList());
		System.out.println(reslist);
		
		//[31000, 30000]

		
	
		
		
	}

}
