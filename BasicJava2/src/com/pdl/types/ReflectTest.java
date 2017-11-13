package com.pdl.types;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		A a=ClassA.creat();
		
		System.out.println(a.getClass().getName());
		
		a.f();
		
		//反射可以反问私有方法
		Method method=a.getClass().getDeclaredMethod("hello");
		method.setAccessible(true);
		method.invoke(a);
		
		ClassA clazz=new ClassA();
		
		clazz.getC().getClass();
	}
}


class ClassA {
	
	private static class ClassB implements A{

		@Override
		public void f() {
			System.out.println("f()....");
		}

		@Override
		public void g() {
			System.out.println("g()....");
		}
		
		
		private void hello(){
			System.out.println("hello");
		}
		
		
	}
	
	class C{
		private void say(){
			System.out.println("say---");
		}
	}
	
	public C getC(){
		return new C();
	}
	
	
	public static A creat(){
		return new ClassB();
	}
}

interface A{
	void f();
	void g();
}