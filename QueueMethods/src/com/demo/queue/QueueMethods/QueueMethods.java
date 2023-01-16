package com.demo.queue.QueueMethods;

import java.util.*;
public class QueueMethods {

	public static void main(String[] args) {
		LinkedList l1=new LinkedList();// Follows FIFO
		l1.add(1);
		l1.add(4);
		l1.add(25);
		l1.add(15);
		l1.add(32);
		System.out.println(l1);
		System.out.println(l1.peek());//print the head 
		
		PriorityQueue p=new PriorityQueue<>();//Follows Natural Ordering Algorithm
		p.add(2);
		p.add(6);
		p.add(71);
		p.add(52);
		p.add(22);
		System.out.println(p);
		System.out.println(p.peek()	);
		
	}

}
