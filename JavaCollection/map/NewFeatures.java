package day3.map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface Printable {
	void myPrint();
}

@FunctionalInterface
interface Printable2 {
	void myPrint(String msg);
}

@FunctionalInterface
interface Printable3 {
	void sayHello(String name,int age);
}
class Message implements Printable
{
	@Override
	public void myPrint() 
	{
		System.out.println("Using Inheritance ");
	}
}


public class NewFeatures {
	public static void main(String[] args) 
	{
		Message obj1 = new Message();
		obj1.myPrint();
		Message obj2 = new Message();
		obj2.myPrint();
		
		//Anonymous Class 

		Printable obj3 = new Printable() 
	//	NewFeatures$1
		{
			@Override
			public void myPrint() 
			{
				System.out.println("Using Anonymous Inner Class ");
			}
		};
		obj3.myPrint();
		Printable obj4 = new Printable() 
	//	NewFeatures$1
		{
			@Override
			public void myPrint() 
			{
				System.out.println("Using Anonymous Inner Class 2 ");
			}
		};
		obj4.myPrint();
		
		//Lambda Expression-- > Zero Parameter  
		Printable obj5 = () ->{
			System.out.println("Lambda Expression...");
		};
		obj5.myPrint();

		//Lambda Expression-- > Single Parameter 
		Printable2 obj6 = msg ->{
			System.out.println("Message is :- "+msg);
		};
		obj6.myPrint("Welcome Java Programming...");

		//Lambda Expression-- > Multiple Parameter 
		
		Printable3 obj8 = (name,age)->{
			System.out.println("Name:- "+name);
			System.out.println("Age:- "+age);
		};
		obj8.sayHello("Rajesh", 20);
		
		
		List<Integer> list1 = new ArrayList<>(Arrays.asList(4,5,6,7,8));
		list1.forEach(t->{System.out.println(t);});
		
	}
}
