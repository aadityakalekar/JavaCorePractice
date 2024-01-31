package practicedemo;

import java.util.Scanner;

public class Forloop {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter n:- ");
		n = sc.nextInt();
		do
		{
			System.out.println(n);
			//	n--;
			n = n /10;
		}while(n>0);
}
}
