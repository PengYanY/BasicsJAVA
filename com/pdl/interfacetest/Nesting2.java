package com.pdl.interfacetest;

import com.pdl.interfacetest.NestingInterface.CE;

//�ڲ��Ĺ�����
 public class Nesting2{
	class NA implements NestingInterface.IA{@Override public void f() {}}
	//����ʵ�����ڵ�˽�нӿ�
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
		//����ֱ�ӵ��ã���ΪIB�ӿ�Ϊ˽�е�
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
		
		//�������ڲ��ӿ��ڴ���˽�еĽӿ�
		//private interface IEB{}
		
		public interface IEC{}
	}
	
	
}