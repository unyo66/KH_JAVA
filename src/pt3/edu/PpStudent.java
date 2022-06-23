package pt3.edu;

public class PpStudent implements java.io.Serializable {
	private String no;
	private String name;
	private int score;
	
	public PpStudent()
	{
		
	}
	
	public PpStudent(String no, String name, int score)
	{
		this.no = no;
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString()
	{
		return no + ", " + name + ", " + score;
	}
	
	public void setStudent(String no, String name, int score)
	{
		this.no = no;
		this.name = name;
		this.score = score;
	}
	
	public String getNo()
	{
		return no;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getScore()
	{
		return score;
	}
}
