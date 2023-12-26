package day1.oops;

class Account
{
	//State --> instance Variable. 
	double balance_amt=3000;
	
	//state --> static  variable 
	static String bankName="ABC Bank...";
	
	//behaviours -->instance methods
	public void widthdraw(double amt) 
	{
		balance_amt -= amt;
		System.out.println("Rs."+amt+"Widthdraw Succesfully...");
	}
	public void deposite(double amt) 
	{
		balance_amt += amt;
		System.out.println("Rs."+amt+"Deposite Succesfully...");
	}
	public void display_balance()
	{
		System.out.println("Balance :- "+balance_amt);
	}
	public static void  termsAndConditions()
	{
		System.out.println("List of all terms And Conditions");
	}
	
}

public class Class_Object 
{
	public static void main(String[] args)
	{
		System.out.println("Main_Class");
		
		//Create an Object of Account 
		Account obj1 =  new Account(); 
 
		//System.out.println(obj1.bankName);
		System.out.println(Account.bankName);
		obj1.display_balance();
		obj1.widthdraw(1000);
		obj1.display_balance();
		obj1.deposite(1234);
		obj1.display_balance();
		System.out.println("Account...2");
		Account obj2 =  new Account();  
		System.out.println(obj1.bankName);
		obj2.display_balance();
		obj2.widthdraw(1500);
		obj2.display_balance();
		obj2.deposite(2234);
		obj2.display_balance();
		
		//obj1.bankName="R.J Bank";
		Account.bankName = "R.J Bank...";
		System.out.println(obj1.bankName);
		System.out.println(obj2.bankName);
		
		obj1.termsAndConditions();
		
		Account.termsAndConditions();
	}
}
