package com.pdl.genericity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericAndCovariance {
	
	public static void main(String[] args) {
		List<? extends Fruit> list=new ArrayList<Apple>();
		
		list.add(null);
		//���������ϡ�ת�͡�����ӵĶ����е������������ת�͵Ĺ���
		//��Ϊ? extends Fruit����һ������ļ���
		
		//add(E e) ������һ�����͵Ĳ�������ô������Ϊ? extends Fruit
		//�������ǲ�����õ�
		//list.add(new Fruit());
		//list.add(new Orange());
		//list.add(new Apple());
		
		//list.add(new FujiApple());
		System.out.println(list.get(0));
		
		
		
		
		List<? extends Fruit> list4=new ArrayList<>();
		//����ͬ����ͨ��
		//list4.add(new Apple());
		
		
		//����Ķ��ǻ���������ģ������ǲ�һ����list
		//List<Fruit> list1=new ArrayList<Apple>();
		//List<Apple> list2=new ArrayList<Fruit>();
		
		
		List<? extends Fruit> list5=Arrays.asList(new Apple());
		
		Apple a=(Apple) list5.get(0);
		
		System.out.println(list5.contains(new Apple()));;
		System.out.println(list5.indexOf(new Apple()));
		
		
		Holder.main(args);
		
	}
}


class Fruit{}

class Apple extends Fruit{}

class FujiApple extends Apple{}

class Orange extends Fruit{}


class Holder<T>{
	
	private T value;
	Holder(){}
	Holder(T val){value=val;}
	T get(){return value;}
	void set(T val){value=val;}
	@Override
	public boolean equals(Object o){
		return value.equals(o);
	}
	
	public static void main(String[] args) {
		Holder<Apple> apple=new Holder<>(new Apple());
		Apple d=apple.get();
		
		
		Holder<? extends Apple> myfruit=null;
		
		//myfruit.set(new Fruit());
		
		//����ת��
		//Holder<Fruit> f=apple;
		
		
		Holder<? extends Fruit> fruit=new Holder<Apple>(new Apple());
		
		
		
		//����ת��
		Holder<Fruit> ff=(Holder<Fruit>) fruit;
		
		System.out.println(ff.get().getClass().getSimpleName());;
		
		Holder<Apple> a=(Holder<Apple>) fruit;
		
		System.out.println(a.get().getClass().getSimpleName());;
		
		//�������׳�cast�쳣
		//Holder<Orange> o=(Holder<Orange>) fruit;
		
		//System.out.println(o.get().getClass().getSimpleName());;
		
		
		Fruit f=fruit.get();
		System.out.println(f.getClass().getSimpleName());;
		
		
		//���ܵ���set��������Ϊ���Ĳ���Ϊ? extends Fruit������ȷ��Ϊʲô���ͣ�û�а�ȫ��
		//fruit.set(new Apple());
		
		Apple apple1=new Apple();
		
		Holder<? extends Fruit> fruit1=new Holder<Apple>(apple1);
		
		boolean b=fruit1.equals(apple1);
		
		System.out.println(b);
		
	}
}











