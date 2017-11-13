package com.pdl.oop;



public class CecycleTest {

	
	public static void main(String[] args) {
		Book book=new Book(true);
		book.checkIn();
		
		new Book(true);
		System.gc();
		
	}
	
}

class Book{
	boolean checkedOut=false;
	Book(boolean checkedOut){
		this.checkedOut=checkedOut;
	}
	
	void checkIn(){
		this.checkedOut=false;
		
	}
	
	@Override
	protected void finalize() throws Throwable{
		if(checkedOut){
			System.out.println("Error........");
			super.finalize();
		}
	}
}
