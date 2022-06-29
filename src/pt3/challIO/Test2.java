package pt3.challIO;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test2 {

	public static void main(String[] args) {
		String file = "C:\\Users\\user2\\Desktop\\file.txt";
		Path path = Paths.get("C:\\Users\\user2\\Desktop\\file.txt");
		
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String read1;
			System.out.println("[Read with BufferdReader]");
			while ((read1 = br.readLine()) != null)
			{
				System.out.println(read1);
			}
			br.close();
			
			
			System.out.println("\n[Read with File.lines]");
			Files.lines(path).forEach(x -> System.out.println(x));
		} catch (Exception e) {
			System.out.println("에러");
			System.out.println(e.getMessage());
		}
		
	}

}
