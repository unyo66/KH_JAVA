package pt3.testCollection;
import java.util.Scanner;
import java.util.ArrayList;

public class Test5 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> stu = new ArrayList<>();
		int input;
		do
		{
			System.out.print("점수가? ");
			input = sc.nextInt();
			stu.add(input);
		}		
		while (input >= 0);
		
		int max = stu.get(0);
		for (int e : stu)
		{
			if (e > max)
				max = e;
		}
		
		System.out.println("전체 학생은 " + (stu.size() - 1) + "명이다.");
		
		System.out.print("학생들의 성적 : ");
		stu.forEach(x -> {if (x >= 0)System.out.print(x + " ");});
	
		System.out.println();
		
		for (int i = 0; i < stu.size() - 1; i++)
		{
			System.out.print(i + "번째 학생의 점수는 " + stu.get(i));
			if ((max - stu.get(i)) > 20)
				System.out.println("등급은 C이다.");
			else if((max - stu.get(i)) > 10)
				System.out.println("등급은 B이다.");
			else
				System.out.println("등급은 A이다.");
			
		}
		sc.close();
	}
}
