package pt2.testInherit;

public class Phone {
	protected String owner;
	
	public Phone()
	{
		
	}
	
	public Phone(String n)
	{
		this.owner = n;
	}
	
	public void talk()
	{
		System.out.println(owner + "는 통화 중입니다.");
	}
	
	public void autoAnswering()
	{
		
	}
	
	public void playGame()
	{
		
	}

}
