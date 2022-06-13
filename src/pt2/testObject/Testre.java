package pt2.testObject;

public class Testre {

	public static void main(String[] args) {
		System.out.println(sum(100));
	}
	
	public static int sum(int n)
	{
		if (n == 0)
			return 0;
		
		return n += sum(n - 1);
	}

}
