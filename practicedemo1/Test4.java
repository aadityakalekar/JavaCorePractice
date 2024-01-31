package practicedemo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {
	public static void main(String[] args) {
		List<Integer> list= List.of(2,4,6,7,8);
		int []numbers= {1,2,3,4,5,6,7,8,9,10};
		List<Integer> collect =list.stream().filter(i->i%2==0).collect(Collectors.toList());
		int sum=Arrays.stream(numbers).filter(n->n%2==0).sum();
		//Integer max=list.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println("The even numbers from given random mubers array:"+collect);
		System.out.println("The sum of even numbers from 1 to 10:"+sum);
		//System.out.println(max);
	}
}
