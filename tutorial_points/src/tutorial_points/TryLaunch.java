package tutorial_points;

public class TryLaunch {
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println("outer try");
			
			try {
				
				System.out.println("iner try");
				int i = 10/0;
				
			} catch (Exception e) {
				System.out.println("inner catch");
			}
			
		} catch (Exception e) {
			System.out.println("outer catch");
		}
	}

}
