package practicedemo2;

import java.util.Arrays;

public class Occurances {
	public static void main(String[] args) {
		String[] arr1= {"apple","banana","apple","orange","apple"};
		
		long count=Arrays.stream(arr1).filter(array->array.equals("apple")).count();
		System.out.println("The number of occurances of apple is:"+count);
	}
}
