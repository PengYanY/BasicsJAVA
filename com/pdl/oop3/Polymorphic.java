package com.pdl.oop3;

public class Polymorphic {
	
	public String name="pdl";
	
	public static  void say(){
		System.out.println("world---------");
	}
	private void hello(){
		System.out.println("Polymorphic");
	}
	
	public static void main(String[] args) {
		PolymorphicSub.main(args);
	}
}


class PolymorphicSub extends Polymorphic{
	
	private String name="peng";//和基类的字段拥有不一样的存储
	
	public static  void say(){
		System.out.println("world");
	}
	public void hello(){
		System.out.println(name);
		System.out.println("PolymorphicSub");
	}
	
	public static void main(String[] args) {
		Polymorphic p=new PolymorphicSub();
		//p.hello(); //会提示没有可用的方法  
		
		
		p.say();//world-----静态方法只属于一个类和对象没有关系，所以不存在多态
		
		
		//可以利用强转再转回来
		PolymorphicSub p1=(PolymorphicSub)p;
		p1.hello();
		
		PolymorphicSub pp=new PolymorphicSub();
		pp.hello();
		pp.say();
		
	}
}


