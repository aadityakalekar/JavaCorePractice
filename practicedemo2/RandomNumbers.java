package practicedemo2;

import java.util.Random;

public class RandomNumbers {
	public static void main(String[] args) {
		Random num= new Random();
		num.ints(1,100).limit(10).sorted().forEach(System.out::println);
	}
}
