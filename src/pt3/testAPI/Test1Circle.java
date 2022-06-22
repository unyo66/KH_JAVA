package pt3.testAPI;

public class Test1Circle {
	private int radius;
	
	public Test1Circle()
	{
		
	}
	
	public Test1Circle(int n)
	{
		this.radius = n;
	}
	
	public boolean equals(Object o)
	{
		if (this.radius == ((Test1Circle)o).radius)
		{
			return true;
		}
		else
			return false;
	}
}
