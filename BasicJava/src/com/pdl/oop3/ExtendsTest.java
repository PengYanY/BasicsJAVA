package com.pdl.oop3;

public class ExtendsTest extends A{
	ExtendsTest(int num){
		//super  ��û���޲λ��๹����������£��������super��������
		//����ֻ��д�ڹ��췽���ĵ�һ��
		super(num);
		System.out.println("ExtendsTest........");
		
	}
	
	public static void main(String[] args) {
		new ExtendsTest(12);
		//new C().test();
		//new C().test2();
	}
}


class A extends B{
	A(int num){
		super(num);
		super.test();
		//new C().test2();
		System.out.println("A..............");
	}
}

class B{
	B(int num){
		System.out.println("B..............");
	}
	protected void test(){}
}


/*class C{
	
	void test(){
		
	}
	private void test1(){};
	
	//����Ϊprotected  ��ôͬ���µĺͷ�ͬ���ļ̳�����Է��ʴ˷���
	protected void  test2(){};
}*/