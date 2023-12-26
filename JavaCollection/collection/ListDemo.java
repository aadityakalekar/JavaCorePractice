package day3.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;
import java.util.function.Consumer;

public class ListDemo 
{
	// 1.Ordered Collection, allowed duplicated, allowed null value,allowed index to access values.
	/*
	 		1.ArrayList
	 		2.LinkedList
	 		3.Vector
	 		4.Stack
	 
	 	To Represent primitive data into object from java introduce wrapper classes.
	 	int      --> Integer 
	 	float 	-->  Float
	 	char   --> Character 
	 	
	*/
	public static void main(String[] args)
	{
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(53);
		list1.add(61);
		/*
		        0       1           2 
		  		1    	53          61
		  		1010    1011       1012
		 */
		//Collection
		list1.add(1, 34);
		/*
		        0       1           2 			3
		  		1    	34			53          61
		  		1010    1011       1012       1013
		 */
		
		
		List<Integer> list2 = new LinkedList<>();
		list2.add(1);
		list2.add(53);
		list2.add(61);
		
		/*           value  Addr
        Node ->    null<--1     101 -->305
        
        Node ->    101 <--53    305 --> 506
        
        Node ->    305 <--61    506 --> null
 */
		list2.add(1, 34);
		/*
        Node ->   <--34  467 -->
 */
		
		//Both are legacy classes (Enumeration (I), Hashtable, Properties
		List<Integer> list3 = new Vector<>();
		list3.add(1);
		list3.add(53);
		list3.add(61);
		list3.add(1, 34);
		List<Integer> list4 = new Stack<>();
		list4.add(1);
		list4.add(53);
		list4.add(61);
		list4.add(1, 34);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		System.out.println(list4);
		System.out.println("Normal for loop");
		
		for (int i = 0; i < list1.size(); i++) 
		{
			System.out.println(list1.get(i));
		}
		System.out.println("For each loop");
		for (int i :list2) 
		{
			System.out.println(i);
		}
		//Iterator it used with all Collection classes (iterate in forward direction only.)
		System.out.println("Iterator:- ");
		Iterator<Integer> itr = list3.iterator();
		while(itr.hasNext())
		{
			int value = itr.next();
			System.out.println(value);
		}
		//It is used with only List Classes (iterate in both direction forward or backwared.)
		ListIterator<Integer> itr2 = list3.listIterator();
		System.out.println("Forward Dir ListIterator:- ");
		while(itr2.hasNext())
		{
			int value = itr2.next();
			System.out.println(value);
		}
		System.out.println("backward Dir ListIterator:- ");
		while(itr2.hasPrevious())
		{
			int value = itr2.previous();
			System.out.println(value);
		}
		System.out.println("Foreach method");
		// For-each method also we use to iterate it.
		Consumer<Integer> c_obj = new ListConsumer();
		list4.forEach(c_obj);
		
		
		
	}
}