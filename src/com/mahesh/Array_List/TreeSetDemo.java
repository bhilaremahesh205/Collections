package com.mahesh.Array_List;


import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
	TreeSet<Integer> ts=new TreeSet<Integer>();
	ts.add(54);
	ts.add(78);
	
	ts.add(783);
	ts.add(70);
	
	ts.add(78);
	ts.add(718);
	ts.add(78);
	System.out.println(ts.size());
	System.out.println(ts);
}
}