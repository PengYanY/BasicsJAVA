package com.pdl.oop;

public class InitTest {
	public static void main(String[] args) {
		//People p=new People();
		//Boy boy=People.boy;
	    //String name=People.name;
	   // System.out.println(name);
	    
	    People p=new People();
	    
	    
	}
}

class Boy{
	Boy(int num){
		System.out.println("boy:  "+num);
	}
	
	void test(int num){
		System.out.println("boy.test:  "+num);
	}
}

class Girl{
	
	
}

//先初始化静态字段，再初始化非静态字段
//静态字段只有在创建了People对面或调用了People.boy时才会调用静态字段
//并且是调用了一个就会初始化所有的静态的字段

class People{
	static {
		System.out.println("static1...");
	}
	{
		System.out.println("not static....");
	}
	static String name="name";
	static Boy boy=new Boy(10);
	Boy boy2=new Boy(30);
	static {
		System.out.println("static2...");	
	}
	{
		System.out.println("not static....");
	}
	People(){
		System.out.println("people....");
	}
	static Boy boy1=new Boy(20);
	private static Boy boy3=new Boy(40);
}