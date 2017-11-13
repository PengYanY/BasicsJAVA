package com.pdl.genericity;

import java.util.ArrayList;
import java.util.List;

public class ExceptionTest {
	public static void main(String[] args) {
		ProcessRunner<String,Failurel> runner =new ProcessRunner<String,Failurel> ();
		
		for (int i = 0; i < 3; i++) {
			runner.add(new Processorl());
		}
		
		try {
			System.out.println(runner.processAll());
		} catch (Failurel e) {
			e.printStackTrace();
		}
		
		
		
		ProcessRunner<Integer,Failurel2> runner1 =new ProcessRunner<Integer,Failurel2> ();
		
		for (int i = 0; i < 3; i++) {
			runner1.add(new Processorl2());
		}
		
		try {
			System.out.println(runner1.processAll());
		} catch (Failurel2 e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}


interface Processor<T,E extends Exception> {
	void process(List<T> resultCollector) throws E;
}


class ProcessRunner<T,E extends Exception> extends ArrayList<Processor<T,E>>{
	List<T> processAll() throws E{
		
		List<T> resultCollector =new ArrayList<T>();
		
		for (Processor<T,E> p : this) {
			p.process(resultCollector);
		}
		
		return resultCollector;
	}
}


class Failurel extends Exception{}


class Processorl implements Processor<String,Failurel>{
	
	static int count=3;
	@Override
	public void process(List<String> resultCollector) throws Failurel {
		if(count-->1){
			resultCollector.add("hep!");
		}else{
			resultCollector.add("ho!");
		}
		
		if(count<0){
			throw new Failurel();
		}
	}
}


class Failurel2 extends Exception{}


class Processorl2 implements Processor<Integer,Failurel2>{
	
	static int count=2;
	@Override
	public void process(List<Integer> resultCollector) throws Failurel2 {
		if(count-->1){
			resultCollector.add(47);
		}else{
			resultCollector.add(11);
		}
		
		if(count<0){
			throw new Failurel2();
		}
	}
}
























