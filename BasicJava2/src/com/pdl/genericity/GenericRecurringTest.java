package com.pdl.genericity;

public class GenericRecurringTest {
	public static void main(String[] args) {
		CRGWithBasicHolder.main(args);
		
		SelfBounding.main(args);
	}
}


class MyGeneric<T>{}

class CuriouslyRecurringGeneric extends MyGeneric<CuriouslyRecurringGeneric>{}




class BasicHolder<T>{
	T element;
	
	void set(T arg){element=arg;}
	
	T get(){return element;}
	
	void f(){
		System.out.println(element.getClass().getSimpleName());
		System.out.println(element);
	}	
}

class Subtype extends BasicHolder<Subtype>{}

class CRGWithBasicHolder{
	
	public static void main(String[] args) {
		
		Subtype s1=new Subtype(),s2=new Subtype();
		
		s1.set(s2);
		
		Subtype s3=s1.get();
		
		s1.f();
		
		System.out.println(s2);
	}
}




//自定界的作用
class SelfBounded<T extends SelfBounded<T>>{
	T element;
	
	SelfBounded<T> set(T arg){
		element=arg;
		return this;
	}
	
	T get(){return element;}
	
	void f(){
		System.out.println(element.getClass().getSimpleName());
		System.out.println(element);
	}	
}

class A extends SelfBounded<A>{}

class B extends SelfBounded<A>{}

class C extends SelfBounded<C>{
	C setAndGet(C arg){ set(arg);return get();}
}


class D{}

 ///class E extends SelfBounded<D>{}
 
 class F extends SelfBounded{}
 
 
 class SelfBounding{
	 public static void main(String[] args) {
		A a=new A();
		a.set(new A());
		
		a=a.set(new A()).get();
		
		a=a.get();
		
		C c=new C();
		c=c.setAndGet(new C());
	}
 }










