package practicedemo;

class Employee{
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
public class Encapsulation {
	public static void main(String[] args) {
		Employee e=new Employee(1,"Aditya");
		System.out.println("EmpId: " + e.getEmpId() + ", EmpName: " + e.getEmpName());

		//e.setEmpId(2);
		//System.out.println(e.getEmpId());
	}
}
