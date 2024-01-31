package practicedemo1;

class Base{
	public void print() {
		System.out.println("Base");
	}
}
class Derived extends Base {
	public void print() {
		System.out.println("Derived");
	}
}
public class Printer {
	public static void DoPrint(Base o) {
		o.print();
	}
	public static void main(String[] args) {
		Base b= new Base();
		Base b1= new Derived();
		Derived d= new Derived();
		DoPrint(b);
		DoPrint(b1);
		DoPrint(d);
	}
}
