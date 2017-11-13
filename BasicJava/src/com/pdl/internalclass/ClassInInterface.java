package com.pdl.internalclass;

public interface  ClassInInterface {
	
	//接口中的类为static和public
	static public class InterfaceA{}
	class G{
		static int num;
	}
	//不能定义为protected或者private  接口都是public
	//protected class G{}
	//private static class J{}
}
