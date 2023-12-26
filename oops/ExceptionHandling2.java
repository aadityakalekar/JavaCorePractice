package day2.oops;

import java.util.Scanner;

public class ExceptionHandling2 
{
	public static void divide() throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int num[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("a:- ");
		num[0] = sc.nextInt();
		
		System.out.print("b:- ");
		num[1] = sc.nextInt();
		
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
