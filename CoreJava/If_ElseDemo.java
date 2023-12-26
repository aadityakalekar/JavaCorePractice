package day1;

import java.util.Scanner;

public class If_ElseDemo 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:- ");
		n = sc.nextInt();
		
		if(n>0) 
		{
			/*if()
			{
				
			}*/
			System.out.println("+tive");
		}
		else if(n<0)
		{
			System.out.println("-tive");
		}
		else 
		{
			System.out.println("Zero..");
		}
		System.out.println("Program completed.");
		
	}
}
