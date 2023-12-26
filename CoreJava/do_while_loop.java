package day1;

import java.util.Scanner;

public class do_while_loop 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:- ");
		n = sc.nextInt();
		
		do
		{
			System.out.println("Hello...");
			//	n--;
			n = n /10;
		}while(n>0);
	}
}
