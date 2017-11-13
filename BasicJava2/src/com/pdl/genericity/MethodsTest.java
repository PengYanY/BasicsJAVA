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
		//��1.6֮ǰ��JDK�汾���������������ǲ���ͨ�������
		f(New.lList());
		//���ǿ���������������ʾ�ĵ���
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
