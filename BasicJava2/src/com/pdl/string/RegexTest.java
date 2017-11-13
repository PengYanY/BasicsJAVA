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
		//字母n后面接一个非单词
		split("n\\W+");
		
		split("o\\w+");
		
		//替换匹配到的第一个
		System.out.println(string.replaceFirst("a\\w", "pdl"));
		//替换匹配到的所有
		System.out.println(string.replaceAll("a\\w", "pdl"));
		
	}
	
	private static  String string="i am a sad boy! adn i do not to tell anybody.";
	private static void split(String regex){
		System.out.println(Arrays.toString(string.split(regex)));
	}
}
