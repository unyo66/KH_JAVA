package pt1.test1;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, h, m, s;
		System.out.println("초 단위 정수를 입력하세요 : ");
		x = sc.nextInt();
		h = x / 3600;
		m = (x - h * 60) / 60;
		s = x - h * 3600 - m * 60;
		System.out.printf("%d시간 %d분 %d초", h, m, s);
		sc.close();
	}

}
