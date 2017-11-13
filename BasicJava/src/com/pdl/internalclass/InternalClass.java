package com.pdl.internalclass;

public class InternalClass {
	private String  name="pdl";
	 InternalClass(){
		System.out.println("InternalClass");
	}
	
	 
	 class Contents{
		 Contents(){
			 System.out.println("Contents");
		 }
		 void show(){
			 System.out.println(name);
		 }
	 }
	 
	 
	
	 public Contents getContens(){
		 return new Contents();
	 }
	public static void main(String[] args) {
		InternalClass i=new InternalClass();
		InternalClass.Contents c=i.getContens();
		c.show();
		//不能通过这种方式直接new出来
		//InternalClass.Contents c1=new InternalClass.Contents();
		
		//可以这样获得对象
		InternalClass.Contents c1=i.new Contents();
		
		//不能像下面这样写
		//InternalClass.Contents c1=i.new InternalClass.Contents();
		
		c.show();
		
		
		
	}
}
