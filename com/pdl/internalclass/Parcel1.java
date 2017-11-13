package com.pdl.internalclass;

public class Parcel1 {

	//�����ڷ����ڲ���class
	
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
		//���ܰ�����̬���࣬�ֶκͷ���
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
	
	//��1.6֮ǰ  ����Ҫ�������ڲ�����ʹ��Ҫ��final ��֮���JDK�汾����Ҫ
	Destination getDestination(final String s){
		//�����ڲ���
		return new Destination(){
			//�ڲ���Ҳ���Զ��ֶν��г�ʼ������
			//���Բ���������������Ϊ��ʼ���Ĺ���
			{System.out.println("��ʼ��");}
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
		//ʧȥ��������
		//TrackingShip t=new TrackingShip("pdl");
	}
	
	public void test(){
		internaltracking(true);
	}
}





interface Destination{
	void say();
}