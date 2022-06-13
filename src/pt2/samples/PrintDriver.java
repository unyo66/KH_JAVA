package pt2.samples;

public interface PrintDriver {
	void print();
	
	void scan();
	
	//예외적인 상황에서 추가 메소드 구현
	default public void test()
	{
		System.out.println(" 안녕하세요");
	}
}
