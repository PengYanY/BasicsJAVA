package com.pdl.types;

public class IntClass {
	public static void main(String[] args) {
		Class intClass=int.class;

		Class<Integer> clazz=Integer.class;
		System.out.println(clazz==intClass);
		
		clazz=int.class;
		
		intClass=double.class;
		//clazz=double.class;

		Class<?> clazz1=int.class;
		clazz1=double.class;
		System.out.println(clazz1.getName());;
		
		
		Class<? extends Number> clazz2=int.class;
		clazz2=double.class;
		
		clazz2=Number.class;
		
		
		//���б��������Ϊint.class����Number.class������
		//Class<Number> clazz3=int.class;
		//clazz3=double.class;
		
		//clazz3=Number.class;
	}
}


