package com.pdl.genericity;

import java.util.Iterator;
import java.util.Random;

import javax.management.RuntimeErrorException;

public class GeneratorTest {
	public static void main(String[] args) {
		CoffeeGenerstor gen=new CoffeeGenerstor(4);
		for (int i = 0; i < 5; i++) {
			System.out.println(gen.creat());
		}
		
		for(Coffee c:new CoffeeGenerstor(5)){
			System.out.println(c);
		}
	}
}


interface Generator<T>{ T creat();}


 class Coffee{
	 //counter只有一份，只会初始化一次
	private static long counter=0;
	//每个对象拥有一份
	private final long id=counter++;
	
	@Override
	public String toString(){
		return this.getClass().getSimpleName()+"  "+id;
	}
}
 
 class Latte extends Coffee{}
 class Mocha extends Coffee{}
 class Cappuccino extends Coffee{}
 class Americano extends Coffee{}
 class Breve extends Coffee{}
 
 
 class CoffeeGenerstor implements Generator<Coffee>,Iterable<Coffee>{
	 
	 private Class[] types={
			 Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class
	 };
	 
	 private static Random rand=new Random(47);
	 private int size=0;
	 
	 CoffeeGenerstor(){}
	 CoffeeGenerstor(int size){this.size=size;}
	 
	 
	 class CoffeeIterator implements Iterator<Coffee>{
		int count=size;
		@Override
		public boolean hasNext() {
			return count>0;
		}
		
		@Override
		public Coffee next() {
			count--;
			return creat();
		}
	 }
	@Override
	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

	@Override
	public Coffee creat() {
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} 
	}
	 
 }
 