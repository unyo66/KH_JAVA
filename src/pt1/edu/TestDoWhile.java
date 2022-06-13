package pt1.edu;

import java.util.Scanner;

public class TestDoWhile {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int value = 0, sum = 0;
		
		do
		{
			System.out.println("정수 숫자를 입력하세요 (종료는 :99) : ");
			value = sc.nextInt();
			sum += value;
		}
		while (value != 99);
		System.out.println("입력된 정수 값들의 합계 : " + sum);
		System.out.println("프로그램 종료");
		sc.close();
	}

}
