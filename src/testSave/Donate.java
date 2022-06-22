package testSave;

import java.util.Scanner;

public class Donate {
		public void donate()
	{
		Scanner sc = new Scanner(System.in);
		LevelTxt txt = new LevelTxt();
		txt.txtToLevel();
		System.out.println("현재 레벨은 " + txt.getLevel() + "입니다. 얼마나 기부하시겠습니까?");
		int input1 = sc.nextInt();
		if (input1 >= txt.getLevel())
			System.out.println("레벨이 부족합니다.");
		else {
			txt.changeLevel(-input1);
			txt.levelToTxt();
			double randomD = Math.random();
			if (randomD < 0.3)
				System.out.println("레벨 다운! 레벨 다운!");
			else if (randomD > 0.8)
				System.out.println("정말 감사합니다.");
			else
				System.out.println("꺼억");
			new Freeze().freeze(8);
			System.out.println("현재 레벨은 " + txt.getLevel() + "입니다.");
		}
	}

}
