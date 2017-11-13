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
		
		//��JDKl.6֮ǰ��������д���°汾����
		List<Snow> list3=Arrays.asList(new Heavy(),new Light(),new Snow());
		
		//ֻ��д��
		List<Snow> list4=Arrays.<Snow>asList(new Heavy(),new Light());
		
		//Ҳ���Խ���Collections������
		
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
