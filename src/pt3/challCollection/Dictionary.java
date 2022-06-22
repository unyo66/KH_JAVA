package pt3.challCollection;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {
	
	static String tl(String str)
	{
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("head", "대가빠리");
		map.put("teacher", "쌤");
		map.put("cat", "꼬네이");
		map.put("aunt", "아지매");
		map.put("noodle", "국시");
		map.put("child", "얼라");
		
		return map.get(str);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String transed = tl(sc.next());
		if (transed == null)
			System.out.println("map에 없습니다.");
		else
			System.out.println(transed);
		sc.close();
	}

}
