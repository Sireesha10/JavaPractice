package com.basics;

import java.util.Arrays;

//write a program to a sort a Array of String in ascending oreder alphabetially
//i/p String s=["Capgemini","Accenture","TCS","EPAM"]
//o/p =[Accenture,Capgemini,EPAM,TCS]
		
public class Sorting_AO_Strings_9 {
	
	public static void main(String[] args) {
//		String s1="siri";
//		String s2="ravi";
//		System.out.println(s2.compareTo(s1));
		
		String original[]= {"Capgemini","Accenture","TCS","EPAM"};
		for(int i=0;i<original.length;i++) {
			for(int j=i+1;j<original.length;j++) {
				if(original[i].compareTo(original[j])>0) {
					String temp=original[j];
					original[j]=original[i];
					original[i]=temp;
				}
			}
		}
		System.out.println(original);
		System.out.println(Arrays.toString(original));
	}

}
