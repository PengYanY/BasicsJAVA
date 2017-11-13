package com.pdl.interfacetest;

//不加public的interface只有包权限


public class Test2{
	public static void main(String[] args) {
		C2 c=new C2();
		c.f();
		c.f(6);
		
		C3 c1=new C3();
		c1.f(6);
		System.out.println(c1.f());;
		
		C4 c2=new C4();
		System.out.println(c2.f());;
		
		
	}
}


 interface I1 {
	 void f();
}
 
 interface I2 {
	 void f(int i);
}

 interface I3 {
	 int f();
}

 class C1 {
	 public int f(){
		 return 1;
	 }
 }
 
 class C2 implements I1,I2{

	@Override
	public void f(int i) {
		// TODO Auto-generated method stub
		System.out.println("有参数");
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("没有参数");
	}
 }
 
 
 class C3 extends C1 implements I2{

	@Override
	public void f(int i) {
		System.out.println("C3-没有返回值");
		
	}
	 @Override
	 public int f(){
	   System.out.println("C3-有返回值");
		return 0; 
	 }
 }
 
 class C4 extends C1 implements I3{
	 //不会提示要实现什么方法
	 
	 @Override
	 public int f(){
		 return 2;
	 }
 }
 
 /*
  * 只有返回值不同是不行的，不能实现方法的重载
 class C5 implements I3,I1{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}	 
 }
 
 
 
 */
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
