package com.dayFour;
/*factory design pattern
 * implementations
 * */

 interface Shape{
	void draw();
}
 
 class Circle implements Shape{
	@Override
	public void draw() {
		System.out.println("drawing circle");
	}
 }
 
 class Square implements Shape{
	@Override
	public void draw() {
		System.out.println("drawing Square");
	}
 }
 
  class Rectangle implements Shape{
	@Override
	public void draw() {
		System.out.println("drawing Rectangle");
	}
 }
  
  //shape factory class
  class ShapeFactory {
	  //shape factory method to create shape factory
	  
	  public Shape createShape(String shapeType) {
		  if(shapeType == null || shapeType == "") {
			  return null;
		  }
		  if(shapeType.equalsIgnoreCase("circle")) {
			  return new Circle();
		  }
		  else if(shapeType.equalsIgnoreCase("square")) {
			  return new Square();
		  }else if(shapeType.equalsIgnoreCase("rectangle")) {
			  return new Rectangle();
		  }
			 return null; 
	  }
  }

public class Launch {
public static void main(String[] args) {
	ShapeFactory shapeFactory = new ShapeFactory();
	Shape circle = shapeFactory.createShape("circle");
	circle.draw();
	Shape createShape = shapeFactory.createShape(null);
	System.out.println(createShape);
}
}
