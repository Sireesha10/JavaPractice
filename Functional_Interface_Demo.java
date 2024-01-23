package com.practice;

@FunctionalInterface
interface demoInterface{
	int i=9;
	void sayHi(String str);
	
//	int hashCode();
//	String toString();
}


public class Functional_Interface_Demo implements demoInterface {
	
	@Override
	public void sayHi(String str) {
		System.out.println("Hi "+str);
	}

	public static void main(String[] args) {
		Functional_Interface_Demo di=new Functional_Interface_Demo();
		di.sayHi("siri");
		System.out.println(di.i);
		System.out.println(di.hashCode());
		System.out.println(di.toString());
	}


}
