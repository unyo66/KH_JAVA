package pt1.test1;
import java.util.Scanner;
public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("소문자 하나 입력 : ");
		char[] input = sc.next().toCharArray();
		input[0] -= 32;
		System.out.printf("%c", input[0]);
		sc.close();
	}

}
