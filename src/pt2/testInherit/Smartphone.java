package pt2.testInherit;

public class Smartphone extends Telephone {
	private String game;
	
	public Smartphone()
	{
		
	}
	
	public Smartphone(String n, String g)
	{
		this.owner = n;
		this.game = g;
	}
	
	public void playGame()
	{
		System.out.println(owner + "는 " + game + "을 하는 중입니다.");
	}

}
