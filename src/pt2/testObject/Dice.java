package pt2.testObject;

public class Dice {
	
	public Dice()
	{
		
	}
	
	public int roll()
	{
		int face = (int)(Math.random() * 6) + 1;
		return face;
	}
}
