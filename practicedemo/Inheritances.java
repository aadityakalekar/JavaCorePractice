package practicedemo;

interface Calculator0{
	void square(int a);
	}
	interface Calculator extends Calculator0{
		void calculate(int a, int b);
		void calculate(int a);
	}
	class Calc{}
	
	class BasicCalc extends Calc implements Calculator{

		@Override
		public void square(int a) {
			// TODO Auto-generated method stub
			//System.out.println("Square is:"+(a*a));
		}

		@Override
		public void calculate(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println("Addition is:"+(a+b));
		}

		@Override
		public void calculate(int a) {
			// TODO Auto-generated method stub
			System.out.println("Square is:"+(a*a));
		}}
	
	public class Inheritances{
	public static void main(String[] args) {
		BasicCalc bc=new BasicCalc();
		bc.calculate(4, 2);
		bc.calculate(4);
		
	}
}