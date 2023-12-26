package day2.oops;
// Student is-a Person
// Employee is-a Person
//Car is-a Person.--> X
//Vehicle is-a Car.--> X
//Car is-a Vehicle.--> -/
class Person {
	protected String fname;
	protected String lname;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

}

class Student extends Person {
	private int rollNo;

	public Student() {
	}

	public Student(String fname, String lname, int rollNo) {
		super(fname, lname);
		this.rollNo = rollNo;
	}

	public void display() {
		System.out.println("Roll No:- " + this.rollNo);
		System.out.println("First Name:- " + super.fname);
		System.out.println("Last Name:- " + super.lname);
	}
}

class Employee extends Person {
	//logic....
	protected String email;
	
	public Employee(){
		super();
	}
	
	public Employee(String efname, String elname, String email){
			super();
			this.efname=efname;
			this.elname=elname;
			this.email=email;
	}
	
}

class ExternalEmployee extends Employee{
	private int id;
	
	public ExternalEmployee(){}
	
	public ExternalEmployee(String efname, String elname, String email, int id){
		super(efname,elname,email);
		this.id=id;
		
	}
	public void display1(){
		System.out.println("Emp ID:"+super.id);
		System.out.println("First name:"+super.fname);
		System.out.println("Last name:"+super.lname);
		System.out.println("Email:"+super.email);
		
	}
}

public class Inheritance {
	public static void main(String[] args) 
	{
		Student s1 = new Student("Raj", "Sharma", 121);
		s1.display();
		
		Student s2 = new Student();
		s2.display();
		
		Employee e=new Employee("A", "B", "a@gmail.com",1);
		e.display1();

	}
}

/*Supported 
 * 	1.Single (single parent and child classes 
 *  2.Multilevel   (Child class having one more child
 *  3.Hierarchical (Single Parent class having 2 or more child.
 * Not Supported 
 *  4.Multiple (Multiple parents having single child.)
 *  5.Hybrid
 * */
 */