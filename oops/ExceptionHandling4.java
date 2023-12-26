package day2.oops;

import java.util.Scanner;

public class ExceptionHandling4 {
	public static void divide() throws DivideByZeroException
	{
		int num[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("a:- ");
		num[0] = sc.nextInt();
		
		System.out.print("b:- ");
		num[1] = sc.nextInt();
		
		if(num[1]==0)
		{
			//ArithmeticException e_obj = new ArithmeticException("b Should not be zero...");
			//ArrayIndexOutOfBoundsException e_obj = new ArrayIndexOutOfBoundsException("b Should not be zero...");
			DivideByZeroException e_obj = new DivideByZeroException();
			throw e_obj;
		}
		
		num[2] = num[0]/num[1]; 
		System.out.println("Division:- "+num[2]);
	}
	
	
	public static void main(String[] args) 
	{
		try 
		{
			divide();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("catch1..");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("catch2..");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("catch3..");
		}
	}
}
