package com.pdl.conllection;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet();
		for (int i = 0; i <10; i++) {
			set.add(i);
		}
		
		for (Integer integer : set) {
			System.out.print(integer+"-");
		}
	}
}
