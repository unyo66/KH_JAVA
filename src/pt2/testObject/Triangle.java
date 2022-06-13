package pt2.testObject;

public class Triangle {
	double b, h;
	
	public Triangle(double b, double h)
	{
		this.b = b;
		this.h = h;
	}
	
	public double findArea()
	{
		return b * h / 2;
	}
	
	public boolean isSameArea(Triangle t)
	{
		if(this.findArea() == t.findArea())
			return true;
		else
			return false;
	}
}
