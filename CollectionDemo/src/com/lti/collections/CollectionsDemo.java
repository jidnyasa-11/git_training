package com.lti.collections;

import java.util.*;
public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lst=new LinkedList<String>(Arrays.asList("abc","xyz","pqr","lmn"));
		/*lst.add("A");
		lst.add("b");
		lst.add("c");
		for(String str:lst) {
			System.out.println(str);
		}*/
		
		Collections.sort(lst);
		System.out.println(lst);
	}

}
