package tutorial_points;

public class Demo {
	public static void main(String args[]) {
		System.out.print("a");
		try {
			System.out.print("b");
			int i = 10/0;
		}  finally {
			System.out.print("d");
		}
	}
}
