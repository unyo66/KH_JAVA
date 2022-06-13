package pt2.samples;

public class Child2 extends Parent2 {
	public Child2()
	{
		super(); //부모 기본 생성자 호출,안 써도 기본적으로 자식클래스 생성자 실행될 때 부모 생성자도 실행되므로 결과 똑같음
		System.out.println("자식 기본 생성자");
	}
	
	@Override
	public void out()
	{
		super.out(); //부모 메소드 out() 호출
		System.out.println("자식 out() 메소드");
	}
}
