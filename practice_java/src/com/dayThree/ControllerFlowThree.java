package com.dayThree;

/*Exception does not occur in try-block: 
 * In this case catch block never runs 
 * as they are only meant to be run 
 * when an exception occurs. 
 * finally block(if present) will be executed followed by rest of the program. 
*/
public class ControllerFlowThree {
	
	
	public static void main(String[] args) {
		try {
			String str = "123";
			int num = Integer.parseInt(str);
			//no exception so below line will execute
			System.out.println("try block executed");
		} catch (NumberFormatException e) {
			System.out.println("inside the catch block");
		}finally {
			System.out.println("inside the finally block");
		}
		System.out.println("outside the try-catch-finally block");
		
	}
}
/*
 * try block executed 
 * inside the finally block 
 * outside the try-catch-finally block
 */



