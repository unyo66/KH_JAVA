package pt2.testCircle;

public class Circle {
	private double PI = 3.141592;
	private double r;
	int n = 1;
	
	public Circle()
	{
		
	}
	
	public void setRadius(double r)
	{
		this.r = r;
	}
	
	public void draw()
	{
		double dimension = this.r * this.r * PI;
		System.out.printf("원의 넓이는 %.f 입니다", dimension);
	}

}
