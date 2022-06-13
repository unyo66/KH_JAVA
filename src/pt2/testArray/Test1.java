package pt2.testArray;

public class Test1 {

	public static void main(String[] args) {
		
		System.out.println(countChar("jazz", 'z'));
	}
	static int countChar(String s, char c)
	{
		int len;
		int ret;
		
		len = s.length();
		char[] cArray = new char[len];
		
		for(int i = 0; i < len; i++)
		{
			cArray[i] = s.charAt(i);
		}
		
		ret = 0;
		for(int i = 0; i < len; i++)
		{
			if(cArray[i] == c)
				ret++;
		}
		return ret;
	}

}
