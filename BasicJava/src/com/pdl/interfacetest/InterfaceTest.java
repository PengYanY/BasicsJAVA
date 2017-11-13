package com.pdl.interfacetest;

public interface InterfaceTest {
	void test();//方法一定为public
	
	//接口中允许有静态方法，但一定为public
	public static void hello() {
		System.out.println("hello");
	}
	
	//允许有字段 但也是public
	 String name="pdl";
	 
}

interface MyInterface{
	
}
