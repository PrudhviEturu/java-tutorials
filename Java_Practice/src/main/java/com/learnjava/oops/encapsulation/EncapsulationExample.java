package com.learnjava.oops.encapsulation;

class Student {
	private String name;
	private int age;

	// getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}
}

public class EncapsulationExample {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("John");
		s.setAge(21);
		System.out.println(s.getName() + " is " + s.getAge() + " years old.");
	}
}
