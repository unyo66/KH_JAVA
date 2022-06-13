package pt1.edu;
import java.util.Scanner;
public class TestDupFor2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
		System.out.println("정수 입력(2~9)");
		int i = sc.nextInt();
		if(i == 99)
		{
			System.out.println("종료!");
			break;
		}
		for (int j = 1; j <= 9; j++)
			{
				System.out.print(i + " * " + j + " = " + i * j + " ");
			}
			System.out.print("\n\n");
		}
		sc.close();
	}

}
