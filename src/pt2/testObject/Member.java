package pt2.testObject;

public class Member {
	private String name;
	private String id;
	private String pw;
	private String age;
	
	public Member(String name, String id, String pw, String age)
	{
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	public void getName()
	{
		System.out.println(name);
	}
	public void getId()
	{
		System.out.println(id);
	}
	public void getPw()
	{
		System.out.println(pw);
	}
	public void getAge()
	{
		System.out.println(age);
	}
}
