package com.today;

import java.util.Scanner;

public class Armstrong_Number {
	public static int calculateDigits(int n) {

		int count = 0;

		while (n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

	public static boolean checkForArmstrong(int num, int digits) {
		boolean b = false;
		
		int resultant = 0;
		int num2 = num;
		
		while (num > 0) {
			
			int n = num % 10;
			
			int powerResult = 1;
			
			for (int i = 0; i < digits; i++) {
				powerResult *= n;
			}
			
			resultant += powerResult;
			num = num / 10;
		}
		
		if (num2 == resultant) {
			b = true;
		}
		
		return b;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		int numberOfDigits = calculateDigits(num);
		
		System.out.println("Total digits " + numberOfDigits);

		boolean isArmstrong = checkForArmstrong(num, numberOfDigits);
		
		if (isArmstrong) {
			System.out.println("Yes - an armstrong");
		} else {
			System.out.println("No - not an armstrong");
		}
		sc.close();
	}

}
