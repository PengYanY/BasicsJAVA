package com.pdl.types;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyTest {
	
	public static  void consumer(Act act){
		act.say();
		act.hello();
	}
	
	
	public static void main(String[] args) {
		Act act=new ActImpl();
		consumer(act);
		
		Act  proxy=(Act) Proxy.newProxyInstance(Act.class.getClassLoader(),
				new Class[]{Act.class}, new Myproxy(act));
		
		
		consumer(proxy);
	}
}

class  ActImpl implements Act{

	@Override
	public void say() {
		System.out.println("say----------");
	}

	@Override
	public void hello() {
		System.out.println("hello----------");
	}
	
}



interface Act{
	void say();
	void hello();
}

class Myproxy implements InvocationHandler{
	
	private Object proxied;
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy:"+proxy.getClass()+"--"+proxy.getClass().getSimpleName());
		System.out.println("method:"+method+"--"+method.getName());
		if(args!=null){
			for (Object object : args) {
				System.out.print(object+" ");
			}
		}
	
		
		return method.invoke(proxied, args);
	}
	
	public Myproxy(Object o){
		proxied=o;
	}

	
}