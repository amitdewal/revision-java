package com.dayFive;

/*parent class
 * 
 * 
 * */
class Employee {
	float salary = 400;
	
	public void sayHello() {
		System.out.println("hello");
	}
}


/* child class
 * 
 * using extend keyword , inheritance is done in java
 *  */
class Programmer extends Employee{
	int bonus = 100;
	
	public void sayHello() {
		System.out.println("hello from child");
	}
}

/* driver class */
public class LaunchOne {
	
	public static void main(String[] args) {
		Programmer p = new Programmer();
		
		System.out.println(p.salary);//400.0
		System.out.println(p.bonus);//100
	}
}
