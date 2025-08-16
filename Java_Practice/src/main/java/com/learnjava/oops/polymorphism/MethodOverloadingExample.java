package com.learnjava.oops.polymorphism;

class MathUtil {
	int add(int a, int b) {
		return a + b;
	}

	double add(double a, double b) {
		return a + b;
	}
}

public class MethodOverloadingExample {

	public static void main(String[] args) {
		MathUtil mathUtil = new MathUtil();
		System.out.println(mathUtil.add(1, 2));
		System.out.println(mathUtil.add(1.0, 2.0));

	}

}
