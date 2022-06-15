package pt2.testInherit;

public class Person {
	String name;
	int age;
	
	public Person()
	{
		
	}
	
	public Person(String n, int a)
	{
		this.name = n;
		this.age = a;
	}
	
	public void show()
	{
		System.out.printf("사람[이름 : %s, 나이 : %d]\n", name, age);
	}
}
