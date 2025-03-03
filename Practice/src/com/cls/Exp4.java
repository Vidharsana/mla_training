package com.cls;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class Exp4 {

	public static void main(String args[]) {
		ArrayList<String> ln = new ArrayList<>();
		ln.add("java");
		ln.add("python");
		ln.add("Spring");
		Iterator<String> itr = ln.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		ListIterator<String> ltr = ln.listIterator();
		while(ltr.hasPrevious()) {
			System.out.println(ltr.previous());
		}
		for(String dt : ln) {
			System.out.println(dt);
		}
		Collections.sort(ln);
		System.out.println(ln);
		//Collections.sort(ln.reversed());
		System.out.println(ln);
	}
}
