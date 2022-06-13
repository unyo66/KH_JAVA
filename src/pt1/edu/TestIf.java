package pt1.edu;

import java.util.Scanner;

public class TestIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 : ");
		int score = sc.nextInt();
		String grade = "";
		
		if (score >= 90)
		{
			grade = "A";
			if (score >= 98)
				grade += "+";
		}
		else if (score >= 80)
		{
			grade = "B";
			if (score >= 88)
				grade += "+";
		}
		else if (score >= 70)
		{
			grade = "C";
			if (score >= 78)
				grade += "+";
		}
		else
			grade = "F";
		System.out.println("점수 : " + score + ", 학점 : " + grade);
		sc.close();
	}

}
