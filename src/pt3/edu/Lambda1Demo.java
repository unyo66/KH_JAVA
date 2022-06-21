package pt3.edu;

import java.util.Arrays;

public class Lambda1Demo {

	public static void main(String[] args) {
		String[] str = {"로마 어쩌고", "시간은 어쩌고", "펜은 어쩌고"};
		
		Arrays.sort(str, (first, second) -> first.length() - second.length());
		//sort 중 comparator를 구현해서 사용하는 메소드가 있는데, 람다식으로 간결하게 comparator를 구현한 것
		for (String s : str)
			System.out.println(s);
	}

}
