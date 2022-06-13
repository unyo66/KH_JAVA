package pt2.testObject;

public class GolfClub {
	int n;
	String name;
	
	public GolfClub()
	{
		this.n = 7;
	}
	
	public GolfClub(int n)
	{
		this.n = n;
	}
	
	public GolfClub(String name)
	{
		this.name = name;
	}
	
	public void print()
	{
		if (n != 0)
			System.out.println(n + "번 아이언입니다.");
		if (name != null)
			System.out.println(name + "입니다.");
	}
}
