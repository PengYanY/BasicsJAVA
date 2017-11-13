package com.pdl.internalclass;

public class CallBack {
	public static void main(String[] args) {
		Callee1 c1=new Callee1();
		Callee2 c2=new Callee2();
		
		MyIncrement.f(c2);
		
		Caller call1=new Caller(c1);
		Caller call2=new Caller(c2.getCallback());
		
		call1.go();
		call1.go();
		
		call2.go();
		call2.go();
	}
}

interface Incrementable{void increment();}


class Callee1 implements Incrementable{
	private int i=0;
	@Override
	public void increment() {
		i++;
		System.out.println("Calleel:i="+i);
	}
}

class MyIncrement {
	public void increment(){
		System.out.println("MyIncrement.increment");
	}
	static void f(MyIncrement mi){System.out.println("MyIncrement.f");mi.increment();}
}

class Callee2 extends MyIncrement{
	private int i=0;
	public void increment(){super.increment();i++;System.out.println("Callee2:i="+i);;}
	
	private class Closore implements Incrementable{

		@Override
		public void increment() {
			Callee2.this.increment();
		}	
	}
	
	Incrementable getCallback(){
		return new Closore();
	}
		
}

class Caller{
	private Incrementable callback;
	Caller(Incrementable in){
		callback=in;
	}
	void go(){
		callback.increment();
	}
}



















