package pt1.test2;

public class Test4 {

	public static void main(String[] args) {
		String s = "*";
		int lines = 5;

		for (int i = 1; i <= lines; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				
				System.out.print(s);
			}
			System.out.print("\n");
		}
		for (int k = 1; k < (lines - 1); k++)
			System.out.print(" ");
	}

}
