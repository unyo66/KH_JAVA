package pt2.challObject.samples;

public class Printer {
	private int numOfPapers;
	
	public Printer()
	{
		
	}
	
	public Printer(int numOfPapers)
	{
		this.numOfPapers = numOfPapers;
	}
	
	public void print(int amount)
	{
		if (numOfPapers == 0)
			System.out.print("용지가 없습니다.");
		else if (numOfPapers >= amount)
		{
			numOfPapers -= amount;
			System.out.print(amount + "장 출력, " + (numOfPapers) + "장이 남아 있습니다.");
		}
		else
		{
			System.out.print(amount + "장 중 " + numOfPapers + "장 출력, " + (amount - numOfPapers) + "장이 부족합니다.");
			numOfPapers = 0;
		}
		this.graphic();
	}
	
	public void addPaper(int amount)
	{
		numOfPapers += amount;
		if (numOfPapers > 100)
		{
			System.out.print("용지가 " + amount + "장 추가되었습니다. 용지가 가득 찼습니다.");
			numOfPapers = 100;
			this.graphic();
		}
		else
		{
			System.out.print("용지가 " + amount + "장 추가되었습니다. 현재 " + numOfPapers + "장이 있습니다.");
			this.graphic();
		}
	}
	
	public void graphic()
	{
		int[] zeroOne = new int[10];
		int howmany = (int)Math.round((double)numOfPapers / 10);
		for(int i = 0; i < howmany; i++)
		{
			zeroOne[i] = 1;
		}
		for(int i = 0; i < 10; i++)
		{
			if (zeroOne[i] == 0)
			{
				System.out.print("□");
			}
			else
				System.out.print("■");
		}
		System.out.println();
	}
}