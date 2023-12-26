package day1;

public class ForEach_Loop 
{
	public static void main(String[] args) 
	{
		int nums [] = {5,7,8,9,4,13,8,5};
		
		/*for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}*/
		
		for(int n:nums) 
		{
			System.out.println(n);
		}
		
		String names [] = {"Sam","John","Raj","Jay","Priya"};
		for(String name:names)
		{
			if(name.equals("Raj") || name.equals("Jay"))
			{
				break;
				//continue;
			}
			System.out.println(name);
		}
		
	}
}
