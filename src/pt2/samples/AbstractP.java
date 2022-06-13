package pt2.samples;

public abstract class AbstractP {
	private String name;
	
	public AbstractP()
	{
		
	}
	
	public AbstractP(String name)
	{
		this.name = name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public abstract void out();
}
