package com.dayThree;

/*try-catch 
 * 
 * Exception occur in try block and did not catch in catch block
 * 
 * */
public class ControllerFlowTwo {
	
	
	public static void main(String[] args) {
		int arr [] = new int[4];
		
		try {
			int a = arr[4];//risky line 
			
			//this line never run
			System.out.println("inside the try block");
			
			//Mismatch catch block exception don't match
		} catch (NullPointerException e) {
			//this line never run bcuz exception never catch
			System.out.println("NullPointerException occurred");
		}
		finally {
			System.out.println("inside the finally block");
		}
		
		//this line never run bcuze exception is not handled in the catch block
		System.out.println("outs side the try-catch-finally block");
	}
	
	
}
/*__________________OUTPUT__________________________________
 * 
 * inside the finally block Exception in thread "main"
 * java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
 * at com.dayThree.ControllerFlowTwo.main(ControllerFlowTwo.java:15)
 */


