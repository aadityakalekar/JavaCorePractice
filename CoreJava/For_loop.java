package day1;

import java.util.Scanner;

public class For_loop 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter n:- ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println("Hiii...");
		}
		int j=1;
		for(;j<=n;)
		{
			System.out.println("Hello...");
			j++;
		}
	}
}
