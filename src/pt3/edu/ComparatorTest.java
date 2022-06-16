package pt3.edu;

public class ComparatorTest {

	public static void main(String[] args) {
		Student s1 = new Student("홍길동", 100, 90);
		Student s2 = new Student("고길동", 90, 80);
		new StuManager().scoreComp(s1, s2);
	}

}
