package com.pdl.internalclass;

public class Parcel1 {

	//定义在方法内部的class
	
	 public Destination destination(String s){
		class PDestination implements Destination{
			private String info;
			@Override
			public void say() {
				System.out.println(info);
			}
			
			PDestination(String s){
				info=s;
			}
		}
		return new PDestination(s) ;
	}
	
	class Normal{
		class A{}
		//不能包含静态的类，字段和方法
		//static int num;
		//static void f(){};
		///static class B{}
	}
	
	static class Parcel1Static {
		static String name;
		static void f(){}
		static class A{};
		class B{};
		void test(){
			System.out.println("static ");
		}
	}
	
	
	public static void main(String[] args) {
		new Parcel1().destination("hello").say();
		new Parcel1Test().test();;
		new Parcel1Test2().getDestination("pdl").say();;
		
		new Parcel1Static().test();;
	}
}


class Parcel1Test2 {
	
	//在1.6之前  参数要在匿名内部类中使用要加final 在之后的JDK版本则不需要
	Destination getDestination(final String s){
		//匿名内部类
		return new Destination(){
			//内部类也可以对字段进行初始化操作
			//可以采用这种做法当做为初始化的过程
			{System.out.println("初始化");}
			private String name=s;
			@Override
			public void say() {
				System.out.println(name);
			}
			
		};
	}
	
	
}


class Parcel1Test {
	private void internaltracking(boolean b){
		if(b){
			class TrackingShip{
				private String name;
				TrackingShip(String name){
					//System.out.println("---------");
					this.name=name;
				}
				String getName(){return name;}
			}
			
			TrackingShip t=new TrackingShip("pdl");
			System.out.println(t.getName());
		}
		//失去了作用域
		//TrackingShip t=new TrackingShip("pdl");
	}
	
	public void test(){
		internaltracking(true);
	}
}





interface Destination{
	void say();
}