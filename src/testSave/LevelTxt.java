package testSave;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LevelTxt {
	private static int level;
		
	public void txtToLevel()
	{
		int ret = 0;
		try {
			File file = new File("C:\\Users\\user2\\gohun\\KH_MAC\\level.txt");
			Scanner sc = new Scanner(file);
			if(sc.hasNextLine())
			{
				ret = Integer.parseInt(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e)
		{
			
		}
		LevelTxt.level = ret;
	}
	
	public void levelToTxt() 
	{
		
		try 
		{
		    OutputStream output = new FileOutputStream("C:\\Users\\user2\\gohun\\KH_MAC\\level.txt");
		    String str = String.valueOf(level);	    
		    byte[] by=str.getBytes();
		    output.write(by);
			output.close();	
		} 
		
		catch (Exception e)
		{
	            e.getStackTrace();
		}
	}
	
	public int getLevel()
	{
		return level;
	}
	
	public void changeLevel(int n)
	{
		level += n;
	}

}
