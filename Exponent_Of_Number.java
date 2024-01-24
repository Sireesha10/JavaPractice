package com.today;

import java.util.Scanner;

public class Exponent_Of_Number {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		int base = sc.nextInt();
		
		System.out.println("Enter power");
		int power = sc.nextInt();
		double resultant = 1;

		if (base == 0) {
			System.out.println(0);
		}
		else if (power == 0) {
			System.out.println(1);
		} 
		else if (power < 0) {
			
			int op = 0 - power;
			
			for (int i = 0; i < op; i++) {
				resultant *= base;
			}
			
			double final_Resultant = 1 / resultant;
			System.out.printf(base + " power " + power + " = %.6f",final_Resultant);
		}
		
		else if (power > 0) {
			for (int i = 0; i < power; i++) {
				resultant *= base;
			}
			System.out.println(base + " power " + power + " = " + (resultant));
		}
	}

}
