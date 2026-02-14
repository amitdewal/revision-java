package stringOne.builder;

import java.util.Scanner;

public class InbuiltFunction {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		System.out.println(sb);
		sb.setCharAt(4, 'z');
		System.out.println(sb);
	}

}
