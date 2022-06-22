package testSave;

public class Freeze {
	public void freeze(int n)
	{
		try {
			Thread.sleep(100 * n);
		}
		catch(Exception e)
		{
			
		}
	}
}
