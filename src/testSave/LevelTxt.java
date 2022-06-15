package testSave;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LevelTxt {
		
	public int txtToLevel()
	{
		int ret = 0;
		try {
			File file = new File("C:\\Users\\user2\\gohun\\level.txt");
			Scanner sc = new Scanner(file);
			if(sc.hasNextLine())
			{
				ret += Integer.parseInt(sc.next());
			}
			sc.close();
		} catch (FileNotFoundException e)
		{
			
		}
		return ret;
	}
	
	public void levelToTxt() 
	{
		Level lv = new Level();
		
		try 
		{
		    OutputStream output = new FileOutputStream("C:\\Users\\user2\\gohun\\level.txt");
		    String str = String.valueOf(lv.getLevel());	    
		    byte[] by=str.getBytes();
		    output.write(by);
			output.close();	
		} 
		
		catch (Exception e)
		{
	            e.getStackTrace();
		}
	}

}
