package pt2.testInherit;

public class Circle {
	int radius;
	
	public Circle()
	{
		
	}
	
	public Circle(int radius)
	{
		this.radius = radius;
	}
	
	public void show()
	{
		System.out.println("반지름이 " + radius + "인 원이다.");
	}
}
