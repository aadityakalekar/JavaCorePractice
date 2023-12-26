package day2.oops;

class Vehicle2
{
	Number run() 
	{
		System.out.println("Vehicle is Running.....");
		return 0;
	}
	
}
class Car extends Vehicle2
{
	@Override
	protected Number run() 
	{
		System.out.println("Car is Running.....");
		return 0;
	}
}
class Bike extends Vehicle2
{
	@Override
	public Integer run() 
	{
		System.out.println("Bike is Running.....");
		return null;
	}
}
class Car2 extends Vehicle2
{
	@Override
	Float run() 
	{
		System.out.println("Bike is Running.....");
		return null;
	}
}
public class Polymorphism2 
{
	public static void main(String[] args)
	{
//		
//		Car obj = new Car();
//		obj.run();
//	
		//Up-Casting 
		Vehicle2 obj =null;
		
		obj  = new Car();
		obj.run();
		
		obj = new Bike();
		obj.run();
	}
}
