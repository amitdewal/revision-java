package com.qustion;

class Employee implements Cloneable{
	int id;
	String name;
	
	public Employee(int id, String name) {
		super();
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
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee employee = new Employee(10, "sachin");
		Employee clone = (Employee)employee.clone();
		System.out.println(employee);
		System.out.println(clone);
		
		System.out.println(employee.hashCode());
		System.out.println(clone.hashCode());
	}
}

