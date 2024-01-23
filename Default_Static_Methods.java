package com.practice;

public interface Default_Static_Methods {
	public abstract void sayHi();
	
	default String name() {
		return "siri";
	}
	
	static void display() {
		System.out.println("in display");
	}
}
