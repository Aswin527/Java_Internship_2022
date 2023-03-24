package com.challenge.collections.Comparable;

public class ComparableSort implements Comparable<ComparableSort> {
	int id;
	String title;
	double price;
	ComparableSort(int id,String title,double price) {
		super();
		this.id=id;
		this.title=title;
		this.price=price;
	}
	
	@Override
	public String toString(){
		return "Book [id: "+id+",title: "+title+",price: "+price+"]";
	}
	
	@Override
	public int compareTo(ComparableSort o) {
		ComparableSort c=(ComparableSort)o;
		return title.compareTo(c.title);
	}
}
