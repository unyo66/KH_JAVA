package pt3.edu;

public class TestException {

	public static void main(String[] args) {
		int[] arr = new int[3];
		try
		{
			for (int i = 0; i < arr.length; i++)
				arr[i] = i;
			for (int i = 0; i <= arr.length; i++)
				System.out.println(arr[i]);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
