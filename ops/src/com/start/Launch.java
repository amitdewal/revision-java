package com.start;
class GrandParent{
	void eat() {
		System.out.println("from grandparent");
	}
	
}
class Parent extends GrandParent{
	
	 void running() {
		System.out.println("from parent");
		
	}
	 
	 void eat() {
			System.out.println("from parent eat method");
		}
}


class Child extends Parent{

void running() { System.out.println("from child "); }

}

public class Launch {
	
	public static void main(String[] args) {
		Parent c = new Child();
		   c.eat();
		
	}

}
