package pt1.test2;
import java.util.Scanner;

public class Test7 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String c = input("철수");
		String y = input("영희");
		whosWin(c,y);
		sc.close();
	}

	static String input(String str)
	{
		System.out.println(str + " : ");
		return sc.next();
	}
	
	static void whosWin(String c, String y)
	{
		char[] ccs = c.toCharArray();
		char[] cyh = y.toCharArray();
		
		if (ccs[0] == cyh[0])
			System.out.println("무승부!");
		else if (ccs[0] == 'r')
		{
			if (cyh[0] == 's')
				System.out.println("철수 승!");
			else
				System.out.println("영희 승!");
		}
		else if (ccs[0] == 's')
		{
			if (cyh[0] == 'p')
				System.out.println("철수 승!");
			else
				System.out.println("영희 승!");
		}
		else 
		{
			if (cyh[0] == 'r')
				System.out.println("철수 승!");
			else
				System.out.println("영희 승!");
		}
	}
}
