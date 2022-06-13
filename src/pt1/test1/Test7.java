package pt1.test1;
import java.util.Scanner;
public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("정수 : ");
		input = sc.nextInt();
		if (input % 4 == 0 && input % 5 == 0)
			System.out.println("1 : true");
		else if (input % 4 == 0 || input % 5 == 0)
			System.out.println("2 : true");
		else
			System.out.println("3 : true");
		sc.close();
	}

}
