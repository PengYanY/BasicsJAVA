package com.pdl.interfacetest;

//����public��interfaceֻ�а�Ȩ��


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
		System.out.println("�в���");
	}

	@Override
	public void f() {
		// TODO Auto-generated method stub
		System.out.println("û�в���");
	}
 }
 
 
 class C3 extends C1 implements I2{

	@Override
	public void f(int i) {
		System.out.println("C3-û�з���ֵ");
		
	}
	 @Override
	 public int f(){
	   System.out.println("C3-�з���ֵ");
		return 0; 
	 }
 }
 
 class C4 extends C1 implements I3{
	 //������ʾҪʵ��ʲô����
	 
	 @Override
	 public int f(){
		 return 2;
	 }
 }
 
 /*
  * ֻ�з���ֵ��ͬ�ǲ��еģ�����ʵ�ַ���������
 class C5 implements I3,I1{

	@Override
	public void f() {
		// TODO Auto-generated method stub
		
	}	 
 }
 
 
 
 */
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
