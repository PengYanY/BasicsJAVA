package com.pdl.string;

import java.io.PrintStream;
import java.util.Formatter;

public class FormatterTest {

	private String name;
	private Formatter f;
	
	public FormatterTest(String name,Formatter f){
		this.name=name;
		this.f=f;
	}
	
	public void move(int x,int y){
		f.format("%s the........is at(%d,%d)\n", name,x,y);
	}
	
	public static void main(String[] args) {
		PrintStream out=System.out;
		FormatterTest f=new FormatterTest("pdl",new Formatter(out));
		
		FormatterTest f1=new FormatterTest("peng",new Formatter(System.out));
		
		f.move(24, 3);
		f1.move(12, 32);
		f.move(2, 3);
		f.move(21, 3);
		f1.move(2, 31);
	}
}
