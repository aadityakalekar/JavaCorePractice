package practicedemo1;

import java.util.ArrayList;
import java.util.Collection;

class Demo{}
public class GenericCollection {
	public static void main(String[] args) 
	{
		// Collection is Group object 
		
		ArrayList obj = new ArrayList();
		obj.add(12);
		obj.add(12.5);
		obj.add("String");
		obj.add(new Demo());
		
		int v1 = (Integer) obj.get(2);
		System.out.println("v1:-"+v1);
	}
}
