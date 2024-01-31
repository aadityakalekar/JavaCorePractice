package practicedemo1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Consumer;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer,String> mList= new HashMap<Integer, String>();
		mList.put(10, "html");
		mList.put(20, "css");
		mList.put(21, "Go");
		mList.put(22, "Kuber");
		System.out.println(mList);
		if(!mList.containsKey(1)) {
			mList.put(1, "java");
		}
		//mList.remove(1);
		System.out.println(mList);
		
		Map<Integer, String> mList1= new LinkedHashMap<Integer, String>();
		mList1.put(30, "Js");
		mList1.put(40, "react");
		mList1.put(32, "Docker");
		mList1.put(44, "kafka");
		System.out.println(mList1);
		
		Map<Integer, String> mList2= new TreeMap<Integer, String>();
		mList2.put(50, "node");
		mList2.put(51, "MySql");
		mList2.put(52, "Mongo");
		mList2.put(53, "Plsql");
		System.out.println(mList2);
		
		Set<Integer> keys= mList1.keySet();
		System.out.println("For Each Loop for Key of map");
		for(Integer i:keys) {
			System.out.println(i);
		}
		Collection<String> cs=mList1.values();
		System.out.println("For Each Loop for values of map");
		Consumer<String> c= new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
		};
		cs.forEach(c);
		
		Set<Map.Entry<Integer, String>> entrySet= mList2.entrySet();
		Iterator<Map.Entry<Integer, String>> itr=entrySet.iterator();
		
		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry=itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			}
	}
}
