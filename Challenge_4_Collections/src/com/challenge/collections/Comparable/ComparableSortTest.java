package com.challenge.collections.Comparable;

import java.util.*;

public class ComparableSortTest {

	public static void main(String[] args) {
		
		ArrayList<ComparableSort> b1=new ArrayList<ComparableSort>();
		b1.add(new ComparableSort(1,"Books",10.2));
		b1.add(new ComparableSort(2,"Java",10.2));
		b1.add(new ComparableSort(3,"ASP",10.2));
	
		Collections.sort(b1);
			
		for(ComparableSort b:b1) {
			System.out.println(b);
		}
		
	}

}
