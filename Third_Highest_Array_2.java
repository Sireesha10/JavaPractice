package com.basics;

import java.util.Arrays;

public class Third_Highest_Array_2 {

	public static void main(String[] args) {
		int[] arr= {33,54,76,14,99,25,63,-74,65};
		
		int[] arr2= {33,54,76,14,99,25,63,-74,65};
		Arrays.sort(arr2);
		System.out.println("Sorted array: "+Arrays.toString(arr2));
		
		int first=0,second=0,third=0;
		if(arr[0]>arr[1]) {
			first=arr[0];
			second=arr[1];
		}else {
			first=arr[1];
			second=arr[0];
		}
		
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>first) {
				third=second;
				second=first;
				first=arr[i];
			}else if(arr[i]>second) {
				third=second;
				second=arr[i];
			}else if(arr[i]>third) {
				third=arr[i];
			}
		}
		System.out.println("1st highest: "+first);
		System.out.println("2nd highest: "+second);
		System.out.println("3rd highest: "+third);
		
	}

}
