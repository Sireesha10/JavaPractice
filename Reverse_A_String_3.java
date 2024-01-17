package com.basics;

public class Reverse_A_String_3 {
	
	public static void main(String[] args) {
		String str="Hello World";
		System.out.println("Original String:"+str);
		
		String reverse_str="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse_str+=str.charAt(i);
		}
		System.out.println("Reversed String1:"+reverse_str);
		
		
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println("Revered String2:"+sb);
		
//		Stack st=new Stack<>();//lifo
//		for(int i=0;i<str.length();i++) {
//			st.push(str.charAt(i));
//		}
//		String rev2="";
//		int len=st.size();
//		for(int i=0;i<len;i++) {
//			rev2+=st.pop();
//		}
//		System.out.println("Revered String3:"+rev2);
	}

}

