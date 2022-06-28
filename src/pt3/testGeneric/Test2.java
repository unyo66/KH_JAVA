package pt3.testGeneric;

class Shape
{
	
}

class Rectangle extends Shape
{
	
}

class Circle extends Shape
{
	
}

public class Test2 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		try {
			casting(r);
			System.out.println("캐스팅 완료");
		}
		catch(ClassCastException e)
		{
			System.out.println("캐스팅 불가!");
			System.out.println(e.getMessage());
			System.out.println("다운캐스팅은 업캐스팅이 선행되어야 합니다.");
		}
		try {
			casting(c);
			System.out.println("캐스팅 완료");
		}
		catch(ClassCastException e)
		{
			System.out.println("캐스팅 불가!");
			System.out.println(e.getMessage());
			System.out.println("다운캐스팅은 업캐스팅이 선행되어야 합니다.");
		}

	}
	
	static void casting(Shape s)
	{
		Shape a = (Shape) s;
		Circle c= (Circle) a;
	}

}
