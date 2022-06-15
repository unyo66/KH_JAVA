package pt2.testAbstract;

class Hotel
{
	class room
	{
		int roomNum;
		String customer;
		
		public void add(int n, String str)
		{
			this.roomNum = n;
			this.customer = str;
		}
		
		public void show()
		{
			
		}
	}
	
}

public class Test9Hotel {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");
		hotel.show();
	}

}
