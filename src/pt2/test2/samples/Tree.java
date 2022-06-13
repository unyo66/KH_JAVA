package pt2.test2.samples;

public class Tree implements Countable{
	String name;
	
	public Tree(String name)
	{
		this.name = name;
	}
	
	public void count()
	{
		System.out.println(name + "가 1그루 있다");
	}
	
	public void ripen(int trees)
	{
		System.out.println(trees + "그루가 양재 꽃시장에 팔려간다");
	}
}