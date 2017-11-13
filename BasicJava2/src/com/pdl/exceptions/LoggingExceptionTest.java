package com.pdl.exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class LoggingExceptionTest {
	
	
	private static Logger log=Logger.getLogger("LoggingException2");
	
	static void logException(Exception e){
		StringWriter writer=new StringWriter();
		e.printStackTrace(new PrintWriter(writer));
		log.severe(writer.toString());
	 }
	  
	public static void main(String[] args) {
		try {
			throw new LoggingException();
		} catch (LoggingException e) {
			
			//System.err.println("Caught "+e);
		}
		
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			logException(e);
		}
		
		System.out.println("-------------------------");
		try {
			throw new LoggingException2();
		} catch (LoggingException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		
		try {
			throw new LoggingException2("pdl");
		} catch (LoggingException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		
		try {
			throw new LoggingException2("peng",22);
		} catch (LoggingException2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
		
		System.out.println("-------------------------");
	}
}


class LoggingException extends Exception{
	
	private static Logger log=Logger.getLogger("LoggingException");
	
	public LoggingException(){
		StringWriter writer=new StringWriter();
		
		this.printStackTrace(new PrintWriter(writer));
		
		log.severe(writer.toString());
		
	}
}



class LoggingException2 extends Exception{
	private int x;
	
	LoggingException2(){}
	LoggingException2(String str){super(str);}
	LoggingException2(String str,int x){
		super(str);
		this.x=x;
	}
	
	public int val(){
		return this.x;
	}
	
	@Override
	public String getMessage(){
		return "Message:x="+x+"  "+super.getMessage();
	}
}




















