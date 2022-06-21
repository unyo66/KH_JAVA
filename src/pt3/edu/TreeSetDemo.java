package pt3.edu;
import java.util.TreeSet;

class TestTreeSet
{
	public void testTreeSet()
	{
		TreeSet<String> tset = new TreeSet<String>();
		
		tset.add("3. Mybatis");
		tset.add("1. Java");
		tset.add("5. HTML5");
		tset.add("4. Oracle");
		tset.add("2. JDBC");
		
		for (String text : tset) //번호 순서대로 정렬됨
		{
			System.out.println(text);
		}
	}
}

public class TreeSetDemo {

	public static void main(String[] args) {
		new TestTreeSet().testTreeSet();
	}
}
