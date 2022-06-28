package pt3.testGeneric;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Test3 {

	public static void main(String[] args) {
		String s = "of the people, by the people, for the people";
		try
		{
			showTokens(s, ", ");
		}
		catch(NoSuchElementException e)
		{
			System.out.println("끝");
		}
		
		
	}
	
	public static void showTokens(String s, String t)
	{
		StringTokenizer st = new StringTokenizer(s, t);
		while (true)
		{
			System.out.println(st.nextToken());
		}
	}

}
