package com.challenge.collections.Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {

	public static void main(String[] args) {
			ArrayList<Books> a1=new ArrayList<Books>();
			a1.add(new Books(1, "Java", 150.25));
			a1.add(new Books(2, "SQL", 160.55));
			a1.add(new Books(3, "React", 110.25));
			
			Collections.sort(a1,new ComparatorSort());
			
			for(Books s:a1) {
				System.out.println("Books[Id: "+s.id+", Title: "+s.title+", Price: "+s.price+"]");
			}
	}

}
