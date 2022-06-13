package pt2.edu;

public class TestPolyArg {
	public static void main(String[] args)
	{
		Buyer b = new Buyer();
		b.buy(new Chair());
		b.buy(new Desk());
	}
	
	static class Furniture
	{
		public int price;
		
		public Furniture(int price)
		{
			this.price = price;
		}
	}
	
	static class Chair extends Furniture
	{
		public Chair()
		{
			super(100);
		}
		
		@Override
		public String toString()
		{
			return "Chair";
		}
	}
	
	static class Desk extends Furniture
	{
		public Desk()
		{
			super(200);
		}
		
		@Override
		public String toString()
		{
			return "Desk";
		}
	}
	
	static class Buyer
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
}
