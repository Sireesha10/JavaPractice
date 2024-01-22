package com.day1;

public class PrimeFactors {
	public static void main(String[] args) {
		int num = 280;
		int c;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				int temp = i;
				c = 0;
				for (int j = 1; j <= temp; j++) {
					if (temp % j == 0)
						c++;
				}
				if (c == 2)

					System.out.println(i);
			}
		}
	}
}
