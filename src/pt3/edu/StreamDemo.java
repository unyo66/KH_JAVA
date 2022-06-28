package pt3.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Random r = new Random();
		
		for (int i = 0; i < 10; i++)
		{
			list.add(r.nextInt(30));
		}
		
		List<Integer> gt10 = new ArrayList<>();
		for (int e : list)
		{
			if (e > 15)
			gt10.add(e);
		}
		
		Collections.sort(gt10);
		System.out.println(gt10);
		
		list.stream().filter(x -> x > 15).sorted().forEach(x -> System.out.print(x + " "));
	}

}
