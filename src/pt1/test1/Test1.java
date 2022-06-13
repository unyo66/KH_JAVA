package pt1.test1;

public class Test1 {

	public static void main(String[] args) {
		String s = "*";
		int lines = 6;

		for (int i = 1; i <= lines; i++)
		{
			for (int k = 1; k <= (lines - i); k++)
				System.out.print(" ");
			for (int j = 1; j <= ((2 * i) - 1); j++)
			{
				
				System.out.print(s);
			}
			System.out.print("\n");
		}
		for (int k = 1; k < (lines - 1); k++)
			System.out.print(" ");
	}

}
