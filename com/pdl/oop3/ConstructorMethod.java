package com.pdl.oop3;

public class ConstructorMethod {
	public static void main(String[] args) {
		new SubClass();
	}
}





/**��ʼ����˳��
 * 1.�����static�ֶ�
 * 2.�����static�ֶ�
 * 3.����ķǾ�̬�ֶ�
 * 4.����Ĺ�����
 * 5.����ķѾ�̬�ֶ�
 * 6.����Ĺ����� 
 *
 */
class SuperClass{
	static MyClass c=new MyClass(1);
    MyClass cl=new MyClass(2);
	//��������ʵ�����صľ�̬����
	public SuperClass(){
		System.out.println("start---");
		say();//�涨��������ֻ�ܵ���final����
		//�������û������벻���Ĵ���
		System.out.println("end----");
	}
	
	
	public static void hello(){
		System.out.println("hello");
	}
	
	
	public void say(){
		System.out.println("say---");
	}
	
	
}

class SubClass extends SuperClass{
	static MyClass c=new MyClass(3);
	MyClass cl=new MyClass(4);
	public SubClass(){
		System.out.println("SuperClass---");
	}
	String name="peng";
	public void say(){
		//���������Ľ�����ʼ����˳���й�
		//��Ҫ����Ϊ����Ĺ������е����˷�final����
		System.out.println("name:"+cl);//null
		System.out.println("name:"+c);//�ж���
	}
}

class MyClass{
	public MyClass(int num){
		System.out.println("myclass---"+num);
	}
}