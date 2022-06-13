package pt1.test2;

public class Test5 {

	public static void main(String[] args) {
		int a = 20;
		int b = 20;
		int c = 20;
		
		while (c > 0)
		{
			b = 20;
			while (b > 0)
			{
				a = 20;
				while (a > 0)
				{
					if (a * a + b * b == c * c)
						System.out.println("a : " + a + " | b : " + b + " | c : " + c);
					a--;
				}
				b--;
			}
			c--;
		}
	}

}
