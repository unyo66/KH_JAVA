package testSave;
import java.util.Scanner;
import java.io.IOException;

public class Run {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		LevelTxt txt = new LevelTxt();
		Level lv = new Level();
		Hunt hunt = new Hunt();
		Mobs mobs = new Mobs();
		
		lv.setLevel(txt.txtToLevel());

		System.out.println("현재 레벨은 " + lv.getLevel() + "입니다.");
		System.out.println("사냥을 나서겠습니까? y / n");
		if (sc.next().equals("y"))
		{
			for (int i = 0; i < mobs.mobInfo[0].length; i++)
			{
				System.out.print(mobs.mobInfo[0][i] + "[lv" + mobs.mobInfo[1][i] + "] ");
			}
			String target = sc.next();
			int result = hunt.hunt(lv.getLevel(), target);
			
			//사냥중...
			if (result > 0)
			{
				System.out.println("사냥에 성공했습니다! 레벨이 " + result + " 올랐습니다.");
			}
			else
				System.out.println("사냥에 실패했습니다!");
			lv.changeLevel(result);
			txt.levelToTxt();
			main(args);
		}
		else
		{
			txt.levelToTxt();
			System.out.println("종료");
		}
		sc.close();
	}

}
