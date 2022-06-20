package pt3.edu;
import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "of the people, by the people, for the people";
		
		StringTokenizer token = new StringTokenizer(str);
		
		System.out.println(token.countTokens());
		
		while (token.hasMoreTokens())
		{
			System.out.print("[" + token.nextToken() + "] ");
		}
		
		System.out.println();
		
		token = new StringTokenizer(str, ",");
		
		System.out.println(token.countTokens());
		
		while (token.hasMoreTokens())
		{
			System.out.print("[" + token.nextToken() + "] ");
		}
	}

}
