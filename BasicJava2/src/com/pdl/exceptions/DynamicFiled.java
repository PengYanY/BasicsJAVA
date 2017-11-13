package com.pdl.exceptions;

public class DynamicFiled{
	private Object[][] fileds;
	
	DynamicFiled(int num){
		fileds=new Object[num][2];
		for(int i=0;i<num;i++){
			fileds[i]=new Object[]{null,null};
		}
	}
	@Override
	public String  toString(){
		StringBuilder res=new StringBuilder();
		for (Object[] objects : fileds) {
			res.append(objects[0]);
			res.append(":");
			res.append(objects[1]);
			res.append("\n");
		}
		return res.toString();
	}
	
	private int hasField(String id){
		for (int i = 0; i < fileds.length; i++) {
			if(id.equals(fileds[i][0]))return i;
		}
		return -1;
	}
	
	
	private int getFiledNumber(String id) throws NoSuchFieldException{
		int num=hasField(id);
		if(num==-1){
			throw new NoSuchFieldException();
		}
		return num;
	}
	
	
	private int makeField(String id){
		for (int i = 0; i < fileds.length; i++) {
			if(fileds[i][0]==null){
				fileds[i][0]=id;
				return i;
			}
		}
		
		Object[][] tmp=new Object[fileds.length+1][2];
		
		for (int i = 0; i < fileds.length; i++) {
			tmp[i]=fileds[i];
		}
		
		for (int i = fileds.length; i < tmp.length; i++) {
			tmp[i]=new Object[]{null,null};
		}
		
		fileds=tmp;
		
		return makeField(id);
	}
	
	
	public Object getField(String id) throws NoSuchFieldException{
		return fileds[getFiledNumber(id)][1];
	}
	
	public Object setField(String id,Object value) throws DynamicFiledsException{
		if(value==null){
			DynamicFiledsException dfe=new DynamicFiledsException();
			dfe.initCause(new NullPointerException());
			throw dfe;
		}
		
		int num=hasField(id);
		//System.out.println("---"+num);
		if(num==-1){
			
			num=makeField(id);
		}
		
		Object res=null;
		try {
			res=getField(id);
		} catch (NoSuchFieldException e) {	// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new RuntimeException(e);
		}
		fileds[num][1]=value;
		return res;
	}
	
	
	public static void main(String[] args) {
		DynamicFiled df=new DynamicFiled(3);
		System.out.println(df);
		
		try {
			df.setField("a", "a value");
			df.setField("num", 12);
			df.setField("num1", 23);
			System.out.println(df);
			
			df.setField("a", "new");
			df.setField("b", "new1");
			System.out.println(df);
			
			System.out.println(df.getField("a"));
			//df.getField("123");
			Object field=df.setField("d", null);
		} catch (DynamicFiledsException e) {
			
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
		
			e.printStackTrace();
		}
	}
	
}



class DynamicFiledsException extends Exception{
	
}
