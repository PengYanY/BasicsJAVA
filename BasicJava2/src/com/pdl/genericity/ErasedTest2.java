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
		g.set(s);//�����Ļ�����һ������
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
		//����ͨ������
		//o.f();
		//�ü���T extends HasF���ܱ���ͨ����ָ������
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

//�����̳�Ҳ�ǿ��Եģ����ǻ��о���
class Derived extends GenericBase{
	
}







