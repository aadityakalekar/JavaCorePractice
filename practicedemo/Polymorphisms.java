package practicedemo;

class Vehicles{
	Number run() {
		System.out.println("Vehicle is running");
		return 0;
	}
}
class Car extends Vehicles{
	public Number run() {
		System.out.println("Car is running");
		return 0;
	}	
}
class Bike extends Vehicles{
	Float run() {
		System.out.println("Bike is running");
		return null;
	}
}
public class Polymorphisms {
	public static void main(String[] args) {
		//Vehicles v=new Vehicles();
		//v.run();
		
		//Vehicles v=null;
		Vehicles v=new Car();
		//v= new Car();
		v.run();
		
		Vehicles v1=new Bike();
		v1.run();
		
	}
}
