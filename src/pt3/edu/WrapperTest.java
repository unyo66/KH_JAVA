package pt3.edu;
//매개변수로 객체를 받는 자리에 기본 자료형 데이터를 넣으면?

class WrapperEx
{
	public void printWrapper(Object o)
	{
		System.out.println("데이터 : " + o);
		System.out.println("데이터 클래스 : " + o.getClass());
	}
}

public class WrapperTest {

	public static void main(String[] args) {
		int i = 123;
		double d = 3.14;
		WrapperEx wp = new WrapperEx();
		wp.printWrapper(i);
		wp.printWrapper(d);
	}

}
