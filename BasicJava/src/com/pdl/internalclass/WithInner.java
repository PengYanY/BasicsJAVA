package com.pdl.internalclass;

public class WithInner extends WithA.WithB {
	
	WithInner(WithA a){
		//若是继承的内部类而非外部类那么
		//那么久必须把外部类的引用加进来
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
	
	//使用注释的方法来完成York类的完全重写
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


