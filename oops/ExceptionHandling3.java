package day2.oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling3 
{
	public void  readFromFile() throws FileNotFoundException
	{
		FileInputStream fin = new FileInputStream("abc.txt");
	}

	public void m1() throws FileNotFoundException
	{
		readFromFile();
	}
	public void m2() throws FileNotFoundException 
	{
		m1();
		
	}
	
	public static void main(String[] args) throws FileNotFoundException 
	{
		ExceptionHandling3 obj = new ExceptionHandling3();
		obj.m2();
		System.out.println("Code is Executed.");
	}
}
