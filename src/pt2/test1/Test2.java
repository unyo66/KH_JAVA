package pt2.test1;

public class Test2 {

	public static void main(String[] args) {
		System.out.println(sumExcepFirst(1, 2, 3, 4));
		int arr[] = {2, 3};
		System.out.println(sumExcepFirst(1, arr));
		System.out.println(sumExcepFirst(1, 2, 3, 4, 5));

	}

	static int sumExcepFirst(int n, int ... intArr)
	{
		int ret = 0;
		
		for(int i = 0; i < intArr.length; i++)
		{
			ret += intArr[i];
		}
		return ret;
	}

}
