package oops.start;



class Parent1 {
	void show() {
		System.out.println("hello from parent");
	}
}

class Parent2 {
	void show() {
		System.out.println("hello from parent");
	}
}


class Child extends Parent1{
	void show() {
		super.show();
		System.out.println("hello from child");
	}
}
public class Main {
public static void main(String[] args) {
	Child obj = new Child();
	obj.show();
}
}
