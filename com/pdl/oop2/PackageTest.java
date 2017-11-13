package com.pdl.oop2;


import static java.lang.Integer.*;//静态导入，导入静态的方法和变量，直接使用不用通过类名


public class PackageTest {
	
	void say(){
		System.out.println("hello");
	}
	
	static void hello(){
		System.out.println("world.....");
	}
	public static void main(String[] args) {

		System.out.println(MAX_VALUE);
		Boy boy =new Boy();
		boy.say();
	
	}

}

//这样定义的类在同一个类中可以被访问
class Boy{
	void say(){
		System.out.println("hello boy");
	}
}




