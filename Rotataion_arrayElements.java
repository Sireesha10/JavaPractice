package com.day1;

import java.util.Arrays;
import java.util.Scanner;

public class Rotataion_arrayElements {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		Scanner sc=new Scanner(System.in);
		System.out.println("enter d");
		int d=sc.nextInt();
		if(d>arr.length) {
			System.out.println("not possible");
		}
		else {
			int[] newArr=new int[arr.length];
			int j=0;
			for(int i=d;i<arr.length;i++) {
				newArr[j]=arr[i];
				j++;
			}
			
			for(int i=0;i<d;i++) {
				newArr[j]=arr[i];
				j++;
			}
			System.out.println(Arrays.toString(newArr));
			}
	}

}
