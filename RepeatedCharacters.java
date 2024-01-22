package com.day1;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class RepeatedCharacters {
	public static void main(String[] args) {
		String str2 = "sai sireesha";

//		Map<Character, Long> map = str2.chars().mapToObj(i -> (char) i)
//				.collect(Collectors.groupingBy(j -> j, Collectors.counting()));
//		System.out.println(map);
//		System.out.println("Repeated characters are: ");
//		for(Character c:map.keySet()) {
//			if(map.get(c)>1) {
//				System.out.println(c);
//			}
//		}
		
		
		Set<Character> set=new HashSet<>();
		for(int i=0;i<str2.length();i++) {
			if(str2.indexOf(str2.charAt(i))!=str2.lastIndexOf(str2.charAt(i))) {
				set.add(str2.charAt(i));
			}
			
		}
		System.out.println(set);

	}
}