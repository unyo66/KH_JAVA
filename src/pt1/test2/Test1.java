package pt1.test2;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("정수 : ");
		input = sc.nextInt();
		
		if (input >= 19)
			System.out.println("성년");
		else
			System.out.println("미성년");
		sc.close();
	}

}
