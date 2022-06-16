package pt3.edu;

public class StringEx {

	static class Strings
	{
		public void testString()
		{
			String str = "Hello Java";
			String concat, upperCase, replace, substring;
			
			System.out.println("기본 String : " + str);
			System.out.println("기본 String 길이 : " + str.length());
			
			concat = str.concat(", Hi Java");//다른 내용을 붙인 새로운 메모리를 할당해 참조
			upperCase = concat.toUpperCase();
			replace = upperCase.replace('J', 'L');
			substring = replace.substring(3, 10);//4~9까지 꺼내옴
			
			System.out.println("Concat : " + concat);
			System.out.println("upper : " + upperCase);
			System.out.println("replace : " + replace);
			System.out.println("subString : " + substring);
			System.out.println(str.concat(str));
		}
	}
	
	public static void main(String[] args) {
		Strings str = new Strings();
		str.testString();
	}

}
