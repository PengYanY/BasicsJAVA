package com.pdl.genericity;


//���÷���ʵ��ջ�Ĳ���
public class LinkedStackTest<T> {
	
	
	private static class Node<U>{
		U item;
		Node<U> next;
		Node(){
			item=null;
			next=null;
		}
		
		Node(U item,Node<U> next){
			this.item=item;
			this.next=next;
		}
		
		boolean end(){
			return item==null&&next==null;
		}
	}
	
	//�ʼnew һ����ֵ����
	private Node<T> top=new Node<T>();
	
	public void push(T item){
		top=new Node<T>(item,top);
	}
	
	public T pop(){
		T result=top.item;
		if(!top.end()){
			top=top.next;
		}
		return result;
	}
	
	public static void main(String[] args) {
		LinkedStackTest<String> lst=new LinkedStackTest<String>();
		
		for(String s:"what we are".split(" ")){
			lst.push(s);
		}
		String s;
		while((s=lst.pop())!=null){
			System.out.println(s);
		}
	}
}












