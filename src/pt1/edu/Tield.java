package pt1.edu;

import java.util.Scanner;
public class Tield
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int tens = 1;
		int cnt = 32;
		for (int i = 0; i < 16; i++)
		{
			if (Integer.parseInt(Integer.toBinaryString(input)) / tens != 0)
			{
				cnt -= 1;
				tens *= 10;
			}
		}

		System.out.println("변환 전 10진수 : " + input);
		System.out.print("변환 전 2진수 : ");
		for (int i = 0; i < cnt; i++)
		{
			System.out.print('0');
		}
		System.out.println(Integer.toBinaryString(input));
		int changed = ~input;
		System.out.println("변환 후 10진수 : " + changed);
		System.out.println("변환 후 2진수 : " + Integer.toBinaryString(changed));
		sc.close();
	}
}
