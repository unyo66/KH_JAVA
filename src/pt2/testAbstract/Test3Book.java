package pt2.testAbstract;

public class Test3Book {
	int price;
	
	public Test3Book()
	{
		
	}
	
	public Test3Book(int p)
	{
		this.price = p;
	}
	
	public int getPrice()
	{
		return price;
	}
	
	public void print()
	{
		System.out.println("Book [price=" + price + "]");
	}
}
