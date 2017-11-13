package com.pdl.oop3;

import com.pdl.oop2.PackageTest;

public class Package3Test {
	 
	public static void main(String[] args) {
		PackageTest pack=new PackageTest();
		//pack.say();这里不能调用，say方法的权限只在包内
		//PackageTest.hello();
	}
	
   private class Gt{
		
   }
}
