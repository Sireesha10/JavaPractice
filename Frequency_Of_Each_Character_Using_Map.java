package com.today;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Frequency_Of_Each_Character_Using_Map {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		Map<Character,Integer> freq=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				continue;
			}else {
				if(freq.containsKey(str.charAt(i))) {
					freq.put(str.charAt(i), freq.get(str.charAt(i))+1);
				}else {
					freq.put(str.charAt(i), 1);
				}
			}
		}
		System.out.println(freq);
	}

}
