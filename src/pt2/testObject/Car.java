package pt2.testObject;

public class Car {
	char[] ccolor;
	static int count = 0;
	static int redcount = 0;
	
	public Car(String color)
	{
		ccolor = color.toCharArray();
		count++;
		
		for (int i = 0; i < ccolor.length; i++)
		{
			if(ccolor[i] < 91)
			{
				ccolor[i] += 32;
			}
		}
		
		if (ccolor[0] == 'r')
			if (ccolor[1] == 'e')
				if (ccolor[2] == 'd')
					redcount++;
	}
	
	public static int getNumOfCar()
	{
		return count;
	}
	
	public static int getNumOfRedCar()
	{
		return redcount;
	}
}
