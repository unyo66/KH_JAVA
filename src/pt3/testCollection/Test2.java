package pt3.testCollection;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Test2 {
	public static void main(String[] args)
	{
		Set<Person> set = new HashSet<>();
		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));
		
		set.forEach(x -> System.out.println(x.toString()));

		Iterator<Person> iter = set.iterator();
		while (iter.hasNext())
		{
			System.out.print("Person[" + iter.next() + "] ");
		}
	}
}
