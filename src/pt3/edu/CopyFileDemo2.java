package pt3.edu;
import java.io.*;
import java.util.Scanner;

public class CopyFileDemo2 {
	static String input = "C:\\Users\\user2\\Desktop\\goodbye.txt";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("new file name : ");
		imgCopy(sc.next());
		sc.close();
	}
	
	public static void imgCopy(String name)
	{
		String output = "C:\\Users\\user2\\Desktop\\" + name + ".txt";
		try(FileInputStream fis = new FileInputStream(input); 
				FileOutputStream fos = new FileOutputStream(output)) {
			int c;
			
			while ((c = fis.read()) != -1)
				fos.write(c);
			Thread.sleep(500);
			System.out.println("done");
			
		} catch (Exception e) {
		}
	}

}
