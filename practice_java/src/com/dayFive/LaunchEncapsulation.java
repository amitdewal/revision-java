package com.dayFive;

/*Encapsulation in Java is a process of wrapping
 *  code and data together into a single unit
*/
class Student
{
	private String name;
	private int rollNumber;

	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getRollNumber() 
	{
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) 
	{
		this.rollNumber = rollNumber;
	}
}
public class LaunchEncapsulation {
		public static void main(String[] args) {
			Student obj = new Student();
			obj.setName("sachin");
			///obj.name;  => compiler time bcuze name is private
			System.out.println(obj.getName());//sachin
		}
}
