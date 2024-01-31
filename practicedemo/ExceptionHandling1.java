package practicedemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
	public void readFromFile() throws FileNotFoundException{
		FileInputStream fin=new FileInputStream("file.text");
	}
	public void m1() throws FileNotFoundException{
		readFromFile();
		System.out.println("It will read from above method");
	}
	public void m2() throws FileNotFoundException{
		m1();
		System.out.println("IT will read from above method");
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		ExceptionHandling1 eh=new ExceptionHandling1();
		eh.m2();
		System.out.println("Code is executed");
	}
}
