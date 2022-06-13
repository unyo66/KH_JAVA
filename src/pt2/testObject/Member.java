package pt2.testObject;

public class Member {
	private String name;
	private String id;
	private String pw;
	private int age;
	
	public Member(String name, String id, String pw, int age)
	{
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public String getPw()
	{
		return pw;
	}
	public int getAge()
	{
		return age;
	}
}
