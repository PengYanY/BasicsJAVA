package com.pdl.genericity;

public class GenericRecurringTest2 {
	public static void main(String[] args) {
		OrdinaryArguments.main(args);
		OrdinaryArguments2.main(args);
	}
}



interface GenericGetter<T extends GenericGetter<T>>{ T get();}

interface Getter extends GenericGetter<Getter>{}

class GenericsAndReturnTypes{
	
	void test(Getter g){
		Getter result=g.get();
		GenericGetter gg=g.get();
	}
}


class Base{}

class Derived2 extends Base{}

interface OrdinaryGetter{ Base get();}

interface DerivedGetter2 extends  OrdinaryGetter{
	Derived2 get();
}


class OrdinarySetter{
	void set(Base base){
		System.out.println("OrdinarySetter.set");
	}
}


class DerivedSetter extends OrdinarySetter{
	
	//@Override不能加这个，不属于复写
	void set(Derived2 derived){
		System.out.println("DerivedSetter.set");
	}
}


class OrdinaryArguments{
	public static void main(String[] args) {
		Base base=new Base();
		Derived2 derived =new Derived2();
		
		DerivedSetter ds=new DerivedSetter();
		
		ds.set(base);//具有两个重载的set方法
		ds.set(derived);
	}
}



interface SelfBoundedSetter2<T extends SelfBoundedSetter2<T>>{
	void set(T arg);
}

interface Setter2 extends SelfBoundedSetter2<Setter2>{}


class SelfBoundedAndCovarianArguments{
	
	void test(Setter2 s1,Setter2 s2,SelfBoundedSetter2<Setter2> sbs){
		s1.set(s2);
		
		//不能编译  
		//s1.set(sbs);
	}
}


class GenericSetter3<T extends GenericSetter3<T>>{
	void set(T arg){
		System.out.println("GenericSetter3");
	}
}

class GenericSetter3Sub extends GenericSetter3<GenericSetter3Sub>{
	
		@Override //表示是复写方法
		void set(GenericSetter3Sub arg){
			System.out.println("GenericSetter3Sub");
		}
}



class OrdinaryArguments2{
	public static void main(String[] args) {
		
		GenericSetter3<GenericSetter3Sub> g=new GenericSetter3<GenericSetter3Sub>();
		
		//这样就实现了方法的复写
		
		GenericSetter3Sub  gg=new GenericSetter3Sub();
		
		//gg.set(g);
		
		gg.set(gg);
		
		
		//g.set(gg);
	}

}




class GenericSetter4<T>{
	void set(T arg){
		System.out.println("GenericSetter4");
	}
}

class GenericSetter3Sub2 extends GenericSetter4<Base>{
	
		//@Override //不表示是复写方法
		void set(GenericSetter3Sub2 arg){
			System.out.println("GenericSetter3Sub2");
		}
		
		@Override //表示是复写方法
		void set(Base arg){
			System.out.println("GenericSetter3Sub2");
		}
}



class OrdinaryArguments3{
	public static void main(String[] args) {
	
	}

}








