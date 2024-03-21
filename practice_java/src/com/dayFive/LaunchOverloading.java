package com.dayFive;

/*method overloading exmaple
 * If a class has multiple methods,
 * having same name
 * but different in parameters,
 * it is known as Method Overloading
 * 
 * */


/*Method Overloading: changing no. of arguments
*/class Adder{
	static int add(int a, int b) {
		return a + b;
	}
	
	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

/* Method Overloading: changing data type of arguments */

class Multiplication{
	static int doMultiply(int a, int b) {
		return a * b;
	}
	static double doMultiply(double a, double b) {
		return a * b;
	}
}


public class LaunchOverloading {
	public static void main(String[] args) {
		
		System.out.println(Adder.add(10, 20));//30
		System.err.println(Adder.add(100, 200, 300));//600
		
		
		System.out.println(Multiplication.doMultiply(10.5, 2.4));//25.2
		System.out.println(Multiplication.doMultiply(4, 5));//20
		
		
	}

}
