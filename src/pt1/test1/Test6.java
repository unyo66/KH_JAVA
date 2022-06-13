package pt1.test1;
import java.util.Scanner;
public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double f;
		System.out.println("화씨 온도 : ");
		f = sc.nextDouble();
		System.out.printf("%.6f", (f - 32) * 5 / 9);
		sc.close();
	}

}
