package pt3.edu;
import java.util.Objects;

public class StuManager {
	public void scoreComp(Student s1, Student s2)
	{
//		int result = new StuComparator().compare(s1, s2);
		int result = Objects.compare(s1, s2, new StuComparator());
		/*Objects 클래스의 compare을 사용하면 1, 2번째 매개변수를 3번째 매개변수인
		Comparator를 이용해 비교한다. */
		
		if (result > 0)
			System.out.println(s1.getName() + " 학생이 우수합니다.");
		else if (result < 0)
			System.out.println(s2.getName() + " 학생이 우수합니다.");
		else
			System.out.println("두 학생은 점수가 같습니다.");
	}

}
