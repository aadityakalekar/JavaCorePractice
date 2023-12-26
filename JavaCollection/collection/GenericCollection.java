package day3.collection;

import java.util.ArrayList;

public class GenericCollection
{
	public static void main(String[] args)
	{
		ArrayList<String> obj = new ArrayList<>();
		System.out.println("Initial is "+obj.size());
		
		obj.add("raj");
		obj.add("jay");

		System.out.println("After insertion is "+obj.size());
		String v1 = obj.get(0);
		System.out.println("v1:-"+v1);
	}
}
