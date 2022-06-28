package pt3.testGeneric;

class Max<T>
{
	public void max(T a1, T a2)
	{
		if (a1.getClass().getName().equals("java.lang.Integer"))
		{
			System.out.println("인트");
		}
		else if (a1.getClass().getName().equals("java.lang.Double"))
		{
			
		}
		else
		{
			
		}
	}
}

public class Test6 {

	public static void main(String[] args) {
		Max<Number> n = new Max<>();
		n.max(1, 2);
	}

}
