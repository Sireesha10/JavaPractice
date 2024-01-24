package com.today;

public class Reverse_A_Number {

	public static int calculateDigits(int n) {
		int count = 0;
		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	public static void main(String[] args) {
		int num = 45689;
		// 9*10pow0 8*10pow1
		int reversedNum = 0;
		int count = calculateDigits(num) - 1;
		while (num > 0) {
			int digit = num % 10;
			reversedNum += digit * Math.pow(10, count);
			count--;
			num = num / 10;
		}
		System.out.println("Reversed Num: " + reversedNum);

	}

}
