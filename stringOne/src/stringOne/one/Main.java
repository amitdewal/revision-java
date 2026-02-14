package stringOne.one;

public class Main {
	
	public static int totalNumberOfDigists(int num) {
		
		String str = Integer.toString(num);
		System.out.println(str);
		
		return str.trim().length();
	}
	
	
	
	public static void printSubString(String str) {
		int n = str.length();//5
		for (int i = 0; i < n; i++) {
			
			for (int j = i+1; j <= n; j++) {
				System.out.print(str.substring(i, j)+" ");
			}
			System.out.println();
			
		}
	}
public static void main(String[] args) {
	//printSubString("abcde");//01234
	System.out.println(totalNumberOfDigists(1234567));
}
}
