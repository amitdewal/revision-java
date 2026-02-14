package stringOne.builder;

import java.util.Date;

public class AppendFunction {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb);
		sb.append(true);
		System.out.println(sb);
		sb.append('z');
		System.out.println(sb);
		char ch []= {'q','w','e','r','t','y'};
		sb.append(ch);
		System.out.println(sb);
		sb.append("po");
		System.out.println(sb);
		sb.append(10.5);
		System.out.println(sb);
		sb.append(5.6f);
		System.out.println(sb);
		sb.append(100);
		System.out.println(sb);
		sb.append(new Date());
		System.out.println(sb);
		sb.append(new StringBuilder("lkj"));
		System.out.println(sb);
		
	}

}
