package pt1.test1;
import java.util.Scanner;

public class HolZzak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("정수를 입력하세요 : ");
		n = sc.nextInt();
		if (n % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
		sc.close();
	}

}
