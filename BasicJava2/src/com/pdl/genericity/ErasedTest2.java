package com.pdl.genericity;



public class ErasedTest2 {
	public static void main(String[] args) {
		HasF h=new HasF();
		Manipulator<HasF> m=new Manipulator<>(h);
		
		m.manipulate();
		
		Derived g=new Derived();
		//g.set(arg);
		System.out.println(g.get());
		String s="name";
		g.set(s);//这样的话将有一个警告
		System.out.println(s);
		System.out.println(g.get());
		
		GenericBase<String> g1=new GenericBase<>();
		g1.set("123");
		
		String str=new String();
		System.out.println(str+"!");
	}
}



class HasF{
	public void f(){
		System.out.println("F()");
	}
}

class Manipulator<T extends HasF>{
	private T o;
	public Manipulator(T t){
		o=t;
	}
	
	public void manipulate(){
		//不能通过编译
		//o.f();
		//得加上T extends HasF才能编译通过，指定上限
		o.f();
	}
}


class GenericBase<T>{
	
	private T element;
	public void set(T arg){
		element=arg;
	}
	
	public T get(){
		return element;
	}
}

//这样继承也是可以的，但是会有警告
class Derived extends GenericBase{
	
}







