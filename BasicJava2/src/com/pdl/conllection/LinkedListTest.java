package com.pdl.conllection;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class LinkedListTest {
	
	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<>();
		for (int i = 0; i <5; i++) {
			list.add("string"+i);
		}
		
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.element());
		
		System.out.println(list.peek());
		System.out.println(list.remove());
		System.out.println(list.removeFirst());
		
		System.out.println(list.poll());
		list.addFirst("hello");
		list.offer("123");
		
		test();
		
		
		Stack s=new Stack();
		//s.pop();
		//s.push()
		
	}
	
	
	private static void  test(){
		LinkedList<String> list=new LinkedList<>();
	
		//System.out.println(list.getFirst());
		//System.out.println(list.getLast());
		//System.out.println(list.element());
		
		System.out.println(list.peek());//null
		//System.out.println(list.remove());
		//System.out.println(list.removeFirst());
		
		System.out.println(list.poll());//null
		list.addFirst("hello");
		list.offer("123");
	}
	
}
