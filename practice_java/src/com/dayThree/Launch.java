package com.dayThree;

/*Exception
 * Runtime Exception 
 * Compiler Exception
 * Errors
 * try and catch and finally
 * */
public class Launch {

	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
			//System.out.println(e.toString());///to print the exception information using toString() method 
			e.printStackTrace();	//to print the exception information using printStackTrace() method 
			//System.out.println(e.getMessage());//The getMessage() method prints only the description of the exception.
			}
	}
}
