package com.practice;

public class Static_Method {
	
	public static String sayHi(String str) {
		return "Hi "+str;
	}
	
	public static void main(String[] args) {
		Static_Method sm=new Static_Method();
		System.out.println(sm.sayHi("siri"));
		System.out.println(Static_Method.sayHi("krishna"));
	}

}
