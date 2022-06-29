package pt3.challStream;
import java.util.stream.*;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
		Stream<String> s1 = names.stream();
		s1.filter(x -> x.charAt(0) < '이').forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		Stream<String> s2 = names.stream();
		s2.sorted().forEach(x -> System.out.print(x + " "));
		
		System.out.println();
		
		Stream<String> s3 = names.stream();
		System.out.println(s3.findFirst());

		Stream<String> s4 = names.stream();
		System.out.println(s4.findFirst().orElse(null));
//		System.out.println(s4.findFirst().get()); 요것도 됨
		
		
		Stream<String> s5 = names.stream();
		System.out.println(s5.count());
		
		Stream<String> s6 = names.stream();
		s6.skip(1).limit(1).forEach(x -> System.out.println(x));
	}

}
