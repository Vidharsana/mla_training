package com.cls;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Exp9 {

	public static void main(String args[]) {
		LinkedHashSet data = new LinkedHashSet();
		
		data.add("java");
		data.add(100);
		data.add('v');
		data.add(100);
		data.add(10);
		data.add(33.33f);
		data.add(22.22d);
		data.add(false);
		data.add("rohit");
		System.out.println(data);
		Iterator itr = data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		data.forEach(x->System.out.println(x));
	}
}
