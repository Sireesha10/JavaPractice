package com.today;

import java.util.Scanner;

public class Frequency_Of_Each_Character {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		String checked = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				continue;
			} else if (checked.contains(str.substring(i, i + 1))) {
				continue;
			} else {
				int count = 1;
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}
				checked += str.charAt(i);
				System.out.println(str.charAt(i) + " repeated " + count + " times");
			}
		}
	}

}
