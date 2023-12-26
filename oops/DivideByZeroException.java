package day2.oops;

//public class DivideByZeroException extends Exception  //Checked Exception
//public class DivideByZeroException extends RuntimeExcetion  //Un-Checked Exception
public class DivideByZeroException extends Exception
{
	public DivideByZeroException() {
		super();
	}
	public DivideByZeroException(String msg) {
		super(msg);
	}
}
