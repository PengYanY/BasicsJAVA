package com.pdl.genericity;



public class ErasedTest4 {

	public static void main(String[] args) {
		new Foo<Integer>(new IntegerFactory());
		new Foo<Widget>(new Widget.Factory());
		
		Creator c=new Creator();
		c.f();
		
	}
}

interface MyFactory<T>{
	T creat();
}

@SuppressWarnings("unused")
class Foo<T>{
	
	private T x;
	
	public <F extends MyFactory<T>> Foo(F factory){
		x=factory.creat();
	}
}


class IntegerFactory implements MyFactory<Integer>{

	@Override
	public Integer creat() {
		return new Integer(0);
	}
	
}

class Widget{
	public static class Factory implements MyFactory<Widget>{
		@Override
		public Widget creat() {
			return new Widget();
		}
		
	}
}


abstract class GenericWithCreate<T>{
	final T element;
	
	GenericWithCreate(){
		element=create();
	}
	
	abstract  T create();
	

}


class X{}



class Creator extends GenericWithCreate<X>{

	//create 方法在父类中执行的
	@Override
	X create() {
		return new X();
	}
	
	void f(){
		System.out.println("hello---------"+element.getClass().getSimpleName());
	}
	
}
























