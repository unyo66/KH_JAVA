package pt3.edu;

public class StringBufferEx
{
	public void testBuffer()
	{
		StringBuffer str1 = new StringBuffer();
		StringBuffer str2 = new StringBuffer(30);
		StringBuffer str3 = new StringBuffer("Java");
		
		str1.append("Hi");//버퍼 자체에 새로운 값 추가
		str2.append("Hello");
		str3.insert(2, " " + str2 + " ");//0번째 자리에 끼워넣기
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str1.append("Hi"));

	}
}