package pt2.edu;

public class TestInstanceOf {

	public static void main(String[] args) {
		Chair c = new Chair();
		if (c instanceof Chair)
		{
			System.out.println("Chair 객체입니다");
		}
		if(c instanceof Furniture) {
			System.out.println("Furniture 객체입니다.");
		}
		
		if(c instanceof Object) {
			System.out.println("Object 객체입니다.");
		}
		System.out.println("실제 타입 : " + c.getClass().getName());
	}
	static class Furniture
	{
		
	}
	
	static class Chair extends Furniture
	{
		
	}

}
