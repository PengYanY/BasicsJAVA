package com.pdl.operation.mark;

public class TransposingTest {
	
	public static void main(String[] args) {
		int num=0xc1111111;
		System.out.println(num);
		System.out.println(Integer.toBinaryString(num) +"  length:"+Integer.toBinaryString(num).length());
		num>>=10;//>>是带符号的移动，在最高位加符号为 1   >>>是不带符号位的移动
		System.out.println(Integer.toBinaryString(num)+" length:"+Integer.toBinaryString(num).length());
		
		
		int num1=0xc1111111;
		System.out.println(num1);
		System.out.println(Integer.toBinaryString(num1) +"  length:"+Integer.toBinaryString(num1).length());
		num1<<=2;//<<  左移   最后的部分只能补0 没有<<<
		System.out.println(Integer.toBinaryString(num1)+" length:"+Integer.toBinaryString(num1).length());
		
		
		char num3=180;
		System.out.println(Character.toChars(num3));
		System.out.println(Integer.toBinaryString(num3));
		
		
		String str1="hello";
		String str2="hello";
		
		String str3=str1;
		String str4=new String("hello");
		String str5=new String("hello");
		
		System.out.println("==:"+(str1==str2)+" equal:"+(str1.equals(str2)));
		System.out.println("==:"+(str1==str3)+" equal:"+(str1.equals(str3)));
		
		System.out.println("==:"+(str4==str5)+" equal:"+(str4.equals(str5)));
		System.out.println("==:"+(str4==str3)+" equal:"+(str4.equals(str3)));
		System.out.println("==:"+(str1==str4)+" equal:"+(str1.equals(str4)));
		
		System.out.println("hello".equals("hello")+"  "+("hello"=="hello"));
		
		System.out.println("hello".equals("hello1")+"  "+("hello"=="hello1"));
		
	}
}
