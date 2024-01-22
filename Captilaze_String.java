package com.day1;

public class Captilaze_String {
	public static void main(String[] args) {
		String str="java full stack development";
		String[] strArray=str.split(" ");
		String newString="";
		for(int i=0;i<strArray.length;i++) {
			int length=strArray[i].length();
			strArray[i]=strArray[i].substring(0,1).toUpperCase()+strArray[i].substring(1,length-1)+strArray[i].substring(length-1).toUpperCase();
			newString+=strArray[i]+" ";
		}
		System.out.println(newString);
		
		//System.out.println(str.indexOf('s',11));
	}

}
