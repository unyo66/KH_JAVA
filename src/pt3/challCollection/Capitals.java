package pt3.challCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Capitals {
	public static void main(String[] args)
	{
		List<String> cp = new ArrayList<>();
		cp.add("서울");
		cp.add("워싱턴");
		cp.add("베이징");
		cp.add("마드리드");
		cp.add("파리");
		
		for (String e : cp)
		{
			System.out.print(e + " ");
		}
		System.out.println();
		
		cp.add("런던");
		
		Iterator<String> iterator = cp.iterator();
		while (iterator.hasNext())
		{
			System.out.print(iterator.next() + " ");
		}
		System.out.println();

		cp.removeIf(e -> e.length() >= 3);
		
		for (String e : cp)
		{
			System.out.print(e + " ");
		}
	}
}
