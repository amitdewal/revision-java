package stringOne.one;

public class Launch {
public static void main(String[] args) {
	
//	String  s1 = "a";
//	String s2 = "A";
//	System.out.println(s1.compareTo(s2)); 
	
	
	//startsWth
//	String str = "this is a boy";
//	//System.out.println(str.startsWith("this"));
//	System.out.println(str.contains("is a boy"));
	
	
	String  s = "abcde";//0 1 2 3 4
	System.out.println(s.substring(3));//de
	System.out.println(s.substring(1,4));//bcd
	System.out.println(s.substring(2,2));// no printing
	System.out.println(s.substring(0,5));//abcde
	//System.out.println(s.substring(0,6));// java.lang.StringIndexOutOfBoundsException:
}
}
