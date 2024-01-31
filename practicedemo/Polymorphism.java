package practicedemo;

class MethodOverloading{
	public void add(int a, int b) {
		System.out.println("Two integers with same parameters");
	}
	public void add(int a, int b, int c) {
		System.out.println("3 integers with same parameters");
	}
	public void add(int a, float n) {
		System.out.println("diff parameters");
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		MethodOverloading mo=new MethodOverloading();
				mo.add(1, 2);
				mo.add(2, 3, 4);
				mo.add(2, 2f);
	}
}
