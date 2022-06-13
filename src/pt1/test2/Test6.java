package pt1.test2;
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cs;
		String yh;
		char[] ccs = new char[1];
		char[] cyh = new char[1];
		
		System.out.println("철수 : ");
		cs = sc.next();
		System.out.println("영희 : ");
		yh = sc.next();
		
		ccs = cs.toCharArray();
		cyh = yh.toCharArray();
		
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
		
		
		sc.close();
	}

}
