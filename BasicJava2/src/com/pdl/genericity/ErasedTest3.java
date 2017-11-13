package com.pdl.genericity;



public class ErasedTest3 {
	public static void main(String[] args) {
		
		ClassAsFactory<Employee> caf=new ClassAsFactory<>(Employee.class);
		
		
		//�������׳��쳣����ΪIntegerû��Ĭ�Ϲ�����
		//ClassAsFactory<Integer> caf1=new ClassAsFactory<>(Integer.class);
	}
}

class Erased<T>{
	
	private final int SIZE=100;
	Class<T> kind;
	
	//��ȻClass<T>������ΪClass�����ǻ��ǿ��Ա�ʾClass�����
	public Erased(Class<T> kind){
		this.kind=kind;
	}
	
	public boolean test(Object o){
		return kind.isInstance(o);
	}

	
	public static void f(Object o){
		/*if(o instanceof T){}
		T vat=new T();
		
		T[] arr=new T[SIZE];
		
		T[] arr2=(T)new Object[SIZE];*/
		
		//��Щ���ǲ������
	}
	
	
}


class ClassAsFactory<T> {
	T x;
	ClassAsFactory(Class<T> kind){
		try {
			x=kind.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
		
			e.printStackTrace();
		}
	}
	
}


class Employee{}










