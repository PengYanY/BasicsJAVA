package com.pdl.genericity;



public class ErasedTest3 {
	public static void main(String[] args) {
		
		ClassAsFactory<Employee> caf=new ClassAsFactory<>(Employee.class);
		
		
		//这样将抛出异常，因为Integer没有默认构造器
		//ClassAsFactory<Integer> caf1=new ClassAsFactory<>(Integer.class);
	}
}

class Erased<T>{
	
	private final int SIZE=100;
	Class<T> kind;
	
	//虽然Class<T>被擦除为Class，但是还是可以表示Class对象的
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
		
		//这些都是不允许的
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










