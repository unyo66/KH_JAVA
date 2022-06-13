package pt2.test2.samples;

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
			System.out.println("용지가 없습니다.");
		else if (numOfPapers >= amount)
		{
			numOfPapers -= amount;
			System.out.println(amount + "장 출력, " + (numOfPapers) + "장이 남아 있습니다.");
		}
		else
		{
			System.out.println(amount + "장 중 " + numOfPapers + "장 출력, " + (amount - numOfPapers) + "장이 부족합니다.");
			numOfPapers = 0;
		}
	}
	
	public void addPaper(int amount)
	{
		numOfPapers += amount;
		System.out.println("용지가 " + amount + "장 추가되었습니다. 현재 " + numOfPapers + "장이 있습니다.");
	}
}