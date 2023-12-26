package day3.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BasicCalc
{
	public BasicCalc() {
	}
	//Constructor
	public BasicCalc(double a,double b) 
	{
		System.out.println("a:- "+a);
		System.out.println("b:- "+b);
	}
	//Instance method 
	public void add(double a,double b)
	{
		System.out.println("Addition is "+(a+b));
	}
	//static method
	public static void multi(double a,double b)
	{
		System.out.println("Multiplication is "+(a*b));
	}
}
@FunctionalInterface
interface Operation
{
	public void calculate(double a,double b);
}

public class NewFeatures2 
{
	public static void main(String[] args) 
	{
		Operation obj = (a,b)-> System.out.println("Addition is "+(a+b));
		obj.calculate(3, 4);
		
		//Method Reference --> Instance method
		BasicCalc basicCalc = new BasicCalc();
		Operation obj2 = basicCalc::add;
		obj2.calculate(4, 6);

		//Method Reference --> Static method
		Operation obj3 = BasicCalc::multi;
		obj3.calculate(4, 6);
		
		
		//Method Reference --> Constructor
		Operation obj4 = BasicCalc::new;
		obj4.calculate(4, 6);
		

		List<Integer> list1 = new ArrayList<>(Arrays.asList(4,5,6,7,8));
		list1.forEach(t->{System.out.println(t);}); //Lambda Expression
		List<String> list2 = new ArrayList<>(Arrays.asList("Raj","Jay","Priya","Riya","Shashank"));
		list2.forEach(System.out::print); //Method Reference
		
		
		
		
		
		
		
		
	}
}
