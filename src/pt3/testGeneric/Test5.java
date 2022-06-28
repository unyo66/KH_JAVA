package pt3.testGeneric;

import java.util.ArrayList;
import java.util.List;

interface Animal
{
	void sound();
}

class Dog implements Animal
{
	public void sound()
	{
		System.out.println("멍멍");
	}
}

class Cuckoo implements Animal
{
	public void sound()
	{
		System.out.println("뻐꾹뻐꾹");
	}
}

public class Test5 {

	public static void main(String[] args) {
		List<Animal> lists = new ArrayList<>();
		lists.add(new Dog());
		lists.add(new Cuckoo());
		printSound(lists);
		
		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog());
		printSound(dogs);
		
	}
	
	public static void printSound(List<? extends Animal> a)//Animal을 상속받은 a만
	{
		a.forEach(x -> x.sound());
	}

}
