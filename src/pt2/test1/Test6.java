package pt2.test1;
public class Test6 {

	public static void main(String[] args) {
		int[] input = {1, 2, 3, 4, 5, 6};
		for(int i = 0; i < input.length; i++)
			System.out.print(reverse(input)[i]);
	}
	
	public static int[] reverse(int[] org)
	{
		int[] ret = new int[org.length];
		
		for (int i = 0; i < org.length; i++)
		{
			ret[i] = org[org.length - i - 1];
		}
		
		return ret;
	}

}
