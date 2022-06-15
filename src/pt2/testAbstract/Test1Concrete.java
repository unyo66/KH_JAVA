package pt2.testAbstract;

public class Test1Concrete extends Test1Abstract {
	int j;
	
	public Test1Concrete()
	{
		
	}
	
	public Test1Concrete(int i, int j)
	{
		this.i = i;
		this.j = j;
	}
	
	@Override
	public void show()
	{
		System.out.println("i = " + i + ", j = " + j);
	}

}
