package com.practice;

public class ImplClass  implements Default_Static_Methods,Default_Static_Methods2{

	@Override
	public void sayHi() {
		System.out.println("hi");
		
	}
	
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "krishna";
	}

	public static void main(String[] args) {
		Default_Static_Methods dsm=new ImplClass();
		dsm.sayHi();
		System.out.println(dsm.name());
		Default_Static_Methods.display();
	}

}
