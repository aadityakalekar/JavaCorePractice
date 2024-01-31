package practicedemo1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


class ListConsumer{}
public class SetDemo {
	public static void main(String[] args) {
		Set<Integer> s=new HashSet<Integer>(); //unordered
		s.add(10);
		s.add(11);
		s.add(12);
		s.add(13);
		s.add(null);
		
		Set<Integer> s1=new LinkedHashSet<Integer>(); //Ordered List
		s1.add(20);
		s1.add(21);
		s1.add(22);
		s1.add(23);
		s1.add(null);
		
		Set<Integer> s2= new TreeSet<Integer>();
		s2.add(30);
		s2.add(31);
		s2.add(32);
		s2.add(33);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("Bu using for each loop");
		for(Integer i:s) {
			System.out.println(i);
		}
		
		Iterator<Integer> itr= s1.iterator();
		while(itr.hasNext()) {
			int i2=itr.next();
			System.out.println(i2);
		}
		
		
		
	}
}
