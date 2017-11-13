package com.pdl.exceptions;

public class ReThrowExceptionTest {
	
	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			
			e.printStackTrace(System.out);
		}
		
		
		System.out.println("---------------------------");
		
		try {
			h();
		} catch (Exception e) {
			
			e.printStackTrace(System.out);
		}
		
	}
	
	static void f() throws Exception{
		System.out.println("f()---------");
		throw new Exception("f()");
	}
	
	static void g() throws Exception{
		try {
			f();
		} catch (Exception e) {
			System.out.println("g()----");
			e.printStackTrace();
			throw e;
		}
	}
	
	
	static void h() throws Exception{
		try {
			f();
		} catch (Exception e) {
			System.out.println("h()----");
			e.printStackTrace();
			//把h()作为异常的新发生地，不会把F()入栈
			throw (Exception)e.fillInStackTrace();
		}
	}
	
}
