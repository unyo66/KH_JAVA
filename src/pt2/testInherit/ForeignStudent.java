package pt2.testInherit;

public class ForeignStudent extends Student {
	String nationality;
	
	public ForeignStudent()
	{
		
	}
	
	public ForeignStudent(String n, int a, int nu, String na)
	{
		this.name = n;
		this.age = a;
		this.stNumber = nu;
		this.nationality = na;
	}
	
	@Override
	public void show()
	{
		System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]\n", name, age, stNumber, nationality);
	}
}
