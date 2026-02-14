package stringOne.builder;

public class Main {
public static void main(String[] args) {
	
	
	StringBuilder sb = new StringBuilder(10);
	System.out.println(sb);//
	System.out.println(sb.capacity());//10
	System.out.println(sb.length());//0
	sb.append("abcdefghijk");
	System.out.println(sb);//abcdefghijk
	System.out.println(sb.length());//11
	System.out.println(sb.capacity());
}
}
