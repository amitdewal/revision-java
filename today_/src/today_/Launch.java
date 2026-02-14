package today_;

public class Launch {

	
	public static void main(String[] args) {
		
		
		String str = "amit dewal";
		
		String[] arr = str.split("");
		String temp ="";
		
		for(int i = arr.length-1; i>= 0; i--) {
			temp = temp + arr[i];
			//System.out.println(temp);
		}
		
		System.out.println(temp);
	}
}
