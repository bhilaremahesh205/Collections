package com.mahesh.Array_List;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(55);
		hs.add(78);
		hs.add(54);
		hs.add(78);
		
		hs.add(783);
		hs.add(70);
		
		hs.add(78);
		hs.add(718);
		hs.add(78);
		System.out.println(hs.size());
		System.out.println(hs);
		
	}

}
