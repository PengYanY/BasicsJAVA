package com.pdl.conllection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysAslist {

	public static void main(String[] args) {
		
		List<Snow> list1=Arrays.asList(new Snow(),new Power(),new Slush());
		
		List<Snow> list2=Arrays.asList(new Snow(),new Light());

		System.out.println(list1);
		System.out.println(list2);
		
		//在JDKl.6之前不能这样写，新版本可以
		List<Snow> list3=Arrays.asList(new Heavy(),new Light(),new Snow());
		
		//只能写成
		List<Snow> list4=Arrays.<Snow>asList(new Heavy(),new Light());
		
		//也可以借用Collections工具类
		
		List<Snow> list5=new ArrayList<Snow>();
		Collections.addAll(list5, new Heavy(),new Light());
		System.out.println(list3);
		System.out.println(list4);
	}
}



class Snow {}
class Power extends Snow{}
class Light extends Power{}
class Heavy extends Power{}
class Crusty extends Snow{}
class Slush extends Snow{}
