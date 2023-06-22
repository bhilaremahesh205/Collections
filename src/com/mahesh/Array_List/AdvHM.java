package com.mahesh.Array_List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class AdvHM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,ArrayList<String>> hm=new HashMap<>();
		ArrayList<String> al=new ArrayList<>();
		al.add("1561511");
		al.add("165156551");
		al.add("1515615");
		hm.put(4, al);
		ArrayList<String> all=new ArrayList<>();
		all.add("4415511");
		all.add("221551");
		all.add("858585");
		all.add("11212");
		hm.put(5, all);
		
		
		
		//=======================================================
		Set<Integer> keys=hm.keySet();
		for(int key: keys) {
			System.out.println(keys);
			ArrayList<String> alll= hm.get(key);
					for(String str: alll)
			System.out.println(str);
		}
		
		
		
		
	}

}
