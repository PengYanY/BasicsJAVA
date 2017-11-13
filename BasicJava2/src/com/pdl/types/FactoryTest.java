package com.pdl.types;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FactoryTest {
	public static void main(String[] args) {
		System.out.println(Part.creat());
		System.out.println(Part.creat());
		System.out.println(Part.creat());
		System.out.println(Part.creat());
		System.out.println(Part.creat());
		System.out.println(Part.creat());
	}
}


class Part{
	@Override
	public String toString(){
		return this.getClass().getSimpleName();
	}
	
	static List<MyFactory<? extends Part>> partFacetories=new ArrayList<>();
	
	static{
		partFacetories.add(new FuelFilter.Factory());
		partFacetories.add(new AirFilter.Factory());
		partFacetories.add(new FanFilter.Factory());
	}
	
	
	static private Random rand=new Random(37);
	static Part creat(){
		int n=rand.nextInt(partFacetories.size());
		return partFacetories.get(n).create();
		
	}

}


class Filter extends Part{}

class FuelFilter extends Filter{
	public static class Factory implements MyFactory<FuelFilter>{
		@Override
		public FuelFilter create() {
			
			return new FuelFilter();
		}
		
	}
	
}


class AirFilter extends Filter{
	public static class Factory implements MyFactory<AirFilter>{
		@Override
		public AirFilter create() {
			
			return new AirFilter();
		}
		
	}
	
}


class Belt extends Part{}


class FanFilter extends Belt{
	public static class Factory implements MyFactory<FanFilter>{
		@Override
		public FanFilter create() {
			
			return new FanFilter();
		}
		
	}
	
}





