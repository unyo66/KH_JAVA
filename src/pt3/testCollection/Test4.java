package pt3.testCollection;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Test4 {
	public static void main(String[] args)
	{
		HashSet<String> a1 = new HashSet<>();
		a1.addAll(Arrays.asList("독수리", "나비", "염소", "고양이", "개미", "여우"));
		System.out.println("HashSet : " + a1);
		
		TreeSet<String> a2 = new TreeSet<>();
		a2.addAll(a1);
		System.out.println("TreeSet : " + a2);
		System.out.println("첫번째 동물 : " + a2.first());
		System.out.println("마지막 동물 : " + a2.last());
		System.out.println("나비 앞에 있는 동물 : " + a2.lower("나비"));
	}
}
