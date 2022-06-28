package pt3.edu;

public class ExMain {

	public static void main(String[] args) {
		CheckEven ce = new CheckEven();
		
		int n1 = 100;
		int n2 = 99;
		
		try
		{
			System.out.println(ce.printEven(n1));
			System.out.println(ce.printEven(n2));
		}
		catch(EvenException e)
		{
			e.printStackTrace();
		}
	}

}
