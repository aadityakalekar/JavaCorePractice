package practicedemo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@FunctionalInterface
interface Printable{
	void myPrint();
}

@FunctionalInterface
interface Printable1{
	void myPrint(String msg);
}

@FunctionalInterface
interface Printable2{
	void myPrint(int age,String msg);
}

class Message implements Printable{

	@Override
	public void myPrint() {
		// TODO Auto-generated method stub
		System.out.println("Using inheritance");
	}
	
}
public class Java8Features {
	public static void main(String[] args) {
		
		Message m=new Message();
		m.myPrint();
		Message m1=new Message();
		m1.myPrint();
		
		Printable p=new Printable() {
			@Override
			public void myPrint() {
				// TODO Auto-generated method stub
				System.out.println("By using anonymous inner class");
			}	
		};
		p.myPrint();
		
		Printable p1=new Printable() {
			
			@Override
			public void myPrint() {
				// TODO Auto-generated method stub
				System.out.println("By using anonymous inner class 2");
			}
		};
		p1.myPrint();
		
		//Lambda expression with zero parameter
		Printable p2=()-> {
			System.out.println("Lambda expression with zero parameter");
		};
		p2.myPrint();
		
		//Lambda expression with single parameter
		Printable1 p3=msg ->{
			System.out.println("Message is:"+msg);
		};
		p3.myPrint("It is lambda expression with single parameter");
		
		//Lambda expression with multi parameter
		Printable2 p4=(msg,age)->{
			System.out.println("Expression would be:"+msg+","+age);
		};
		p4.myPrint(2,"Hi");
		
		List<Integer> l= new ArrayList<Integer>(Arrays.asList(4,5,6,7,8));
		l.forEach(t->{System.out.println(t);});
	}
}
