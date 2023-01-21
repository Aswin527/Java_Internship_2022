package com.challenge.collections.HashSetToArrayList;

import java.util.*;

public class HashSetToArrayList {
	public static void main(String[] args) {
		HashSet<String> h_set = new HashSet<>();
		 
		h_set.add("tulip");
		h_set.add("rose");
		h_set.add("orchid");
		h_set.add("marie-gold");
 
        System.out.println(h_set);
        ArrayList<String> a= new ArrayList<>(h_set);

        System.out.println("Elements of flower Arraylist are :");
        
        System.out.println(a);
 
        System.out.print("Element at index 0 is : "+ a.get(0) + " ");
	}
}
