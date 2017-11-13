package com.pdl.types;

public class ClassExtends {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		Class<FancyToy> clazz=FancyToy.class;
		
		FancyToy ft=clazz.newInstance();
		
		Class< ? super FancyToy> clazz1=clazz.getSuperclass();
		
		
		//不能写成这样
		//Class<Toy> clazz2=clazz.getSuperclass();
		
		Toy t=new FancyToy();
		
		Class<FancyToy> fac=FancyToy.class;
		
		//转化
		FancyToy f=fac.cast(t);
		
		
		
		Toy toy=new FancyToy();
		Toy toy1=new Toy();
		
		if(toy instanceof FancyToy){
			System.out.println("++++++++++");
		}
		
		System.out.println(FancyToy.class.isInstance(toy));;
		
		System.out.println(Toy.class.isAssignableFrom(toy.getClass()));
		
		
		System.out.println(toy1.getClass()==Toy.class);
		System.out.println(toy1.getClass().equals(Toy.class));
		
		
		System.out.println(toy.getClass()==Toy.class);
		System.out.println(toy.getClass().equals(Toy.class));
		
		System.out.println(toy.getClass()==FancyToy.class);
		System.out.println(toy.getClass().equals(FancyToy.class));
		
	}
}

class Toy{}

class FancyToy extends Toy{}