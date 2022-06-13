package pt2.samples;

public class HpPrinter implements PrintDriver{
	public void printHp()
	{
		System.out.println("HP 프린터 인쇄 중");
	}
	@Override
	public void print()
	{
		printHp();
	}
	@Override
	public void scan()
	{
		
	}
}
