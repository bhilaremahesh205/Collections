package com.mahesh.Array_List;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStudentComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<StudentComparable> arr=new ArrayList<>();
		arr.add(new StudentComparable(22,"Pune"));
		arr.add(new StudentComparable(12,"mumbai"));
		arr.add(new StudentComparable(2,"sangali"));
		arr.add(new StudentComparable(212,"kolhapur"));
		arr.add(new StudentComparable(122,"satara"));
		System.out.println("\n"+"Before sorting"+arr);
		Collections.sort(arr);
		System.out.println("\n"+"After sorting"+arr);
		
	}
		
		
		
	}


