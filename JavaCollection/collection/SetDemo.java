package day3.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;

public class SetDemo 
{
	public static void main(String[] args) 
	{
		Set<Integer> set1 = new HashSet<>(); //Unorder
		set1.add(43);
		set1.add(53);
		set1.add(44);
		set1.add(43);
		set1.add(null);
		Set<Integer> set2 = new LinkedHashSet<>(); //order insertion
		set2.add(43);
		set2.add(53);
		set2.add(44);
		set2.add(43);
		set2.add(null);
		Set<Integer> set3 = new TreeSet<>(); // sorted.
		set3.add(43);
		set3.add(53);
		set3.add(44);
		set3.add(43);
	//	set3.add(null);         //Error 
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set3);
		
		System.out.println("For each loop");
		for (Integer i :set1) 
		{
			System.out.println(i);
		}
		//Iterator it used with all Collection classes (iterate in forward direction only.)
		System.out.println("Iterator:- ");
		Iterator<Integer> itr = set2.iterator();
		while(itr.hasNext())
		{
			Integer value = itr.next();
			System.out.println(value);
		}
		System.out.println("Foreach method");
		// For-each method also we use to iterate it.
		Consumer<Integer> c_obj = new ListConsumer();
		set3.forEach(c_obj);
		
		
		
	}
}
