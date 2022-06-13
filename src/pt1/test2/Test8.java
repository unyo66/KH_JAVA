package pt1.test2;
import java.util.Scanner;
public class Test8 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));
		sc.close();
	}

	static int factorial(int n)
	{
		return switch(n)
		{
		case 0, 1 -> 1;
		default -> factorial(n - 1) * n;
		};
	}
}
