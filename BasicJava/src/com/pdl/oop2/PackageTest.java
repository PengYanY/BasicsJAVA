package com.pdl.oop2;


import static java.lang.Integer.*;//��̬���룬���뾲̬�ķ����ͱ�����ֱ��ʹ�ò���ͨ������


public class PackageTest {
	
	void say(){
		System.out.println("hello");
	}
	
	static void hello(){
		System.out.println("world.....");
	}
	public static void main(String[] args) {

		System.out.println(MAX_VALUE);
		Boy boy =new Boy();
		boy.say();
	
	}

}

//�������������ͬһ�����п��Ա�����
class Boy{
	void say(){
		System.out.println("hello boy");
	}
}




