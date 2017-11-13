package com.pdl.oop;

public class InitArrayTest {
	public static void main(String[] args) {
		
		Other.main(new String[]{"pdl","22"});
		System.out.println(Spiciness.HOT);
		for (Spiciness s : Spiciness.values()) {
			System.out.println(s.ordinal());
		}
	}
	
}

class Other {
	public static void main(String[] args) {
		System.out.println("Info:"+args[0]+"--"+args[1]);
	}
}

enum Spiciness{
	NOT,MILD,MEDIUM,HOT,FLAMING
}
