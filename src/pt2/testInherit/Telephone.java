package pt2.testInherit;

public class Telephone extends Phone {
	private String when;
	
	public Telephone()
	{
		
	}
	
	public Telephone(String n, String t)
	{
		this.owner = n;
		this.when = t;
	}
	
	public void autoAnswering()
	{
		System.out.println(owner + "는 " + when + " 전화 가능합니다.");
	}
	
	public void playGame()
	{
		
	}

}
