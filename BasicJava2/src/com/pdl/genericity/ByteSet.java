package com.pdl.genericity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ByteSet {
	public static void main(String[] args) {
		Byte[] arr={1,2,3,4,5,6,7};
		Set<Byte> myset=new HashSet<Byte>(Arrays.asList(arr)); 
		
		for (Byte byte1 : myset) {
			System.out.println(byte1);
		}
		
		//这样是编译不通过的，因为传入的1,2,3..是Integer
		//Set<Byte> myset1=new HashSet<Byte>(Arrays.<Byte>asList(1,2,3,4,5)); 
		
		Set<Byte> myset2=new HashSet<Byte>(Arrays.<Byte>asList(arr)); 
		
		
		String[] strings=FArray.fill(new String[7],new RandomGenerator.MyString() );
		
		for (String string : strings) {
			System.out.println(string);
		}
		
		System.out.println("================================");
		Integer[] integers=FArray.fill(new Integer[7],new RandomGenerator.MyInteger() );
		
		for (Integer integer : integers) {
			System.out.println(integer);
		}
		
		//数组不能自动装箱
		//Integer[] integers1=FArray.fill(new int[7],new RandomGenerator.MyInteger() );
		
	}
}


class FArray{
	public static <T> T[] fill(T[] a,Generator<T> gen){
		for (int i = 0; i < a.length; i++) {
			a[i]=gen.creat();
		}
		return a;
	}
} 


class RandomGenerator{
	
	public static class MyString implements Generator<String>{
		private static Random rand=new Random(47);
		@Override
		public String creat() {
			return new String("ABC:"+rand.nextInt(1000));
		}
	} 
	
	public static class MyInteger implements Generator<Integer>{
		private static Random rand=new Random(47);
		@Override
		public Integer creat() {
			return new Integer(rand.nextInt(100));
		}
		
	}
		
}



interface Payable<T>{}

class Employee2 implements Payable<Employee2>{}

//不能编译，会认为两次实现同一个接口，但其泛型类型不一样
//class Hourly extends Employee2 implements Payable<Hourly>{}

class Hourly3 extends Employee2 implements Payable<Employee2>{
	
}

class Employee3 implements Payable{}

class Hourly2 extends Employee3 implements Payable{}



















