package pt2.samples;

public class SamsungPrinter implements PrintDriver{
	
	@Override
	public void print()
	{
		System.out.println("삼성 프린트 인쇄 중");
	}
	@Override
	public void scan()
	{
		
	}
}