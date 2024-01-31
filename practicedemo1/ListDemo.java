package practicedemo1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("List1");
		str.add("List1");
		str.add("List1");
		str.add("List1");
		
		str.add(1, "Listed");
		System.out.println(str);
		
		LinkedList<String> str1=new LinkedList<String>();
		str1.add("List2");
		str1.add("List2");
		str1.add("List2");
		str1.add("List2");
		
		str1.add(2, "Listed");
		System.out.println(str1);
		
		List<String> str3=new Vector<String>();
		str3.add("List3");
		str3.add("List3");
		str3.add("List3");
		str3.add("List3");
		
		str3.add(3, "Listed");
		System.out.println(str3);
		
		System.out.println("by using for each loop");
		for(String s:str1) {
			System.out.println(s);
		}
		
		//Iterator it used with all Collection classes (iterate in forward direction only.)
		System.out.println("Iterator:");
		Iterator<String> itr=str3.iterator();
		while (itr.hasNext()) {
			String s1=itr.next();
			System.out.println(s1);
		}
		//It is used with only List Classes (iterate in both direction forward or backwared.)
		ListIterator<String> itr2=str3.listIterator();
		System.out.println("Forward direction list iterator:");
		while (itr2.hasNext()) {
			String s2=itr2.next();
			System.out.println(s2);
		}
		System.out.println("Backward direction list iterator:");
		while (itr2.hasPrevious()) {
			String s2=itr2.previous();
			System.out.println(s2);
		}
		
	}
}
