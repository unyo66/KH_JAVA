package testSave;

import java.util.Scanner;

public class Donate {
	public void donate()
	{
		Scanner sc = new Scanner(System.in);
		Level lv = new Level();
		LevelTxt txt = new LevelTxt();
		System.out.println("얼마나 기부하시겠습니까?");
		int input1 = sc.nextInt();
		if (input1 >= lv.getLevel())
			System.out.println("레벨이 부족합니다.");
		else {
			lv.changeLevel(-sc.nextInt());
			txt.levelToTxt();
			double randomD = Math.random();
			if (randomD < 0.3)
				System.out.println("레벨 다운! 레벨 다운!");
			else if (randomD > 0.8)
				System.out.println("정말 감사합니다.");
			else
				System.out.println("꺼억");
		}
		sc.close();
	}

}
