package pt2.testInherit;

public class MovablePoint extends Point {
	private int x, y, xSpeed, ySpeed;
	
	public MovablePoint()
	{
		
	}
	
	public MovablePoint(int x, int y, int xs, int ys)
	{
		this.x = x;
		this.y = y;
		this.xSpeed = xs;
		this.ySpeed = ys;
	}
	
	@Override
	public String toString()
	{
		return (x + ", " + y + "\n" + xSpeed + ", " + ySpeed);
	}
}
