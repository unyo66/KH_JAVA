package pt2.testInherit;

public class ColoredCircle extends Circle {
	String color;
	
	public ColoredCircle(int radius, String color)
	{
		this.radius = radius;
		this.color = color;
	}
	
	public void show()
	{
		System.out.println("반지름이 " + radius + "인 " + color + "원이다.");
	}
}
