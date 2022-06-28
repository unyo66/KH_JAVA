package pt3.edu;
import java.util.List;
public class Nation {
	private final String name;
	private final Type type;
	private final double population;
	private final int gdpRank;
	
	public Nation(String name, Type type, double population, int gdpRank)
	{
		this.name = name;
		this.type = type;
		this.population = population;
		this.gdpRank = gdpRank;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Type getType()
	{
		return type;
	}
	public boolean isIsland()
	{
		return getType() != Type.LAND;
	}
	public double getPopulation()
	{
		return population;
	}
	public int getGdpRank()
	{
		return gdpRank;
	}
	public enum Type{LAND, ISLAND};
	public String toString()
	{
		return name;
	}
	
	public static final List<Nation> nations = List.of(
			new Nation("ROK", Nation.Type.LAND, 51.4, 11),
			new Nation("USA", Nation.Type.LAND, 318.9, 1));
	
}
