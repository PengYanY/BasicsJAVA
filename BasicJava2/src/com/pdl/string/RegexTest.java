package com.pdl.string;

import java.util.Arrays;

public class RegexTest {
	
	public static void main(String[] args) {
		System.out.println("-1234".matches("-?\\d+"));
		System.out.println("1234".matches("-?\\d+"));
		System.out.println("+1234".matches("-?\\d+"));
		System.out.println("+1234".matches("(-|\\+)?\\d+"));
		
		split(" ");
		split("\\W+");
		//��ĸn�����һ���ǵ���
		split("n\\W+");
		
		split("o\\w+");
		
		//�滻ƥ�䵽�ĵ�һ��
		System.out.println(string.replaceFirst("a\\w", "pdl"));
		//�滻ƥ�䵽������
		System.out.println(string.replaceAll("a\\w", "pdl"));
		
	}
	
	private static  String string="i am a sad boy! adn i do not to tell anybody.";
	private static void split(String regex){
		System.out.println(Arrays.toString(string.split(regex)));
	}
}
