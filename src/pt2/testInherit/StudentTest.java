package pt2.testInherit;

public class StudentTest {

	public static void main(String[] args) {
		Person[] p = {new Person("길동이", 22), new Student("황진이", 23, 100), new ForeignStudent("Amy", 30, 200, "USA")};
		
		
		for (Person e : p)
		{
			e.show();
		}
	}

}
