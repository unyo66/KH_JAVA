package testSave;
import java.util.Scanner;
import java.io.IOException;

public class Run {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		LevelTxt txt = new LevelTxt();
		Level lv = new Level();
		
		lv.setLevel(txt.txtToLevel());

		System.out.println("현재 레벨은 " + lv.getLevel() + "입니다.");
		System.out.println("레벨에 변화가 있습니까? y / n");
		if (sc.next().equals("y"))
		{
			System.out.println("얼마나? + / -");
			lv.changeLevel(sc.nextInt());
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
