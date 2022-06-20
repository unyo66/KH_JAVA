package testSave;

import java.util.ArrayList;
import java.util.*;

public class Mobs {
	
	String[][] mobInfo = {{"slime", "ork", "ironhog"}, {"10", "25", "150"}, {"1", "3", "5"}};
	
	public List<String> mobname = new ArrayList<String>();
	
	public int getLv(String mob)
	{
		for (int i = 0; i < mobInfo[0].length; i++)
		{
			if (mob.equals(mobInfo[0][i]))
			{
				return Integer.parseInt(mobInfo[1][i]);
			}
		}
		System.out.println("그런 몹x");
		return 0;
	}
	
	public int getXp(String mob)
	{
		for (int i = 0; i < mobInfo[0].length; i++)
		{
			if (mob.equals(mobInfo[0][i]))
			{
				return Integer.parseInt(mobInfo[2][i]);
			}
		}
		return 0;
	}
}



