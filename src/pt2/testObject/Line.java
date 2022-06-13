package pt2.testObject;

public class Line {
	int howLong;
	
	public Line(int howLong)
	{
		this.howLong = howLong;
	}
	
	public boolean isSameLine(Line a)
	{
		if (this.howLong == a.howLong)
			return true;
		else
			return false;
	}
}
