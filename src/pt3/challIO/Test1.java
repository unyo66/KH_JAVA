package pt3.challIO;
import java.io.*;

public class Test1 {

	public static void main(String[] args) {
		String file = "C:\\Users\\user2\\Desktop\\file.txt";
		
		try
		{
			byte[] buf = new byte[1024];
			FileInputStream fis = new FileInputStream(file); 
			FileInputStream fis1 = new FileInputStream(file); 
			BufferedInputStream bis = new BufferedInputStream(fis1, 1);
			int read;
			while((read = fis.read()) != -1)
			{
				System.out.print((char)read);
			}
			System.out.println();
			
			
			while(bis.read(buf) != -1)
			{
				System.out.print(new String(buf));
			}
//			read = bis.read(buf);
//			String strBuf = new String(buf, 0, read);
//			System.out.println(strBuf);
			
			fis.close();
			bis.close();
		}catch(Exception e)
		{
			System.out.println("파일 열 수 없음");
			System.out.println(e.getMessage());
		}
	}

}
