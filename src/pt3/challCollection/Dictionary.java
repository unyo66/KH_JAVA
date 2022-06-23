package pt3.challCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Dictionary {
	

	public static void main(String[] args) {
		HashMap<String, String> dic = new HashMap<String, String>();
		dic.put("head", "대가빠리");
		dic.put("teacher", "쌤");
		dic.put("cat", "꼬네이");
		dic.put("aunt", "아지매");
		dic.put("noodle", "국시");
		dic.put("child", "얼라");
		
		for (String e : dic.keySet())
		{
			System.out.printf("%s=%s ", e, dic.get(e));
		}
		System.out.println("[그냥 뽑기]");
		
		
		Iterator<Map.Entry<String, String>> iter = dic.entrySet().iterator();
		while (iter.hasNext())
		{
			String key = iter.next().getKey();
			System.out.printf("%s=%s ", key, dic.get(key));
		}
		
//		while (iter.hasNext())
//		{
//			Map.Entry<String, String> e = iter.next();
//			System.out.printf("%s=%s ", e.getKey(), e.getValue());
//		}
		System.out.println("[Iterator 사용]");
		
		
		
		dic.forEach((x, y) -> System.out.print(x + "=" + y + " "));
		System.out.println("[forEach와 람다식 사용]");
		
		System.out.println("\nCollection으로 value 셔플해서 출력하기");
		
		
		Collection<String> c1 = dic.values();
		List<String> list = new ArrayList<>(c1); //필요?
		
		List<String> list2 = new ArrayList<>(dic.values());
		
		Collections.shuffle(list);
		Collections.shuffle(list2);

		list.forEach(x -> System.out.print(x + " "));
		list2.forEach(x -> System.out.print(x + " "));
	}

}
