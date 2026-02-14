package interview_practice.start;
class Parent{
	
	public static  void print() {
		System.out.println("hello from parent");
	}
}


class Child extends Parent{
	public static  void print() {
		System.out.println("hello from child");
	}
}
	


public class Main {
	
	public static void main(String[] args) {
		
		//Parent p = new Parent();
		Parent p  = new Child();
		p.print();
		//c.print();
		
	}

}
