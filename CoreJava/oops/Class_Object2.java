package day1.oops;

class Account2
{
	//State --> instance Variable. 
	int account_number;
	String account_Holder_Name;
	double balance_amt;
	//state --> static  variable 
	static String bankName="ABC Bank...";

	public Account2() 
	{
		System.out.println("Default (Non-Parameterized) Constructor is invoked.");
		this.account_number = 10101;
		this.account_Holder_Name="Anonymous Customer";
		this.balance_amt=1000;
	}
	public Account2(int account_number,String account_Holder_Name,double balance_amt) 
	{
		System.out.println("Parameterized Constructor is invoked.");
		this.account_number = account_number;
		this.account_Holder_Name = account_Holder_Name;
		this.balance_amt = balance_amt;
	}
	public void accountInfo()
	{
		System.out.println("Account Number      :- "+this.account_number);
		System.out.println("Account Holder Name :- "+this.account_Holder_Name);
	}
	public void displayBalance()
	{
		System.out.println("Balance :- "+balance_amt);
	}
}

public class Class_Object2 
{
	public static void main(String[] args) 
	{
		Account2.bankName = "R J Bank";
		System.out.println(Account2.bankName);
		
		Account2 obj1 = new Account2();
		obj1.accountInfo();
		obj1.displayBalance();
		
		Account2 obj2 = new Account2(101, "Jay Patel", 5000);
		obj2.accountInfo();
		obj2.displayBalance();
	}
}
