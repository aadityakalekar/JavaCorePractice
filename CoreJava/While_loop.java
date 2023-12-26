package day1;

import java.util.Scanner;

public class While_loop 
{
	public static void main(String[] args)
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:- ");
		n = sc.nextInt();
		
		while(n>0)
		{
			System.out.println("Hello...");
			//	n--;
			n = n /10;
		}
	}
}
