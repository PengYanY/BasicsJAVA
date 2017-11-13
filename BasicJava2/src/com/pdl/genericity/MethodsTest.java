package com.pdl.genericity;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MethodsTest {
	
	public static void f(List<String> list){
		
	}

	public static void main(String[] args) {
		List<String> list=New.lList();
		//在1.6之前的JDK版本，下面的这条语句是不能通过编译的
		f(New.lList());
		//但是可以如下面这样显示的调用
		f(New.<String>lList());
		
		Map<String,Integer> map=New.map();
	}
}

class New{
	
	public static <T> LinkedList<T> lList(){
		return new LinkedList<T>();
	}
	
	public static <T,S> Map<T,S> map(){
		return new HashMap<T, S>();
	}
}
