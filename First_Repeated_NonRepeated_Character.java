package com.today;

public class First_Repeated_NonRepeated_Character {
	public static void main(String[] args) {
		String str="Backspace Home End";
		for(int i=0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
				System.out.println("First non repeated char is: "+str.charAt(i));
				break;
			}
		}
		
		for(int i=0;i<str.length();i++) {
			if(!(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i)))) {
				System.out.println("First repeated char is: "+str.charAt(i));
				break;
			}
		}
	}

}
