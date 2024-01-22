package com.day1;

public class ArraysCheck {
	public static void main(String[] args) {
		int[] arr1= {1,2,3,5,5,8};
		int[] arr2= {1,2,3,5,5,8,9};
		if(arr1.equals(arr2)) {
			System.out.println("Yes both are equal");
		}
		else {
			System.out.println("Both are not equal");
		}
		
//		int[] arry= {1,2,3,4,5,6};
//		int[] arrx= {11,12,13,14,15,16};
//		System.arraycopy(arry, 0, arrx, 1, 2);
//		System.out.println(Arrays.toString(arrx));
	}

}
