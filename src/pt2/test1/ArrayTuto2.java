package pt2.test1;

import java.util.Scanner;

public class ArrayTuto2 {

	public static void main(String[] args) {
		int numOfStudents = 0;
		int[] scores;
		Scanner sc = new Scanner(System.in);

		System.out.println("학생 수 : ");
		numOfStudents = sc.nextInt();
		scores = new int[numOfStudents];

		System.out.println(numOfStudents + "명의 학생 성적을 입력하세요 : ");
		for (int i = 0; i < numOfStudents; i++) {
			scores[i] = sc.nextInt();
		}
		
		System.out.println(numOfStudents + "명의 학생 성적은 다음과 같습니다 : ");
		for (int n : scores) {
			System.out.print(n + " ");
		
		}
		System.out.println("");
		for(int i = 1; i <= numOfStudents; i++)
		{
			if(scores[i - 1] >= 90)
				System.out.println(i + "번 학생의 등급은 A입니다.");
			else if(scores[i - 1] >= 80)
				System.out.println(i + "번 학생의 등급은 B입니다.");
			else if(scores[i - 1] >= 70)
				System.out.println(i + "번 학생의 등급은 C입니다.");
			else
				System.out.println(i + "번 학생의 등급은 F입니다.");

		}
		sc.close();
	}
}