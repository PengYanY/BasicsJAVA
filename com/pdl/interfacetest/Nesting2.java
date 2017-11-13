package com.pdl.interfacetest;

import com.pdl.interfacetest.NestingInterface.CE;

//内部的公共类
 public class Nesting2{
	class NA implements NestingInterface.IA{@Override public void f() {}}
	//不能实现类内的私有接口
	//class NB implements InterfaceNesting.IB{}
	class NC implements NestingInterface.IC{}
	
	
	class ND implements NestingInterface.IE{}
	
	class ND2 implements NestingInterface.IE{
		class NDA implements IEA{@Override public void f() {}}
	}
	
	
	class NE implements NestingInterface.IE.IEA{@Override public void f() {}}
	class NF implements NestingInterface.IE.IEC{}
	
	
	
	public static void main(String[] args) {
		NestingInterface n=new NestingInterface();
		
		NestingInterface.IA ia=null;
		
		NestingInterface.CE ce=(CE) n.getIB();
		ce.hello();
		ce.f();
		//不能直接调用，因为IB接口为私有的
		//n.getIB().f();
		
		
	}
	
}

 
 class NestingInterface {
	
	interface IA{void f();}
	private  interface IB{void f();}
	public   interface IC{}
	
	public class C{}
	
	public class CA implements IA{@Override public void f() {}	}
	class CB implements IA{@Override public void f() {}}
	private class  CC implements IA{ @Override public void f() {}}
	
	public class CD implements IB{@Override public void f() {	}}
	class CE implements IB{void hello(){System.out.println("hello");}@Override public void f() {System.out.println("f()");}}
	private class CF implements IB{@Override public void f() {}}
	
	public IB getIB(){
		
		return new CE();
	}
	
	
	public class CG implements IC{}
	 class CH implements IC{}
	private class CI implements IC{}
	
	
	interface IE{
		interface IEA{void f();}
		
		//不能在内部接口内创建私有的接口
		//private interface IEB{}
		
		public interface IEC{}
	}
	
	
}