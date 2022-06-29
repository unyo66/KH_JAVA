package pt3.challStream;
import java.util.stream.*;

class Member
{
	String name;
	Gender gender;
	int age;
	
	public Member()
	{
		
	}
	
	public Member(String name, Gender gender, int age)
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
		return "Member(" + name + ", " + gender.toString() + ", " + String.valueOf(age) + ")";
	}
}

public class Test3 {

	public static void main(String[] args) {
		Member[] mb = {
				(new Member("홍길동", Gender.남, 25)), (new Member("배장화", Gender.여, 25)),
				(new Member("임꺽정", Gender.남, 29)), (new Member("연흥부", Gender.남, 28)),
				(new Member("김선달", Gender.남, 32)), (new Member("황진이", Gender.여, 18))
		};
		
		Stream<Member> s1 = Stream.of(mb);
		System.out.println("[Member 스트림 원소]");
		s1.forEach(x -> System.out.print(x.toString()));
		
		System.out.println();
		
		Stream<Member> s2 = Stream.of(mb);
//		s2.filter(x -> x.getGender() == Gender.여).forEach(x -> System.out.print(x));
		System.out.println(s2.collect(Collectors.groupingBy(Member::getGender)));
	}

}
