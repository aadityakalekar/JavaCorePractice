package day2.oops;

// public,protected, default/package, private 
class Employee
{
	private int empId;
	private String empName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
}

public class Encapsulation
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(101,"Raj");
		System.out.println(e1.getEmpId());
		e1.setEmpId(103);
		System.out.println(e1.getEmpId());
		//System.out.println(e1.empId);
	}
}
