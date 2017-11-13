package com.pdl.oop3;

public class FinalTest {
	public static void main(String[] args) {
		final Boy boy=new Boy();
		final int num;
		num=0;//自能进行一次初始化
		
		
		Girl g=new Girl();
		System.out.println(""+g.age+"---"+g.name);
		g=new Girl(8);
		System.out.println(""+g.age+"---"+g.name);
		
		g.say();
	}
}

class Boy{
	public String name="123";
	
}

class Girl extends People{
	public final String name="pdl";
	public final int age;
	Girl(){
		age=2;
	}
	
	Girl(int i){
		age=i;	
	}
	
	void say(){
		System.out.println("world");
	}
}

class People{
	
	private void say(){
		System.out.println("hello");
	}
}


final class Animal{
	
	private int age;
	String name;
	final String sex="nan";
	
	public void test(){}
	
}

