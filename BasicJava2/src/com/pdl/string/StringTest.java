package com.pdl.string;

public class StringTest {
	
	public static void main(String[] args) {
		String name="Smith";
		System.out.println(name);
		//调用这个方法并不会改变字符串的本身
		String name2=name.toUpperCase();
		System.out.println(name2);
		
		
		String string ="abcdefghijk hello";
		
		//string.getBytes();
		
		//格式化输出
		
		int num=6;
		String str="hello";
		
		System.out.format("%d  %s  ",num,str);
	}
}
