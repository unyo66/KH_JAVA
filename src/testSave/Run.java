package testSave;

import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("뭐 할래? 사냥 / 뭐시기 / 뭐시기");
		String input = sc.next();
		if (input.equals("안해")) 
		{
			System.out.println("종료");
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
			main(args);
		}

	}

}
