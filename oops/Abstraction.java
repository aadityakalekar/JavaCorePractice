package day2.oops;

//Partial 
abstract class Vehicle
{
	// abstract 
	public abstract void run();
	
	public void m1()
	{
		System.out.println("Concrete Method of Abstract Class");
	}
}

interface Account
{
	int num=10;
	void withdraw();

	// default is used to declare  concrete instance method from 1.8 
	public default void m1() 
	{
		System.out.println("Concrete Method of Interface");
	}
	// static is used to declare  concrete static method from 1.8 
	public static void m2() 
	{
		System.out.println("Concrete Method of Interface");
	}
	// private  is used to declare  concrete private method from 1.9 
	private void m3() 
	{
		System.out.println("Concrete Method of Interface");
	}
	default void deposite() {}
}

class Child implements Account
{

	@Override
	public void withdraw() {
		System.out.println("Overrided mehtod ");
	}
	
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		Account.super.m1();
	}
	
}

public class Abstraction
{
	public static void main(String[] args) 
	{
		//Vehicle obj = new Vehicle(); 
		
		System.out.println(Account.num);
		Account.num=34;
	}
}
