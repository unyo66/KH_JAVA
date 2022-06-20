package testSave;
public class Hunt {
	
	
	public int hunt(int userLv, String mob)
	{
		Mobs newmob = new Mobs();
		int mobLv = newmob.getLv(mob);
		double LvGap = (double)userLv / (double)mobLv;
		
		if (userLv >= mobLv)
		{
			return newmob.getXp(mob);
		}
		else
		{
			if (Math.random() < LvGap)
				return newmob.getXp(mob);
			else
				return -newmob.getXp(mob);
		}
	}
}
