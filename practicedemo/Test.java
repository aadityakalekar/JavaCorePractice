package practicedemo;

public class Test {
	
	public void in() {
		System.out.println("IN");
	}
	protected void out() {
		System.out.println("OUT");
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.in();
		t.out();
	}
}
