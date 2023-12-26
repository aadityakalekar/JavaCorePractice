package day2.oops;

import java.util.Scanner;

public class ExceptionHandling 
{	
	public static void divide() 
	{
		int num[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("a:- ");
		num[0] = sc.nextInt();
		
		System.out.print("b:- ");
		num[6] = sc.nextInt();
		try 
		{
		  //num[2] = num[0]/num[6];  // new ArrayIndexOutOfBoundsException()
		//	num[6] = num[0]/num[1];  // new ArithemeticExcepetion()
			num[2] = num[0]/num[1]; 
			System.out.println("Try completed..");
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
		finally
		{
			System.out.println("finally completed..");
		}
		
		
		System.out.println("Division:- "+num[2]);
	}

	public static void main(String[] args) 
	{
		divide();
		
		System.out.println("Main Method Rest of code....");
	}

}
