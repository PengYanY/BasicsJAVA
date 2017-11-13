package com.pdl.types;

public class InitClass {
	public static void main(String[] args) {
		//取得他的class对象并不会对类进行初始化
		Class clazz=Initable.class;
		
		System.out.println(Initable.bb);
		

		//System.out.println(Initable.b);
		
		
		System.out.println("========================");
		//forName的方式会静态初始化
		try {
			Class c=Class.forName("com.pdl.types.Initable");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


class Initable{
	
	static final Boy bb=new Boy(6);
	
	static{
		System.out.println("hello............");
	}
	static Boy b=new Boy(12);
	Initable(){
		System.out.println("Initable......");
	}
	
	Boy boy=new Boy(34);
}

class Boy{
	Boy(int i){
		System.out.println("boy"+"--"+i);
	}
}