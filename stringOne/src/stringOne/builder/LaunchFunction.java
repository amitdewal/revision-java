package stringOne.builder;

public class LaunchFunction {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("abcd");
		System.out.println(sb);
		 StringBuilder reverse = sb.reverse();
		 System.out.println(reverse);
		System.out.println(sb);
	}

}
