package testSave;

import java.util.Scanner;

public class Hunt {
	
	static void freeze()
	{
		try {
			Thread.sleep(700);
		}
		catch(Exception e)
		{
			
		}
	}
	public void startHunt()
	{

		Scanner sc = new Scanner(System.in);
		LevelTxt txt = new LevelTxt();
		Level lv = new Level();
		Hunt hunt = new Hunt();
		MobTxt mobs = new MobTxt();
		
		lv.setLevel(txt.txtToLevel());

		System.out.println("현재 레벨은 " + lv.getLevel() + "입니다.");
		System.out.println("사냥을 나서겠습니까? y / n");
		String input = sc.next();
		if (input.equals("y"))
		{
			for (int i = 0; i < mobs.mobInfo.size(); i++)
			{
				if (lv.getLevel() >= mobs.getMobLv(i) / 2 && lv.getLevel() <= mobs.getMobLv(i) * 1.5)
				System.out.print(mobs.getMobname(i) + "[lv" + mobs.getMobLv(i) + "] ");
			}
			String target = sc.next();
			int result = hunt.hunting(lv.getLevel(), target);
			
			//사냥중...
			
			if (result > 0)
			{
				System.out.println("사냥 중...");
				freeze();
				System.out.println("사냥에 성공했습니다! 레벨이 " + result + " 올랐습니다.");
			}
			else if (result < 0)
			{
				System.out.println("사냥 중...");
				freeze();
				System.out.println("사냥에 실패해 레벨이 " + (-result) + "만큼 떨어졌습니다.");
			}
			else
				System.out.println("그런 몬스터는 없습니다.");
			
			lv.changeLevel(result);
			txt.levelToTxt();
			
			freeze();
			
			this.startHunt();
		}
		else
		{
			txt.levelToTxt();
			System.out.println("사냥을 마쳤습니다.");
		}
	}


	
	
	public int hunting(int userLv, String mob)
	{
		MobTxt newmob = new MobTxt();
		int mobLv = newmob.nameToLv(mob);
		double LvGap = (double)userLv / (double)mobLv;
		
		if (userLv >= mobLv)
		{
			return newmob.nameToXp(mob);
		}
		else if (userLv < mobLv)
		{
			if (Math.random() < LvGap)
				return newmob.nameToXp(mob);
			else
				return -(newmob.nameToXp(mob) / 2);
		}
		else
			return 0;
	}
}
