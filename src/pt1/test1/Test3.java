package pt1.test1;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("원기둥의 밑면 반지름은? ");
		x = sc.nextInt();
		System.out.println("원기둥의 높이는? ");
		y = sc.nextInt();
		System.out.printf("원기둥의 부피는 %.1f", x * x * 3.14 * y);
		sc.close();
	}

}
