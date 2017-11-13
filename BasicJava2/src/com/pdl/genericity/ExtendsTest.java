package com.pdl.genericity;

import java.awt.Color;


public class ExtendsTest {
	public static void main(String[] args) {
		Solid<Bounded> solid=new Solid<>(new Bounded());
		
		solid.color();
		
	
		ColoredDimension2<Bounded2> cd=new ColoredDimension2<>(new Bounded2());
		cd.color();
		
		
	}
}


interface HasColor{
	Color getColor();
}

class Colored< T extends HasColor>{
	
	T item;
	
	Colored(T t){item=t;}
	
	Color color(){
		return item.getColor();
	}
}


class Dimension{ public int x,y,z;}


class ColoredDimension<T extends Dimension & HasColor>{
	T item;
	ColoredDimension(T i){item=i;}
	
	T getItem(){return item;}
	
	Color color(){return item.getColor();}
	
	int getX(){return item.x;}
	
}


interface Weight {int weight();}

class Solid<T extends Dimension & HasColor & Weight>{
	
	T item;
	Solid(T i){item=i;}
	
	T getItem(){return item;}
	
	Color color(){return item.getColor();}
	
	int getX(){return item.x;}
	
	int weight(){
		return item.weight();
	}
	
}


class Bounded extends Dimension implements HasColor,Weight{

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}
	
}


class HoldItem<T>{
	T item;
	HoldItem(T i){item=i;}
	
	T getItem(){return item;}
}

class Coloed2<T extends HasColor> extends HoldItem<T>{

	Coloed2(T i) {
		super(i);
	}
	Color color(){return item.getColor();}
}


class ColoredDimension2<T extends Dimension & HasColor > extends Coloed2 <T>{

	ColoredDimension2(T i) {
		super(i);
	}
	
}

class Bounded2 extends Dimension implements HasColor{

	@Override
	public Color getColor() {
		return null;
	}
	
}



