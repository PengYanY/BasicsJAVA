package com.pdl.conllection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;


public class ListTest {
	
	public static void main(String[] args) {
		ListTest test=new ListTest();
		//test.linkedListTest();
		test.arrayListTest();
		//test.test();
		
	}
	
	
	
	
	
	
	private void linkedListTest(){
		List<String> list=new LinkedList<String>();
		for (int i = 0; i <5; i++) {
			list.add("test"+i);
		}
		
		System.out.println(list);
		
		
	}

	private void arrayListTest(){
		List<String> list=new ArrayList<String>();
		for (int i = 0; i <5; i++) {
			list.add("test"+i);
		}
		
		System.out.println(list);
		//在指定的位置上插入元素
		
		System.out.println(list.contains(new String("test1")));
		
		System.out.println(list.indexOf("test3"));
		

		list.add(3, "test9");
		System.out.println(list);
		
		//[1,4)
		List<String> sublist=list.subList(1, 5);
		System.out.println(sublist);
		
		//生成了子列表之后不能修改父列表了，会报java.util.ConcurrentModificationException异常
		//list.add("");
		
		//判断是否包含是不看元素的顺序的
		System.out.println(list.containsAll(sublist));
		
		System.out.println(list.containsAll(Arrays.asList("test1","test3","test2")));
		
		Collections.shuffle(sublist,new Random(47));
		
		System.out.println("shuffle:"+sublist);
		
		//排序
		Collections.sort(list);
		
		//System.out.println(sublist);
		
		
		System.out.println(list);
		
		Collections.shuffle(list,new Random(47));
		
		System.out.println(list);
		
		
		List<String> list1=new ArrayList(Arrays.asList("123","12","1"));
		List<String> list2=new ArrayList(Arrays.asList("1","23","123","78"));
	
		System.out.println("list1"+list1);
		System.out.println("list2"+list2);
		
		//相当于取交集，把交集的内容保存在list1
		System.out.println(list1.retainAll(list2));
		
		System.out.println("list1"+list1);
		
		System.out.println("list2"+list2);
		
		list2.remove("23");
		System.out.println("list2"+list2);
		list2.removeAll(list1);
		System.out.println("list2"+list2);
		
		list2.set(0,"hello");
		
		System.out.println("list2"+list2);
		
		list2.addAll(1,list1);

		System.out.println("list2"+list2);
		
		System.out.println(list2.isEmpty());
		list2.clear();

		System.out.println(list2.isEmpty());
		
		System.out.println("list:"+list);
		
		System.out.println(list2.toArray());
		
		Object[] array=list2.toArray();
		String[] array1=list.toArray(new String[0]);
		
		for (String string : array1) {
			System.out.println(string);
		}
	}
	
	
	private void test(){
		Random rand=new Random(46);  
        Integer[] ia={0,1,2,3,4,5,6,7,8,9};  
        List<Integer> list=new ArrayList<Integer>(Arrays.asList(ia));  
        System.out.println("Before shufflig: "+list);  
        Collections.shuffle(list,rand);  
        System.out.println("After shuffling: "+list);  
        System.out.println("array: "+Arrays.toString(ia));  
        List<Integer> list1=Arrays.asList(ia);  
        System.out.println("Before shuffling: "+list1);  
        Collections.shuffle(list1,rand);  
        System.out.println("After shuffling: "+list1);  
        System.out.println("array: "+Arrays.toString(ia));  
	}
	
	
	
}

class Dog{}
