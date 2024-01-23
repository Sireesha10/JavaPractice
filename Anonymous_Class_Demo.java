package com.practice;

interface Suno{
	void disp();
}

abstract class abs{
	abstract void absDisp();
	
	public String name() {
		return "siri";
	}
}

public class Anonymous_Class_Demo {
	public static void main(String[] args) {
		Suno s=new Suno() {
			@Override
			public void disp() {
				System.out.println("hiii");
			}
		};
		s.disp();
		
		abs a=new abs() {
			
			public String name() {
				return "ravi";
			}
			
			public void absDisp() {
				System.out.println("in abs disp");
			}
		};
		System.out.println(a.name());
		a.absDisp();
	}
}
