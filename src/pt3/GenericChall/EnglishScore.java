package pt3.GenericChall;

public class EnglishScore implements Comparable<EnglishScore>{
	String name;
	int score;
	
	public EnglishScore()
	{
		
	}
	
	public EnglishScore(String str, int n)
	{
		this.name = str;
		this.score = n;
	}
	
	public String toString()
	{
		return name + " " + String.valueOf(score);
	}
	public int compareTo(EnglishScore o)
	{
		return this.score - (o).score;
	}
}
