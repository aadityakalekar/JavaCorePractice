package day2.oops;

import java.lang.reflect.Method;

/*
 	2 Concept is used to achieve polymorphism.
 		1.Method/ Constructor Overloading.
 			one class contain multiple method with same name and different signature(parameter list) 
 		2.Method Overriding
 			Parent class and Child having a method with same name and signature is known method overriding
 */
class MethodOverloading
{
	public void add(int a,int b)
	{
		System.out.println("2 int ");
	}
	public void add(int a,int b,int c)
	{
		System.out.println("3 int ");
	}
	public void add(float a, float b)
	{
		System.out.println("2 float ");
	}
	public void add(int a, float b)
	{
		System.out.println("int float ");	
	}
	public void add(float a, int b)
	{
		System.out.println("float int ");	
	}
}

public class Polymorphism
{
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.add(43, 5);
		obj.add(43f,5f);
		obj.add(43,5f);
		obj.add(43f,5);
		obj.add(43,5,4);
	}
}
