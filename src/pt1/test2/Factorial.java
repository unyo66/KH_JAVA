package pt1.test2;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, output;
		System.out.println("팩토리얼 값을 구할 정수 : ");
		input = sc.nextInt();
		
		output = 1;
		while (input != 0)
		{
			output *= input;
			input --;
		}
		System.out.println(output);
		sc.close();
	}

}
