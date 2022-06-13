package pt1.test1;
import java.util.Scanner;
public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("정수 : ");
		input = sc.nextInt();
		
		if (input >= 1000)
			System.out.println("오류!");
		else
			System.out.printf("각 자릿수의 합 = %d", input / 100 + (input % 100) / 10 + input % 10);
		sc.close();
	}

}
