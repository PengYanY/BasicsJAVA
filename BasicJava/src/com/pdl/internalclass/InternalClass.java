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
		//����ͨ�����ַ�ʽֱ��new����
		//InternalClass.Contents c1=new InternalClass.Contents();
		
		//����������ö���
		InternalClass.Contents c1=i.new Contents();
		
		//��������������д
		//InternalClass.Contents c1=i.new InternalClass.Contents();
		
		c.show();
		
		
		
	}
}
