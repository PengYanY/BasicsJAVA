package com.pdl.conllection;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorAndForeach {
	public static void main(String[] args) {
		for (String string : new IteratorClass()) {
			System.out.print(string+" ");
		}
		System.out.println();
		for (String string : new IteratorClass1()) {
			System.out.print(string+" ");
		}
	}
}

//实现Iterable接口，并可以使用foreach
class IteratorClass implements Iterable<String>{

	
	protected String [] world ="And that is how we know the Earth to be banana-shaped.".split(" ");
	
	@Override
	public Iterator<String> iterator() {
		
		return new Iterator<String>(){
			private int index=0;
			@Override
			public boolean hasNext() {
				return index<world.length;
			}

			@Override
			public String next() {
				
				return world[index++];
			}
			
		};
	}
	
}

//可以实现反向的输出
class IteratorClass1 implements Iterable<String>{

	
	protected String [] world ="And that is how we know the Earth to be banana-shaped.".split(" ");
	
	@Override
	public Iterator<String> iterator() {
		
		return new Iterator<String>(){
			private int index=world.length-1;
			@Override
			public boolean hasNext() {
				return index>-1;
			}

			@Override
			public String next() {
				
				return world[index--];
			}
			
		};
	}
}

class ReversibleArrayList<T> extends ArrayList<T>{
	
}






