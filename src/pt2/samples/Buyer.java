package pt2.samples;

class Furniture
{
	public int price;
	
	public Furniture(int price)
	{
		this.price = price;
	}
}

public class Buyer
{
	private int money = 500;
	
	public void buy(Furniture f)
	{
		if (money < f.price)
		{
			System.out.println("잔액 부족");
			return;
		}
		money -= f.price;
		System.out.println(f + " 구매 성공! 잔액 : " + money + " 만원");
	}
}