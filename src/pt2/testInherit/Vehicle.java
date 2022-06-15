package pt2.testInherit;

public class Vehicle {
	String color;
	int speed;
	
	public Vehicle()
	{
		
	}
	
	public Vehicle(String str, int n)
	{
		this.color = str;
		this.speed = n;
	}
	
	public void show()
	{
		System.out.println("색상 : " + color + "\n속도" + speed);
	}
}
