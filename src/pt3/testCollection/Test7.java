package pt3.testCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Test7 {
	public static void main(String[] args)
	{
		String[] s1 = {"a", "b", "a", "b", "c"};
		String[] s2 = {"c"};
		
		HashSet <String> h1 = new HashSet<>(Arrays.asList(s1));
		HashSet <String> h2 = new HashSet<>(Arrays.asList(s2));
		System.out.println("set1 : " + h1);
		System.out.println("set2 : " + h2);
		System.out.println("set1과 set2는 같다 : " + h1.equals(h2));
		h1.addAll(h2);
		System.out.println("합집합 : " + h1);
		h1.retainAll(h2);
		System.out.println("교집합 : " + h1);
		System.out.println("set1과 set2는 같다 : " + h1.equals(h2));
		
		System.out.println();
		
		Collection<String> c1 = new HashSet<>();
		Collection<String> c2 = new HashSet<>();
		Collections.addAll(c1, s1);
		Collections.addAll(c2, s2);
		System.out.println("set1 : " + c1);
		System.out.println("set2 : " + c2);
		System.out.println("set1과 set2는 같다 : " + c1.equals(c2));
		c1.addAll(c2);
		System.out.println("합집합 : " + c1);
		c1.retainAll(c2);
		System.out.println("교집합 : " + c1);
		System.out.println("set1과 set2는 같다 : " + c1.equals(c2));
		
	}
}
