package com.pdl.internalclass;

public class InnerClass {
	public static void main(String[] args) {
		Parcel p=new Parcel();
		Contents c=p.getContents();
		c.f();
		
		//私有的不行
		//Parcel.PContents c2=p.new PContents();
		
		Parcel.PContents2 c1=p.new PContents2();
		c1.f();
	}
}


class Parcel{
	
	private class PContents implements Contents{

		@Override
		public void f() {
		System.out.println("PContents");
		}
		
	}
	
	public Contents getContents(){
		return new  PContents();
	}
	protected class PContents2 implements Contents{

		@Override
		public void f() {
			System.out.println("PContents1");
		}
		
	}
	
	public Contents getContents2(){
		return new  PContents2();
	}
	public Contents getContents3(){
		return new  PContents3();
	}
	
	
	public class PContents3 implements Contents{

		@Override
		public void f() {
			System.out.println("PContents2");
		}
		
	}
	
}

	interface Contents{
		void f();
	}