package pt2.testInherit;

public class Car extends Vehicle {
	int displacement;
	int gears;
	
	public Car()
	{
		
	}
	
	public Car(String str, int n, int n2, int n3)
	{
		this.color = str;
		this.speed = n;
		this.displacement = n2;
		this.gears = n3;
	}
	
	@Override
	public void show()
	{
		System.out.println("색상 : " + color + "\n속도 : " + speed + "\n배기량 : " + displacement + "\n기어 단수 : " + gears);
	}
	
}
