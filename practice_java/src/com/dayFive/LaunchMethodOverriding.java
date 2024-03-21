package com.dayFive;

/*method overriding in java oops
*/

//parent class
class Vehicle{
	void run() {
		System.out.println("vehicle is running");
	}
}
//child class
class Bike extends Vehicle{
	
	//specific implementation of parent class method to child class method
	@Override
	void run() {
		System.out.println("bike is running");
	}
}

public class LaunchMethodOverriding {
	
	public static void main(String[] args) {
		Bike obj = new Bike();
		obj.run();//bike is running
	}
}

/* some points to remember
 * a static method cannot be overridden
 * it is because the static method is bound with class whereas instance method is bound with an object.
 *  
 *  
 *  */
