package day3.collection;

import java.util.function.Consumer;

public class ListConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer t) 
	{
		System.out.println(t);
	}
	
}

