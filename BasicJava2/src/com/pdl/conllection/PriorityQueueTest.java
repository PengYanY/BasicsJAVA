package com.pdl.conllection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		List<Integer> list=Arrays.asList(6,1,5,8,9,12,4,9,0,4);
		
		pq.addAll(list);
		//有一定的顺序
		System.out.println(pq);
		
		pq=new PriorityQueue<>(Collections.reverseOrder());
		pq.addAll(list);
		System.out.println(pq);
	}
}
