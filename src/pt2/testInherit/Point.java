package pt2.testInherit;

public class Point {
	private int x, y;
	
	public Point()
	{
		
	}
	
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String toString()
	{
		return 	(x + ", " + y);
	}
}
