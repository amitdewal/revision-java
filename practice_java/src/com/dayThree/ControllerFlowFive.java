package com.dayThree;

/*Exception not raised: 
 * If an exception does not occur in the try block 
 * then the control flow will be finally block followed by the rest of the program
*/
public class ControllerFlowFive {
public static void main(String[] args) {
	try {
		String str = "123";
		
		int a = Integer.parseInt(str);
		//no exception below line run
		System.out.println("inside the try block ");
	} finally {
		System.out.println("inside the finally block");
	}
	
	//no exception in try so below line run
	System.out.println("outside the try-finally block");
}
}

/*----------------OUTPUT--------------------
 * inside the try block 
 * inside the finally block 
 * outside the try-finally block
 */