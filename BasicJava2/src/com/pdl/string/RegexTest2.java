package com.pdl.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {
	public static void main(String[] args) {
		
		System.out.println("args:"+args[0]);
		
		for (String s : args) {
			Pattern p=Pattern.compile(s);
			Matcher m=p.matcher(args[0]);
			System.out.println(s);
			while(m.find()){
				System.out.println(m.group()+"--("+m.start()+","+(m.end()-1)+")");
			}
		}
		
		String testStr="abcabcdf 1234 tabcc";
		String reg="t(abc+)(c)";
		//String reg="abc";
		Pattern p=Pattern.compile(reg);
		Matcher m=p.matcher(testStr);
		System.out.println(m.groupCount());
		
		//lookAt()每次都是从输入的最开始开始匹配
		System.out.println(m.lookingAt());
		System.out.println(m.lookingAt());
		//System.out.println(m.find());
		while(m.find()){
			//System.out.println(m.lookingAt()+"--("+m.start()+","+(m.end()-1)+")");
			System.out.println(m.group()+"--("+m.start()+","+(m.end()-1)+")");
		}
		
		String input="This!! unuaual use!!of exclamation!!points";
		System.out.println(Arrays.toString(Pattern.compile("!!").split(input)));
		//可以指出分割的个数
		System.out.println(Arrays.toString(Pattern.compile("!!").split(input,3)));
		
		
		String input1="abc abc abc abcdef";
		
		Pattern p1=Pattern.compile("abc");
		Matcher m1=p1.matcher(input1);
		StringBuffer buf=new StringBuffer();
		
		while(m1.find()){
			
			//System.out.println(m1.group());
			//把匹配到的加入buf
			m1.appendReplacement(buf, m1.group().toUpperCase());
			//把匹配后的字符加入到buf
			m1.appendTail(buf);
			System.out.println(buf);
		}
		
		//重新匹配，不带参数表示匹配旧的字符串
		m1.reset("abcd abc3");
		while(m1.find()){
			System.out.println(m1.group());
		}
		//System.out.println(input1.replaceFirst("abc", "pdl"));
		
		
	}
}
