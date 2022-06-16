package pt2.testAbstract;

class Room
{
	int roomNum;
	String customer;
	
	public Room()
	{
		
	}
	public Room(int n, String str)
	{
		this.roomNum = n;
		this.customer = str;
	}
			
}

class Hotel
{
	
	private Room[] rooms = new Room[30];
	
	public void add(int n, String str)
	{
		System.out.println("<예약>");
		if (n >= 101 && n <= 110)
		{
			rooms[n - 101] = new Room(n, str);
			System.out.println(str + "님께서 " + n + "호실을 예약했습니다.");
		}
		else if (n >= 201 && n <= 210)
		{
			rooms[n - 191] = new Room(n, str);
			System.out.println(str + "님께서 " + n + "호실을 예약했습니다.");
		}
		else if (n >= 301 && n <= 310)
		{
			rooms[n - 281] = new Room(n, str);
			System.out.println(str + "님께서 " + n + "호실을 예약했습니다.");
		}
		else
			System.out.println("그런 방은 없습니다.");
		
	}
	
	public void show()
	{
		System.out.println("<호텔 사용 현황>");
		for (int i = 0; i < rooms.length; i++)
		{
			if (rooms[i] != null)
			{
				if (rooms[i].customer.equals("폐쇄"))
					System.out.println(rooms[i].roomNum + "호실은 폐쇄되었습니다.");
				else
					System.out.println(rooms[i].roomNum + "호실은 " + rooms[i].customer + "님이 사용 중입니다.");
			}
			
		}
	}
	
	public void checkout(int n)
	{
		System.out.println("<체크아웃>");
		if (n >= 101 && n <= 110)
		{
			System.out.println(rooms[n - 101].customer + "님께서 " + n + "호실을 체크아웃하셨습니다.");
			rooms[n - 101] = null;
		}
		else if (n >= 201 && n <= 210)
		{
			System.out.println(rooms[n - 191].customer + "님께서 " + n + "호실을 체크아웃하셨습니다.");
			rooms[n - 191] = null;
		}
		else if (n >= 301 && n <= 310)
		{
			System.out.println(rooms[n - 281].customer + "님께서 " + n + "호실을 체크아웃하셨습니다.");
			rooms[n - 281] = null;
		}
		else
			System.out.println("그런 방은 없습니다.");
	}
	
	
	public void window(int n)
	{
		System.out.println("<돌발상황>");
		if (n >= 101 && n <= 110)
		{
			System.out.println(rooms[n - 101].customer + "님께서 " + n / 100 + "층에서 떨어졌지만 아무 일도 일어나지 않았습니다.");
		}
		else if (n >= 201 && n <= 210)
		{
			System.out.println(rooms[n - 191].customer + "님께서 " + n / 200 + "층에서 떨어져 크게 다치고 병원으로 이송되었습니다.");
			rooms[n - 191] = null;
		}
		else if (n >= 301 && n <= 310)
		{
			System.out.println(rooms[n - 281].customer + "님께서 " + n / 300 + "층에서 떨어져 사망했습니다. " + n + "호실은 폐쇄합니다.");
			rooms[n - 281].customer = "폐쇄";
		}
		else
			System.out.println("그런 방은 없습니다.");
	}
}

public class Test9Hotel {

	public static void main(String[] args) {
		Hotel hotel = new Hotel();
		hotel.add(205, "호돌이");
		hotel.add(310, "길동이");
		hotel.add(101, "고훈이");
		hotel.add(5, "멍청이");
		hotel.show();
		hotel.checkout(205);
		hotel.show();
		hotel.window(310);
		hotel.show();
	}

}
