package com.pdl.oop3;

public class ConstructorMethod {
	public static void main(String[] args) {
		new SubClass();
	}
}





/**初始化的顺序
 * 1.基类的static字段
 * 2.子类的static字段
 * 3.基类的非静态字段
 * 4.基类的构造器
 * 5.子类的费静态字段
 * 6.子类的构造器 
 *
 */
class SuperClass{
	static MyClass c=new MyClass(1);
    MyClass cl=new MyClass(2);
	//构造器其实是隐藏的静态函数
	public SuperClass(){
		System.out.println("start---");
		say();//规定构造器内只能调用final方法
		//这样调用会有意想不到的错误
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
		//产生这样的结果与初始化的顺序有关
		//主要是因为基类的构造器中调用了非final方法
		System.out.println("name:"+cl);//null
		System.out.println("name:"+c);//有对象
	}
}

class MyClass{
	public MyClass(int num){
		System.out.println("myclass---"+num);
	}
}