package pt1.test1;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("정수를 입력하세요 : ");
		n = sc.nextInt();
		System.out.printf("%d의 제곱은 %d", n, n * n);
		sc.close();
	}

}
