package com.challenge.collections.Comparator;

import java.util.Comparator;

public class ComparatorSort implements Comparator<Books> {
	
	
	@Override
	public int compare(Books o1, Books o2) {
		return o1.title.compareTo(o2.title);
	}
	
}
