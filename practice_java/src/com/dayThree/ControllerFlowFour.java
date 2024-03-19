package com.dayThree;
/*Control flow in try-finally
 * 
 * When exception happen in try and catch block is not present
 * */


public class ControllerFlowFour {
public static void main(String[] args) {
	int arr[] = new int[4];
	try {
		int a = arr[4];//risky code
		//this line never bcuze above exception happen
		System.out.println("inside the try block");
	} finally {
		//exception hanppen or not finally always run
		System.out.println("inside the finally block");
	}
	
	//this line never run buze exception not handle properly
	System.out.println("outside the try-finally block");
}
}

/*-----------------------OUTPUT-----------------------------
 * inside the finally block 
 * Exception in thread "main"
 * java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
 * at com.dayThree.ControllerFlowFour.main(ControllerFlowFour.java:9)
 */