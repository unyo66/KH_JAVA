package pt3.testAPI;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Test8WordArray {

	public static void main(String[] args) {
		int cnt;
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.nextLine();
		sc.close();
		
		StringTokenizer st = new StringTokenizer(input);
		
		cnt = st.countTokens();
		System.out.println("단어 개수 : " + cnt);

		String[] strArr = new String[cnt];
		
		for (int i = 0; i < cnt; i++)
		{
			strArr[i] = st.nextToken();
		}
		
		Arrays.sort(strArr);
		
		for (String e : strArr)
			System.out.print(e + ", ");
	}

}
