package pt3.challStream;
import java.util.stream.*;
import java.util.List;

enum Gender{남, 여};

public class Test2 {

	public static void main(String[] args) {
		List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
		List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);
		
		Stream<Integer> s1 = ages.stream();
		int sum = s1.reduce(0, Integer::sum);
		System.out.println(sum);
		
		Stream<Integer> s2 = ages.stream();
		System.out.println(s2.reduce(0, Integer::max));
		
		DoubleStream s3 = ages.stream().mapToDouble(x -> x.doubleValue());
		System.out.println(s3.average().orElse(0.0));
	}

}
