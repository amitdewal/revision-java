package com.array;

import java.util.HashSet;
import java.util.Objects;

public class Student {
		int id;
		String name;
		
		
		@Override
		public int hashCode() {
			return Objects.hash(id, name);
		}




		public Student(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}


		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + "]";
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public static void main(String[] args) {
			 HashSet<Student> set = new HashSet<Student>();
			 set.add(new Student(101,"amit"));
			 set.add(new Student(101,"amit"));
			 System.out.println(set);
			 System.out.println(set.size());
			 
		}
}