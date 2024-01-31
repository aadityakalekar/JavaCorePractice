package practicedemo;

import java.util.Scanner;

import practicedemo1.DivideByZeroException;

public class ExceptionHandling {
	
	public static void divide() throws DivideByZeroException
	{
		int num[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("a:- ");
		num[0] = sc.nextInt();
		
		System.out.print("b:- ");
		num[1] = sc.nextInt();
		
		if(num[1]==0) {
			DivideByZeroException de= new DivideByZeroException();
			throw de;
		}
		
		num[2] = num[0]/num[1]; 
		System.out.println("Division:- "+num[2]);
	}

	
	public static void main(String[] args) {
		//divide();
		try 
		{
			divide();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("catch completed..");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
