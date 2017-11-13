package com.pdl.genericity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ErasedTest {
	public static void main(String[] args) {
		
		Class c1=new ArrayList<String>().getClass();
		Class c2=new ArrayList<Integer>().getClass();
		Class c3=ArrayList.class;
		
		System.out.println(c1==c2);//true
		System.out.println(c1==c3);//true
		
		List<Forb> list=new ArrayList<>();
		
		List<Quark<String>> list1=new ArrayList<Quark<String>>();
		
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(list1.getClass().getTypeParameters()));
	
		Quark<String> quark=new  Quark<String> ();
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
	
		
		Forb forb=new Forb();
		System.out.println(Arrays.toString(forb.getClass().getTypeParameters()));
	}
}


class Forb{}

class Quark<U>{}