package com.pdl.oop3;

import com.pdl.internalclass.ClassInInterface;

public class InitTest extends C{
	static D b=new D(16);
	public static void main(String[] args) {
		System.out.println("start------");
		new InitTest();
		ClassInInterface.InterfaceA f=new ClassInInterface.InterfaceA();
		
	}
	
	
	D d=new D(3);
	static D c=new D(18);
	
	
}



class C{
	
	static D b=new D(19);
	D c=new D(1);
	
}


class D{
	
	D(int num){
		System.out.println("b---  "+num);
	}
}