package pt1.test1;
import java.util.Scanner;
public class Dimension {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;
		
		System.out.println("직사각형의 가로 길이를 입력하세요 : ");
		x = sc.nextDouble();
		System.out.println("직사각형의 세로 길이를 입력하세요 : ");
		y = sc.nextDouble();
		System.out.printf("직사각형의 넓이는 %.1f입니다.", x * y);
		
		sc.close();
	}

}
