package pt2.testCircle;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c = new Circle();
		System.out.println("반지름 : ");
		c.setRadius(sc.nextDouble());
		c.draw();
		System.out.println("\n한번 더? y/n");
		if (sc.next().equals("y"))
		{
			main(args);
		}
		else
			System.out.println("-종료-");
		sc.close();
	}

}
