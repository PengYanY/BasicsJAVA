package com.pdl.string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner("12,34,56,78");
		//\s±íÊ¾¿Õ°×·û
		scanner.useDelimiter("\\s*,\\s*");
		
		
		while(scanner.hasNextInt()){
			System.out.println(scanner.nextInt());
		}
		
		
		
		String input="But I am not dead yet! I feel happy!";
		
		StringTokenizer stroke=new StringTokenizer(input);
		System.out.println("----------------");
		while(stroke.hasMoreElements()){
			System.out.print(stroke.nextToken()+"-");
		}
		
		System.out.println("----------------");
		System.out.println(Arrays.toString(input.split(" ")));
		
		Scanner scanner1=new Scanner(input);
		
		while(scanner1.hasNext()){
			System.out.print(scanner1.next()+"  ");
		}
		
	}
}
