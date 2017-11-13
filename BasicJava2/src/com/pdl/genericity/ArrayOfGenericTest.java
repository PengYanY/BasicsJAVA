package com.pdl.genericity;

import java.lang.reflect.Array;

public class ArrayOfGenericTest {
	public static void main(String[] args) {
		//GenericOfArray.main(args);
		
		//GenericArrayTest2.main(args);
		
		//GenericArrayTest3.main(args);
		
		GenericArrayTest4.main(args);
	}
}

class ClassA{}
class ClassB extends ClassA{}



class GenericTest1<T>{
	void test(){
		System.out.println("helllo...");
	}	
}


class ArrayReference{
	static GenericTest1<Integer>[] gia;
	
}


class GenericOfArray{
	
	static final int SIZE=100;
	static GenericTest1<String>[] gia;
	
	static ClassA[] clzz;
	
	public static void main(String[] args) {
		
		//这样会抛出cast异常
		//gia=(GenericTest1<Integer>[]) new Object[SIZE];
		
		//clzz=(ClassA[]) new Object[SIZE];; 
		
		//创建一个已经擦除的数组
		gia=new GenericTest1[SIZE];
		clzz= new ClassA[SIZE];; 
		
		System.out.println(gia.getClass().getSimpleName());
		
		gia[0]=new GenericTest1<String>();
		
		gia[1]=new GenericTest1();
		
		//出现编译时的错误
		//gia[1]=new GenericTest1<Integer>();
		
		//gia[1]=(GenericTest1<String>) new Object();
		
		
		//clzz[0]=(ClassA) new Object();
		
		
		ClassB clb=new ClassB();
		
		ClassA cla=new ClassA();
		
		//cla=clb;//不会出错
		
		//clb=(ClassB) cla;//报错，因为cla  不是clb类
		
	}
	
	
}




class GenericArrayTest2<T>{
	
	private T[] array;
	
	public GenericArrayTest2(int sz){
		
		array=(T[]) new Object[sz];
	}
	
	
	public void put(int index,T item){
		array[index]=item;
	}
	
	
	public T get(int index){
		return array[index];
	}
	
	public T[] rep(){
		return array;
	}
	
	public static void main(String[] args) {
		
		GenericArrayTest2<Integer> gai=new GenericArrayTest2<>(10);
		
		
		//转型错误 ClassCastException
		//因为底层创建的是Object[],不能转换
		Integer[] ia=gai.rep();
		
		//也会出现cast错误array=(T[]) new Object[sz];array为Integer[]
		//gai.put(0, 12);
		
		//System.out.println(gai.get(0));
		
	}
	
}



class GenericArrayTest3<T>{
	
	private Object[] array;
	
	public GenericArrayTest3(int sz){
		
		array=(T[]) new Object[sz];
	}
	
	
	public void put(int index,T item){
		array[index]=item;
	}
	
	
	public T get(int index){
		return (T) array[index];
	}
	
	public T[] rep(){
		return (T[]) array;
	}
	
	public static void main(String[] args) {
		
		GenericArrayTest3<Integer> gai=new GenericArrayTest3<>(10);
		
		//这样创建的话可以put和get工作，但是还是无法(T[]) array;发生异常
		gai.put(0, 12);
		
		System.out.println(gai.get(0));
		
		
		//Integer[] ia=gai.rep();//异常
	}
	
}






class GenericArrayTest4<T>{
	
	private T[] array;
	
	public GenericArrayTest4(Class<T> type,int sz){
		
		array=(T[])Array.newInstance(type, sz);
	}
	
	
	public void put(int index,T item){
		array[index]=item;
	}
	
	
	public T get(int index){
		return (T) array[index];
	}
	
	public T[] rep(){
		return (T[]) array;
	}
	
	public static void main(String[] args) {
		
		GenericArrayTest4<Integer> gai=new GenericArrayTest4<>(Integer.class,10);
		
		//这样创建的话可以put和get工作，但是还是无法(T[]) array;发生异常
		gai.put(0, 12);
		//gai.put(1, "");
		System.out.println(gai.get(0));
		
		//这样就可以运行了
		Integer[] ia=gai.rep();//异常
		
		System.out.println("-------------");
	}
	
}













