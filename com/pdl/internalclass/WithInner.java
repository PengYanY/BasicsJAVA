package com.pdl.internalclass;

public class WithInner extends WithA.WithB {
	
	WithInner(WithA a){
		//���Ǽ̳е��ڲ�������ⲿ����ô
		//��ô�ñ�����ⲿ������üӽ���
		a.super();
	}
	
	public static void main(String[] args) {
		WithA a=new WithA();
		WithInner w=new WithInner(a);
		
		//Egg e=new BEgg();
		new BEgg();
	}
}

class WithA{
	class WithB{
		
	}
}


class Egg {
	
	Egg(){
		System.out.println("Egg");
		//York y=new York();
	}
	class York{
		York(){
			System.out.println("york----");
			
		}
		void f(){System.out.println("York.f");};
	}
}

class BEgg extends Egg {
	BEgg(){
		System.out.println("BEgg");
		new York();
	}
	
	//ʹ��ע�͵ķ��������York�����ȫ��д
	/*class York extends Egg.York{
		York(){
			System.out.println("BYork...");
		}
		
		@Override
		void f(){System.out.println("BYork.f");};
	}*/
	
	class York{
		York(){
			System.out.println("BYork...");
		}
		void f(){System.out.println("BYork.f");};
	}
	

}


