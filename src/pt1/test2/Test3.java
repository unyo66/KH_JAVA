package pt1.test2;
import java.util.Scanner;
public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, output;
		output = 0;
		
		do {
			System.out.println("양의 정수를 입력하세요 : ");
			input = sc.nextInt();
			if (input <= 0)
				break;
			else
				if (input % 2 == 0)
				output += input;			
		} while(true);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + output);
		

		
		sc.close();
	}

}
