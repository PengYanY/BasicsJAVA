package com.pdl.genericity;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class ReflectTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		List<Shape> shapes=new ArrayList<Shape>();
		for (int i = 0; i < 10; i++) {
			shapes.add(new Shape());
		}
		
		Apply.apply(shapes, Shape.class.getMethod("rotate"));
		
		Apply.apply(shapes, Shape.class.getMethod("resize",int.class), 5);
		
		
		
		List<Square> squares=new ArrayList<Square>();
		for (int i = 0; i < 10; i++) {
			squares.add(new Square());
		}
		
		Apply.apply(squares, Shape.class.getMethod("rotate"));
		
		Apply.apply(squares, Shape.class.getMethod("resize",int.class), 5);
		
		Apply.apply(new FilledList<Shape>(Shape.class,10) , Shape.class.getMethod("rotate"));
		
		Apply.apply(new FilledList<Shape>(Square.class,10) , Shape.class.getMethod("rotate"));
		
		
		SimpleQueue<Shape> queue=new SimpleQueue<Shape>();
		
		for (int i = 0; i < 5; i++) {
			queue.add(new Shape());
			queue.add(new Square());
		}
		
		System.out.println("------------------");
		Apply.apply(queue, Shape.class.getMethod("rotate"));
	}
}


class SimpleQueue<T> implements Iterable<T>{

	private LinkedList<T> storage=new LinkedList<T>();
	public void add(T t){
		storage.offer(t);
	}
	public T get(){
		return storage.poll();
	}
	@Override
	public Iterator<T> iterator() {
		return storage.iterator();
	}
	
}


class Apply {
	
	public static <T,S extends Iterable<? extends T>> 
		void apply(S seq,Method f,Object... args){
		try{		
			for (T t : seq) {
				f.invoke(t, args);
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
}

class Shape{
	public void rotate(){
		System.out.println(this+" rotate");
	}
	
	public void resize(int size){
		System.out.println(this+"  resize"+size);
	}
}


class Square extends Shape{}









class FilledList<T> extends ArrayList<T>{
	public FilledList(Class<? extends T> type,int size){
		try{
			for (int i = 0; i < size; i++) {
				add(type.newInstance());
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}
	
}















