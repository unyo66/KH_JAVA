package pt3.challStream;
import java.util.List;
import java.util.Map;
import java.util.stream.*;

class Members
{
	String name;
	Gender gender;
	int age;
	
	public Members()
	{
		
	}
	
	public Members(String name, Gender gender, int age)
	{
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Gender getGender()
	{
		return gender;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String toString()
	{
		return "Members(" + name + ", " + gender.toString() + ", " + String.valueOf(age) + ")";
	}
}

public class Test3_1 {
	static int i = 0;

	public static void main(String[] args) {
//		Members[] mb = {
//				(new Members("홍길동", Gender.남, 25)), (new Members("배장화", Gender.여, 25)),
//				(new Members("임꺽정", Gender.남, 29)), (new Members("연흥부", Gender.남, 28)),
//				(new Members("김선달", Gender.남, 32)), (new Members("황진이", Gender.여, 18))
//		};
		
		List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
		List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
		List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);
		
		
		Stream<String> s1 = names.stream();
		Stream<Members> m1 = s1.map(n -> new Members(n, genders.get(i), ages.get(i++)));
		
		System.out.println("[Members 스트림 원소]");
		m1.forEach(x -> System.out.print(x));

		System.out.println();
		i = 0;
		s1 = names.stream();
		m1 = s1.map(n -> new Members(n, genders.get(i), ages.get(i++)));
		Map<Gender, List<Members>> map = m1.collect(Collectors.groupingBy(Members::getGender));
		System.out.println("[Members 스트림을 성별로 그룹핑");
		System.out.println(map);
	
	}

}
