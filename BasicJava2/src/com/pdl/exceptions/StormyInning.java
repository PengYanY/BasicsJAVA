package com.pdl.exceptions;

public class StormyInning {
	public static void main(String[] args) {
		Inning2.main(args);
	}
}

//�����๹�������ܲ�����๹�����׳����쳣

class ExceptionA extends Exception{}
class ExceptionAA extends ExceptionA{}
class ExceptionAB extends ExceptionA{}


abstract class Inning{
	public Inning()throws ExceptionA {}
	//����һ��Ҫthrow
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
	
	//���๹�����������������쳣,���Լ��������쳣
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
			
			//��Ȼ��дʱû���׳��쳣�����ǵ��õ�ʱ��Ҫcatch
			try {
				in.event();
			} catch (ExceptionA e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//����catch
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
			
			//��Ȼ��дʱû���׳��쳣�����ǵ��õ�ʱ��Ҫcatch
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
	
	//����ֻ���׳������е��쳣�����߲��׳��������׳������쳣���ǵ����쳣������
	//������Ϊ�Ƿ�Χ��С��
	@Override
	public void atBat() throws ExceptionAA,ExceptionAB {
		// TODO Auto-generated method stub
		
	}
	
}