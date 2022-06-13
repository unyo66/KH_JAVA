package pt2.test2.samples;

public class Bird implements Countable{
	String name;
	
	public Bird(String name)
	{
		this.name = name;
	}
	
	public void count()
	{
		System.out.println(name + "가 1마리 있다");
	}
	
	public void fly(int birds)
	{
		System.out.println("우리는 " + birds + "마리가 함께 날아간다");
	}
}