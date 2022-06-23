package pt3.generic;

import java.util.ArrayList;

public class GenericInherit {

	public static void main(String[] args) {
		ArrayList<Beverage> list1 = new ArrayList<>();
		list1.add(new Beer());
		beverageTest(list1);
		System.out.println();
		
		ArrayList<Beverage> list2 = new ArrayList<>();
		list2.add(new Coffee());
		beverageTest(list2);
		
	}
	
	static public void beverageTest(ArrayList<? extends Beverage> list)
	{
		System.out.println(list.getClass());
	}

}
