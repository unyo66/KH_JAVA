package pt3.GenericChall;

public class MathScore implements Comparable<MathScore>{
	String name;
	int score;
	
	public MathScore()
	{
		
	}
	
	public MathScore(String str, int n)
	{
		this.name = str;
		this.score = n;
	}
	
	public String toString()
	{
		return name + " " + String.valueOf(score);
	}
	public int compareTo(MathScore o)
	{
		return this.score - (o).score;
	}
}
