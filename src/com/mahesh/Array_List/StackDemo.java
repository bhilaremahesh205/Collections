package com.mahesh.Array_List;

import java.util.Stack;


public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> al=new Stack<Integer>();
		al.push(55);
		al.push(54);
		al.push(78);
		al.push(783);
		al.push(70);
		al.push(78);
		al.push(718);
		System.out.println(al.size());
		System.out.println(al);
		al.pop();
		System.out.println(al);
		}

}
