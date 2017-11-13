package com.pdl.conllection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionTest {
	
	public static void main(String[] args) {
		Collection<Integer> c=new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			c.add(i);
		}
		c.add(5);
		for (Integer integer : c) {
			System.out.print(integer+"  ");
		}
		System.out.println();
		
		//Set<Integer> c1=(Set<Integer>) new ArrayList<Integer>();
		
		Collection<Integer> c1=new HashSet<Integer>();
		
		for (int i = 0; i < 10; i++) {
			c1.add(i);
		}
		c1.add(5);
		for (Integer integer : c1) {
			System.out.print(integer+"  ");
		}
		System.out.println();
		Collection<Integer> c2=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		Collection<Integer> c3=new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3,4}));
		
		System.out.print(c2+":");
		for (Integer integer : c2) {
			System.out.print(integer+",");
		}
		System.out.println();
		
		System.out.print(c3+":");
		for (Integer integer : c3) {
			System.out.print(integer+",");
		}
		System.out.println();
		
		
		c2.addAll(Arrays.asList(11,12));
		Collections.addAll(c2, 1,2,3);
		
		//Collections.addAll(c3,new Integer[]{6,7});
		
		System.out.println(c2);
		System.out.println(c3);
		
		
		
		
		
		
		
	}
}
