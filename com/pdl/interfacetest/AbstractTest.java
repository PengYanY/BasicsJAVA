package com.pdl.interfacetest;

public class AbstractTest {
	public static void main(String[] args) {
		//�����಻��ֱ��new ����
		A a=new B();
		a.say();
	}
}


abstract class  A{
	A(){
		System.out.println("A---------");
	}
	
	abstract void hello();
	void say(){
		System.out.println("say");
	}
}

class B extends A{

	@Override
	void hello() {
		System.out.println("B--hello");
	}
	
}

