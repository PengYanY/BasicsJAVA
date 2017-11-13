package com.pdl.conllection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class IteratorTest {
	
	public static void main(String[] args) {
		List<Boy> list=new ArrayList<>();
		Boy b=new Boy(20);
		Boy b1=new Boy(22);
		list.add(b1);
		list.add(b);
		list.add(new Boy(24));
		list.add(new Boy(40));
		list.add(new Boy(10));
		Iterator<Boy> it=list.iterator();
		
		System.out.println("length:"+list.size());
		//list.remove(b1);
		//System.out.println("length:"+list.size());
		//用foreach不能进行全部元素的删除，会造成list的长度的改变
		/*System.out.println("foreach---------");
		for (Boy boy : list) {
			//System.out.println(boy.age);
			list.remove(boy);
		}*/

		System.out.println("iterator---------");
		while(it.hasNext()){
			
			System.out.println(it.next().age);
			
		}
		
		
	}
	
	
}



class Boy{
	Boy(int age){
		this.age=age;
	}
	int age;
}