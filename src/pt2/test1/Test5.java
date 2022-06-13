package pt2.test1;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		int[] input = new int[10];
		int[] stars = new int[10];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 10개 입력하세요 : ");
		
		for(int i = 0; i < input.length; i++)
		{
			input[i] = sc.nextInt();
		}
		
		for(int i = 0; i < input.length; i++)
		{
			if(input[i] >= 0)
				stars[input[i] / 10]++;
		}
		
		for(int i = 0; i < input.length; i++)
		{
			if(i == 0)
				System.out.print(" 0 ~ 9 : ");
			else
				System.out.printf("\n%d0 ~ %d9 : ", i, i);
			for (int j = 0; j < stars[i]; j++)
			{
				System.out.print("*");
			}
		}
		sc.close();
	}

}
