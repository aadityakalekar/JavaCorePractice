package practicedemo;

public class Animal {
	public void eat() {
		System.out.println("Eating");
	}
	class Horse extends Animal{
		
	}
	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.eat();
		
		a.drink();
	}
	private void drink() {
		// TODO Auto-generated method stub
		System.out.println("Drinking");
	}
}

