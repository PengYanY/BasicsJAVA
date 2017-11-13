package com.pdl.types;


//空对象的作用
public class Person {
	
	public final String first;
	public final String last;
	public final String address;
	
	public Person(String first,String last,String address){
		this.address=address;
		this.last=last;
		this.first=first;
	}
	@Override
	public String toString(){
		return "Person:"+first+" "+last+" "+address;
		
	}
	
	public static class NullPerson extends Person implements Null{
		
		private NullPerson(){super("None","None","None");}
		@Override
		public String toString(){return "NullPerson";}
	}
	
	
	public static final Person NULL=new NullPerson();
}
