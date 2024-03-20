package com.dayFour;

/*Singleton class its implementation
 * 
 * */
class Singleton{
	public static Singleton single_instance = null;
	public String str ;
	
	
	private Singleton() {
		str = "this is string field in the singleton class";
	}
	
	public static synchronized Singleton  getInstance() {
		if(single_instance == null) {
			single_instance = new Singleton();
		}
		return single_instance;
	}
}

public class Main {

	public static void main(String[] args) {

		     Singleton singletonOne = Singleton.getInstance();
		     Singleton singletonTwo = Singleton.getInstance();
		     Singleton singletonThree = Singleton.getInstance();
		     
		     //same hashCode value of memory address of the object of singleton
		     //this shows only on object created
		     System.out.println(singletonOne.hashCode());//1651191114
		     System.out.println(singletonTwo.hashCode());//1651191114
		     System.out.println(singletonThree.hashCode());//1651191114
		     
		     System.out.println(singletonOne.str);
		     System.out.println(singletonTwo.str);
		     System.out.println(singletonThree.str);
	}

}
