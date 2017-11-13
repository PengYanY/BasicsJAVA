package com.pdl.conllection;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
	public static void main(String[] args) {
		List<Boy> list=new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Boy b=new Boy(i);
			list.add(b);
		}
		
		ListIterator<Boy> it=list.listIterator();
		while(it.hasNext()){
			System.out.println(it.next().age+"--"+it.nextIndex()+"--"+it.previousIndex());
		}
		
		System.out.println("-------------------");
		while(it.hasPrevious()){
			System.out.println(it.previous().age+"--"+it.nextIndex()+"--"+it.previousIndex());
		}
		
		//可以选有几个
		it=list.listIterator(5);
		
		System.out.println("-------------------");
		while(it.hasPrevious()){
			System.out.println(it.previous().age+"--"+it.nextIndex()+"--"+it.previousIndex());
		}
		
	}
}
