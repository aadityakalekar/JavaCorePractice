package practicedemo1;

import practicedemo.Test;

public class Test1 extends Test{
	
	private static Test1 t1;
	public void show() {
		System.out.println("In show");
	}
	public static void main(String[] args) {
		Test1.t1= new Test1();
		t1.out();
		
	}
}
