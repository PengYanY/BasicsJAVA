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
		
		//�������׳�cast�쳣
		//gia=(GenericTest1<Integer>[]) new Object[SIZE];
		
		//clzz=(ClassA[]) new Object[SIZE];; 
		
		//����һ���Ѿ�����������
		gia=new GenericTest1[SIZE];
		clzz= new ClassA[SIZE];; 
		
		System.out.println(gia.getClass().getSimpleName());
		
		gia[0]=new GenericTest1<String>();
		
		gia[1]=new GenericTest1();
		
		//���ֱ���ʱ�Ĵ���
		//gia[1]=new GenericTest1<Integer>();
		
		//gia[1]=(GenericTest1<String>) new Object();
		
		
		//clzz[0]=(ClassA) new Object();
		
		
		ClassB clb=new ClassB();
		
		ClassA cla=new ClassA();
		
		//cla=clb;//�������
		
		//clb=(ClassB) cla;//������Ϊcla  ����clb��
		
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
		
		
		//ת�ʹ��� ClassCastException
		//��Ϊ�ײ㴴������Object[],����ת��
		Integer[] ia=gai.rep();
		
		//Ҳ�����cast����array=(T[]) new Object[sz];arrayΪInteger[]
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
		
		//���������Ļ�����put��get���������ǻ����޷�(T[]) array;�����쳣
		gai.put(0, 12);
		
		System.out.println(gai.get(0));
		
		
		//Integer[] ia=gai.rep();//�쳣
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
		
		//���������Ļ�����put��get���������ǻ����޷�(T[]) array;�����쳣
		gai.put(0, 12);
		//gai.put(1, "");
		System.out.println(gai.get(0));
		
		//�����Ϳ���������
		Integer[] ia=gai.rep();//�쳣
		
		System.out.println("-------------");
	}
	
}













