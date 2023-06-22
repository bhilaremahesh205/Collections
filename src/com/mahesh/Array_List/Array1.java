package com.mahesh.Array_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(55);
		al.add(54);
		al.add(78);
		al.add(783);
		al.add(70);
		al.add(78);
		al.add(718);
		//System.out.println(al.size());
		HashSet<Integer> hs=new HashSet<>();
		System.out.println(al);	
		System.out.println(hs);	
		Collections.sort(al);;
		
		System.out.println(al);
		Collections.reverse(al);
;		System.out.println(al);
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//			}
//		
////		
//for(int a:al) {
//	
//	System.out.println(a);
//}	
//		
		
		
		
		
		
	}

}
