package pt2.samples;

public class Child3 extends Parent3 {
	
	public Child3()
	{
		
	}
	
	public void out()
	{
		System.out.println("부모의 protected num 필드 : " + num);
		System.out.println("자식 클래스 메소드");
	}
	
	@Override
	public void display()
	{
		System.out.println("오버라이딩한 메소드");
	}
}
