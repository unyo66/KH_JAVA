package pt1.edu;

import java.util.Scanner;

public class TestSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("점수 : ");
		int score = sc.nextInt();
		char grade = ' ';
		if (score > 100 || score < 0) {
			System.out.println("그런 점수는 없다.");
		} else {
			switch (score / 10) {
			case 10:

			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			default:
				grade = 'F';
			}

			System.out.println("점수 : " + score + ", 학점 : " + grade);
			sc.close();
		}
	}

}
