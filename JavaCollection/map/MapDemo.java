package day3.map;


import java.util.function.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;


public class MapDemo 
{
	public static void main(String[] args) 
	{
		Map<Integer, String> map1= new HashMap<>();
		map1.put(14, "Raj");
		map1.put(42, "Jay");
		map1.put(73, "Priya");
		map1.put(42, "Jayesh");
		map1.put(45, "Jayesh");
		if(!map1.containsKey(3))
		{
			map1.put(3, "Riya");
		}
		map1.remove(3);
		map1.remove(73,"Priy");
	
		Map<Integer, String> map2= new LinkedHashMap<>();
		map2.put(14, "Raj");
		map2.put(42, "Jay");
		map2.put(73, "Priya");
		map2.put(42, "Jayesh");
		Map<Integer, String> map3= new TreeMap<>();
		map3.put(14, "Raj");
		map3.put(42, "Jay");
		map3.put(73, "Priya");
		map3.put(42, "Jayesh");
		map3.put(43, null);
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
		
		Set<Integer> keys = map1.keySet();
		System.out.println("For each loop for Key of Map");
		for (Integer i :keys) 
		{
			System.out.println(i);
		}
		Collection<String> values = map1.values();
		System.out.println("For each method for values of Map");
		Consumer<String> c_obj = new Consumer<String>() 
		{
			
			@Override
			public void accept(String t) {
				System.out.println(t);
				
			}
		};
		values.forEach(c_obj);
		
		
		Set<Map.Entry<Integer, String>> entrySet = map3.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();
		
		while(itr.hasNext()) 
		{
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey()+"<--->"+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
