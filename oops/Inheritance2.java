package day2.oops;

interface Calculator0
{
	void square(int a);
}

interface Calculator extends Calculator0
{
	void calculate(int a,int b);
}
class Demo{}

//Multiple Inheritance
class BasicCalculation extends Demo implements Calculator
{
	@Override
	public void calculate(int a, int b) 
	{
		System.out.println("Addition:- "+(a+b));
	}
	@Override
	public void square(int a) {
		// TODO Auto-generated method stub		
	}
	
}

public class Inheritance2 
{
	public static void main(String[] args) 
	{
		BasicCalculation obj = new BasicCalculation();
		obj.calculate(23, 2);
	}
}
