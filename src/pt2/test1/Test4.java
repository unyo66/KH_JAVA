package pt2.test1;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("URL을 입력하세요 : ");
		String url = sc.next();
		
		char[] cArray = new char[url.length()];
		
		for(int i = 0; i < url.length(); i++)
		{
			cArray[i] = url.charAt(i);
		}
		
		if (cArray[0] == 'b' && cArray[1] == 'y' && cArray[2] == 'e')
		{
			System.out.println("프로그램 종료");
		}
		
		if (cArray[url.length() - 3] == 'c' && cArray[url.length() - 2] == 'o' && cArray[url.length() - 1] == 'm')
		{
			System.out.println(url + "은 \'com\'으로 끝납니다");
		}
		
		for(int i = 0; i < url.length(); i++)
		{
			if(cArray[i] == 'j')
			{
				if(cArray[i + 1] == 'a')
				{
					if(cArray[i + 2] == 'v')
					{
						if(cArray[i + 3] == 'a')
						{
							System.out.println(url + "은 \'java\'를 포함합니다");
							break;
						}
					}
				}
			}
		}
		sc.close();
	}

}
