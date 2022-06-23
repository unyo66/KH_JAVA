package pt3.edu;

public class Fruit {
	String name;
	
	public Fruit(String name)
	{
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (o instanceof Fruit)
			return ((Fruit)o).name.equals(name);
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return String.format("Fruit(%s)", name);
	}
}
