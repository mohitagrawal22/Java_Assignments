package com.masaiDay4Q2;

public class Demo {
	public Demo() {
		this("hello");
		System.out.println("This is non-parameterized Demo() constructor");
	}
	
	public Demo(String s) {
		this(10);
		System.out.println("This is Demo() constructor with String parameter");
	}
	
	public Demo(int i) {
		this(10.55f);
		System.out.println("This is Demo() constructor with Integer parameter");
	}
	
	public Demo(float f) {
		System.out.println("This is Demo() constructor with Float parameter");
	}
	
	public static void main(String[] args) {
		Demo d1 = new Demo();
	}
}