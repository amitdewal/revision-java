package com.dayThree;

/*try-catch 
 * 
 * Exception occurr in try block and caught in catch block
 * 
 * */
public class ControllerFlow {
	public static void main(String[] args) {

		int arr[] = new int[4];

		try {
			int a = arr[4];// risky code line

			// this statement never run; bcuze exception occur above line
			System.out.println("inside the try block");
		} catch (ArrayIndexOutOfBoundsException e) {
			// this line execute
			System.out.println("exception caught in catch block");

		} finally {
			// after catch block finally block run
			System.out.println("in the finally block");
		}

		// after finally this below line will run
		System.out.println("outside the try-catch block");
	}

	/*
	 * ########### OUTPUT ############### 
	 * exception caught in catch block 
	 * in the finally block
	 *  outside the try-catch block
	 *
	 */

}
