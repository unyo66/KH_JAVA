package pt2.challAbstract.test;
import pt2.challAbstract.samples.*;

public class CountableTest {

	public static void main(String[] args) {
		int birds = 0, trees = 0;
		
		Countable[] m = {new Bird("뻐꾸기"), (new Bird("비둘기")), (new Tree("수선화")), (new Tree("플라타너스")), (new Tree("은행나무"))};
		
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] instanceof Bird) 
			{
				birds++;
			}
			else
				trees++;
		}
				
		for (Countable e : m)
		{
			e.count();
		}
		
		for (int i = 0; i < m.length; i++)
		{
			if (m[i] instanceof Bird) 
			{
				((Bird) m[i]).fly(birds);
			}
			else
				((Tree) m[i]).ripen(trees);
		}
	}

}
