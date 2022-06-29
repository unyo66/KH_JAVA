package testSave;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("뭐 할래? 사냥 / 기부 / 종료");
		input = sc.next();
		if (input.equals("종료")) 
		{
			System.out.println("-종료-");
		} 
		else 
		{
			if (input.equals("사냥")) {
				Hunt hunt = new Hunt();
				hunt.startHunt();
			} else if (input.equals("기부")) {

				Donate donate = new Donate();
				donate.donate();
			}
			try
			{
				main(args);
			}
			catch(Exception e)
			{
				System.out.println("에러");
			}
		}

	}

}
