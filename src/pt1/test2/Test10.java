package pt1.test2;
import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (isPrime(num))
			System.out.println(num + "��(��) �Ҽ��Դϴ�.");
		else
			System.out.println(num + "��(��) �Ҽ��� �ƴմϴ�.");
		sc.close();

	}
	static boolean isPrime(int n)
	{
		int i = 2;
		while (i < n)
		{
			if (n % i == 0)
				return (false);
			i++;
		}
		return (true);
	}

}
