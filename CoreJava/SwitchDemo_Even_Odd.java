package day1;

import java.util.Scanner;

public class SwitchDemo_Even_Odd
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:- ");
		n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else 
		{
			System.out.println("Odd");
			
		}
		System.out.println("By Switch Statement");
		switch(n%2) 
		{
			case 1:
				System.out.println("Odd");
				break;
			case 0:
				System.out.println("Even");
			
			default:
				System.out.println("Something went wrong...");
				
		}
		
	}
}
