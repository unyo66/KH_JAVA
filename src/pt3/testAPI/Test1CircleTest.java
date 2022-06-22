package pt3.testAPI;

public class Test1CircleTest {

	public static void main(String[] args) {
		Test1Circle c1 = new Test1Circle(3);
		Test1Circle c2 = new Test1Circle(3);
		
		if (c1.equals(c2))
		{
			System.out.println("같다");
		}
		else
			System.out.println("다르다");
	}

}
