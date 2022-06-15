package pt2.testAbstract;

abstract class Controller
{
	boolean power;
	abstract void show();
//	abstract String getName();
}

class TV extends Controller
{
	public TV()
	{
		
	}
	
	public TV(boolean on)
	{
		this.power = on;
	}
	
	public void show()
	{
		if (power)
			System.out.println("TV가 켜졌습니다.");
		else
			System.out.println("TV가 꺼졌습니다.");
	}
	
//	public String getName()
//	{
//		String name = this.
//	}
}

class Radio extends Controller
{
	public Radio()
	{
		
	}
	
	public Radio(boolean on) 
	{
		this.power = on;
	}
	
	public void show()
	{
		if (power)
			System.out.println("라디오가 켜졌습니다.");
		else
			System.out.println("라디오가 꺼졌습니다.");
	}

}




public class Test5ControllerTest {

	public static void main(String[] args) {
		Controller[] c = {new TV(false), new Radio(true)};
		for (Controller e : c)
		{
			e.show();
		}
	}

}
