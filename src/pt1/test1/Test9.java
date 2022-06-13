package pt1.test1;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int j, k, i;
		System.out.println("전공 이수 학점 : ");
		j = sc.nextInt();
		System.out.println("교양 이수 학점 : ");
		k = sc.nextInt();
		System.out.println("일반 이수 학점 : ");
		i = sc.nextInt();

		if (j >= 70)
		{
			if (k + i >= 80)
				System.out.println("졸업 가능");
			else if (k >= 30 && i >= 30)
				System.out.println("졸업 가능");
			else
				System.out.println("졸업 불가");
		}
		else 
			System.out.println("졸업 불가");
		
		sc.close();
	}

}
