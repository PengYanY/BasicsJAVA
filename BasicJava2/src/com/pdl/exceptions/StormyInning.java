package com.pdl.exceptions;

public class StormyInning {
	public static void main(String[] args) {
		Inning2.main(args);
	}
}

//派生类构造器不能捕获基类构造器抛出的异常

class ExceptionA extends Exception{}
class ExceptionAA extends ExceptionA{}
class ExceptionAB extends ExceptionA{}


abstract class Inning{
	public Inning()throws ExceptionA {}
	//并不一定要throw
	public void event() throws ExceptionA{}
	
	public abstract void atBat() throws ExceptionAA,ExceptionAB;
	
	public void walk(){}
	
}


class ExceptionB extends Exception{}
class ExceptionBA extends ExceptionB{}
class ExceptionAAA extends ExceptionAA{}

interface InterfaceA {
	public void event() throws ExceptionB ;
	public void rainHard() throws ExceptionBA;
}


 class Inning2 extends Inning  implements InterfaceA{
	
	//子类构造器必须包含基类的异常,可以加其他的异常
	public Inning2() throws ExceptionBA, ExceptionA{}
	
	public Inning2(String str) throws ExceptionAA,ExceptionB,ExceptionA{}


	
	public static void main(String[] args) {
			Inning2 inn = null;
			try {
				inn = new Inning2();
				inn.atBat();
			} catch (ExceptionAAA e) {
			    e.printStackTrace();
		   }catch (ExceptionBA e) {
				e.printStackTrace();
			} catch (ExceptionA e) {
				e.printStackTrace();
			}
			Inning in=null;
			try {
				in=new Inning2();
				in.atBat();
			} catch (ExceptionBA e) {
				e.printStackTrace();
			} catch (ExceptionA e) {
				
				e.printStackTrace();
			}		
			
			//虽然复写时没有抛出异常，但是调用的时候要catch
			try {
				in.event();
			} catch (ExceptionA e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//不用catch
			inn.event();
			
			
			InterfaceA i=null;
			try {
				i=new Inning2();
			} catch (ExceptionBA e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExceptionA e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//虽然复写时没有抛出异常，但是调用的时候要catch
			try {
				i.event();
			} catch (ExceptionB e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

	//
	
	@Override
	public void event(){
		
	}

	@Override
	public void rainHard() throws ExceptionBA{
		// TODO Auto-generated method stub
		
	}
	
	//方法只能抛出父类有的异常，或者不抛出，或者抛出单个异常或是单个异常的子类
	//可以认为是范围变小了
	@Override
	public void atBat() throws ExceptionAA,ExceptionAB {
		// TODO Auto-generated method stub
		
	}
	
}