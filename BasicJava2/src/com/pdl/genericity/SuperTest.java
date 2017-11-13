package com.pdl.genericity;

import java.util.ArrayList;
import java.util.List;

public class SuperTest {
	
	static <T> void f1(Holder<T> holder){
		T t=holder.get();
		System.out.println(t.getClass().getSimpleName());
	}
	
	static void f2 (Holder<?> holder){
		f1(holder);
	}
	
	static <T> void f3 (Holder<?> holder){
		Object t=holder.get();
		System.out.println(t.getClass().getSimpleName());
	}
	
	public static void main(String[] args) {
		
		Holder<Integer> raw=new Holder<Integer>(1);
		
		f1(raw);
		f2(raw);
		f3(raw);
		
		
		Holder raw1=new Holder(new Object());
		
		f1(raw1);//警告
		
		f2(raw1);
		f3(raw1);
		
		
		
		
		
		//在这里Apple是下界，一定要是Apple
		List<? super Apple> list=new ArrayList<>();
		
		list.add(new Apple());
		
		list.add(new FujiApple());
		
		//list.add(new Fruit());
		//list.add(new Orange());
		
		/*List list2 = null;
		List<?> list1=null;
		List<? extends Object> list4=null;
		
		list2.add(new String());
		
		//list1.add(new String());
		//list4.add(new String());
		
		list2=list1;
		list2=list4;
		
		list1=list4;
		list1=list2;
		
		list4=list1;
		list4=list2;*/
		
		
		
		
	}
	
	static void rawArg(Holder holder ,Object arg){
		holder.set(null);
		holder.set(arg);
		
		holder.get();
		//T t=holder.get();
	}
	
	
	static <T> T wildType(Holder<T> holder,T arg){
		holder.set(arg);
		T t=holder.get();
		return t;
	}
	
	static void unboundedArg(Holder<?> holder ,Object arg){
		holder.set(null);
		//holder.set(arg);
		
		holder.get();
		//T t=holder.get();
	}
	
	static <T> T wildSubType(Holder<? extends T> holder,T arg){
	
		//holder.set(arg);
		T t=holder.get();
		return t;
	}
	
	
	static <T> void wildSuperType(Holder<? super T> holder,T arg){
		
		holder.set(arg);
		T t=(T) holder.get();//有警告
		Object t1=holder.get();
	}
	

}






