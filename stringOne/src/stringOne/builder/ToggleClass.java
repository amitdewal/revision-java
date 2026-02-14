package stringOne.builder;

public class ToggleClass {
	
	public static String toggleString(String str) {
		int n = str.length();
		StringBuilder sb = new StringBuilder(str);
		
		for (int i = 0; i < n; i++) {//aAbBcC--> AaBbCc  a- 0=97  A-65
			char ch = sb.charAt(i);
			int ascii = (char) ch;// conver char into ascii value
			
			if(ascii >= 65 && ascii <=90) {
				ascii+=32;
				//ch = (char) ascii;
				//sb.setCharAt(i, ch);
				
			}
			else if(ascii >= 97 && ascii <=122) {
				ascii-=32;
//				ch = (char) ascii;
//				sb.setCharAt(i, ch);
				
			}
			ch = (char) ascii;
			sb.setCharAt(i, ch);
			
			
		}
		return sb.toString();
	}
			

	


	public static void main(String[] args) {
			String str = "aSDFGHgfghhgfghjk";
			
			System.out.println(str);
			System.out.println(toggleString(str));
	}

}
