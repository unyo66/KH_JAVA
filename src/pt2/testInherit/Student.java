package pt2.testInherit;

public class Student extends Person {
	int stNumber;
	
	public Student()
	{
		
	}
	
	public Student(String n, int a, int nu)
	{
		this.name = n;
		this.age = a;
		this.stNumber = nu;
	}
	
	@Override
	public void show()
	{
		System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", name, age, stNumber);
	}
}
