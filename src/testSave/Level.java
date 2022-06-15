package testSave;

public class Level {
	private static int level;
	
	public Level()
	{
		
	}
	
	public void setLevel(int n)
	{
		level = n;
	}
	public void changeLevel(int n)
	{
		level += n;
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public void printLevel()
	{
		System.out.println(level);
	}

}
