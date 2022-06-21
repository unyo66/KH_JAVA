package testSave;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MobTxt {
	
	ArrayList<String> mobInfo = new ArrayList<String>();

	public MobTxt()
	{
		txtToMobInfo();
	}
	
	
	public void txtToMobInfo() {
		ArrayList<String> mobName = new ArrayList<String>();
		
		try {
			File file = new File("C:\\Users\\user2\\gohun\\KH_MAC\\mob.txt");

			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				mobName.add(sc.nextLine());
			}
		} catch (FileNotFoundException e) {

		}
		this.mobInfo = mobName;
	}
		
	public String getMobname(int n)
	{
		StringTokenizer st = new StringTokenizer(mobInfo.get(n));
		return st.nextToken();
	}
	
	public int getMobLv(int n)
	{
		StringTokenizer st = new StringTokenizer(mobInfo.get(n));
		st.nextToken();
		return Integer.parseInt(st.nextToken());
	}
	
	
	public int getMobXp(int n)
	{
		StringTokenizer st = new StringTokenizer(mobInfo.get(n));
		st.nextToken();
		st.nextToken();
		return Integer.parseInt(st.nextToken());
	}
	
	public int nameToLv(String name)
	{
		for (int i = 0; i < mobInfo.size(); i++)
		{
			if (this.getMobname(i).equals(name))
			{
				return getMobLv(i);
			}
		}
		return 0;
	}
	
	public int nameToXp(String name)
	{
		for (int i = 0; i < mobInfo.size(); i++)
		{
			if (this.getMobname(i).equals(name))
			{
				return getMobXp(i);
			}
		}
		return 0;
	}
	
		public void hasContent()
	{
		
		try {
			File file = new File("C:\\Users\\user2\\gohun\\KH_MAC\\mob.txt");

			Scanner sc = new Scanner(file);
			System.out.println(sc.hasNextLine());
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
		}
		
	}

}
