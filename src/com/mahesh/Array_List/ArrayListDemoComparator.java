package com.mahesh.Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemoComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> arr=new ArrayList<>();
		arr.add(new Student(22,"Pune"));
		arr.add(new Student(12,"mumbai"));
		arr.add(new Student(2,"sangali"));
		arr.add(new Student(212,"kolhapur"));
		arr.add(new Student(122,"satara"));
		System.out.println("Before Sorting"+arr);
		
		Collections.sort(arr,new StudentAgeComparator());
		System.out.println("After Sorting"+arr);
		
		
		
	}

}
