package com.pdl.oop3;

public class ExtendsTest extends A{
	ExtendsTest(int num){
		//super  在没有无参基类构造器的情况下，必须调用super（参数）
		//而且只能写在构造方法的第一行
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
	
	//定义为protected  那么同包下的和非同包的继承类可以访问此方法
	protected void  test2(){};
}*/