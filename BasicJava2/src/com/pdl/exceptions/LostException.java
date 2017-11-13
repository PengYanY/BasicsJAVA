package com.pdl.exceptions;

public class LostException {
	
	@SuppressWarnings("finally")
	public static void main(String[] args) {
		try{
			try {
				//¶ªÊ§Òì³£
				throw new VeryImportantException();
			} finally{
				throw new VeryImportantException2();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	
}

class VeryImportantException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
class VeryImportantException2 extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}