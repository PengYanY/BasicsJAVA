package com.pdl.string;

import java.math.BigInteger;
import java.util.Formatter;

public class FormatterTest2 {
	
	
	
	public static void main(String[] args) {

		 double total=0;
		 Formatter  format=new Formatter(System.out);
		 
		 //-表示左对齐，而数字表示的是长度
		 //若大余指定的长度，那么会被挤开
		 format.format("%-15s|%5s|%10s\n", "Item","aaQty","Price");
		 format.format("%-15s|%5s|%10s\n", "---","---","-----");
		 
		 format.format("%-15.15s|%5d|%10.2f\n","peng",123,13.76480);
		 
		 format.format("%-15s|%5s|%10.3f\n", "Item","",3*4.06);
		 
		System.out.println("==========================================");
		 
		 char u='a';
		 
		// format.format("d: %d\n",u );
		 format.format("c: %c\n",u );
		 format.format("s: %s\n",u );
		 format.format("h: %h\n",u );
		 
		 System.out.println("==========================================");
		 int v=121;
		 format.format("d: %d\n",v );
		 format.format("c: %c\n",v );
		 format.format("s: %s\n",v );
		 format.format("b: %b\n",v );
		 format.format("x: %x\n",v );
		 format.format("h: %h\n",v );
		// format.format("f: %f\n",v );
		 
		 System.out.println("==========================================");
		 BigInteger w=new BigInteger("5000000000000000");
		 format.format("d: %d\n",w);
		 format.format("b: %b\n",w);
		 format.format("s: %s\n",w);
		 format.format("x: %x\n",w);
		 format.format("h: %h\n",w);
		 
		 System.out.println("==========================================");
		 
		 double x=179.543;
		 //format.format("d: %d\n",x);
		 format.format("b: %b\n",x);
		 format.format("f: %f\n",x);
		 format.format("e: %e\n",x);
		 format.format("h: %h\n",x);
		 format.format("s: %s\n",x);
		 
		 System.out.println("==========================================");
		 
		 FormatterTest2 y=new FormatterTest2();
		 
		 format.format("s: %s\n",y);
		 format.format("b: %b\n",y);
		 format.format("h: %h\n",y);
		 
		 System.out.println("==========================================");
		 boolean z=false;
		 format.format("s: %s\n",z);
		 format.format("b: %b\n",z);
		 format.format("h: %h\n",z);
		 
		 
		String str= String.format("%s is a %s boy age=%d","pdl","good",22);
		 
		System.out.println(str);
		 
		 
		 
		 
		 
	}
}
