package com.pdl.oop3;

public class Polymorphic {
	
	public String name="pdl";
	
	public static  void say(){
		System.out.println("world---------");
	}
	private void hello(){
		System.out.println("Polymorphic");
	}
	
	public static void main(String[] args) {
		PolymorphicSub.main(args);
	}
}


class PolymorphicSub extends Polymorphic{
	
	private String name="peng";//�ͻ�����ֶ�ӵ�в�һ���Ĵ洢
	
	public static  void say(){
		System.out.println("world");
	}
	public void hello(){
		System.out.println(name);
		System.out.println("PolymorphicSub");
	}
	
	public static void main(String[] args) {
		Polymorphic p=new PolymorphicSub();
		//p.hello(); //����ʾû�п��õķ���  
		
		
		p.say();//world-----��̬����ֻ����һ����Ͷ���û�й�ϵ�����Բ����ڶ�̬
		
		
		//��������ǿת��ת����
		PolymorphicSub p1=(PolymorphicSub)p;
		p1.hello();
		
		PolymorphicSub pp=new PolymorphicSub();
		pp.hello();
		pp.say();
		
	}
}


