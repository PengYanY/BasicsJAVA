package com.pdl.exceptions;

public class MyExceptionTest {
	public void test() throws SimpleException{
		System.out.println("Å×³öÒì³£---");
		throw new SimpleException();
	}
	
	public static void main(String[] args) {
		MyExceptionTest m=new MyExceptionTest();
		
		try {
			m.test();
		} catch (SimpleException e) {
			e.printStackTrace(System.out);
			
			e.printStackTrace(System.err);
		}
	}
	
	
}

class SimpleException extends Exception{}