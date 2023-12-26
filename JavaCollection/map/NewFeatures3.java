package day3.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NewFeatures3 
{
	public static void main(String[] args) 
	{
		List<String> list2 = new ArrayList<>(Arrays.asList("Raj","Jay","Priya","Riya","Shashank"));
		
		Stream<String> s1 = list2.stream();
		
		Stream<String> s2=  s1.filter(name->name.length()>3);
		
		Stream<String> s3 = s2.map(name->name.toUpperCase());
		
		List<String> list3 = s3.toList();		

		System.out.println(list2);
		System.out.println(list3);
		
		List<String> list4 = list2.stream().filter(name->name.length()<4).map(name->name.toLowerCase()).toList();
		System.out.println(list4);
		
	}
}
