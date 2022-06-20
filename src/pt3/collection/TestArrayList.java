package pt3.collection;
import java.util.*;

public class TestArrayList {
	private List<String> l = new ArrayList<String>();
	
	public void testAL()
	{
		l.add("Red");
		l.add("Orange");
		l.add(1, "Yellow");
		printList();
		System.out.println(l.toString());
		
		l.remove(2);
		printList();
		
		l.clear();
		System.out.println("List가 비었나요? " + l.isEmpty());
	}
	
	public void printList()
	{
		System.out.println(l);
	}
	
}
