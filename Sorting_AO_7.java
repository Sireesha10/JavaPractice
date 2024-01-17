package com.basics;

import java.util.Arrays;
import java.util.List;

public class Sorting_AO_7 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,4,0,1,56,23,4);
		System.out.println("original: "+list);
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)>list.get(j)) {
					int temp=list.get(j);
					list.set(j, list.get(i));
					list.set(i, temp);
				}
			}
		}
		System.out.println("sorted: "+list);
	}

}
