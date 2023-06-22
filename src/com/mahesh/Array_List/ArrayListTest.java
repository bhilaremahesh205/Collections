package com.mahesh.Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> al=new ArrayList<>();
		al.add(55);
		al.add(23);
		al.add(44);
		al.add(15);
		al.add(10);
		
		System.out.println("Before the Sorting");
		for(int arr:al) {
			System.out.println(arr);
		}
		System.out.println("After the Sorting");
		Collections.sort(al);
		for(int arr:al) {
			System.out.println(arr);
		}
	}

}
