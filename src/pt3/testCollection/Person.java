package pt3.testCollection;

public class Person {
	private String name;
	private int age;
	
	public Person(String str, int n)
	{
		this.name = str;
		this.age = n;
	}
	
	public String toString()
	{
		return name + " : " + String.valueOf(age);
	}
}
