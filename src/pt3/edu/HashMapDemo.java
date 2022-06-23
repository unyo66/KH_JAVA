package pt3.edu;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Apple");
		map.put(4, "Dandelion");
		map.put(3, "Corn");
		map.put(2, "BlackBerry");
		
		Iterator<Integer> iterKey = map.keySet().iterator();
		while(iterKey.hasNext())
		{
			int key = iterKey.next();
			System.out.println("key" + key + " : " + map.get(key));
		}
	}
}
