package pt2.testAbstract;

import java.util.Collections;

public class Test3Test implements Comparable<Test3Book> {
	@Override
	public int compareTo(Test3Book book)
	{
		return book.getPrice();
	}

	public static void main(String[] args) {
		Test3Book[] books = {new Test3Book(50000), new Test3Book(20000)};
		
		for (Test3Book e : books)
			e.print();
		
		Collections.sort(books);
		
		for (Test3Book e : books)
			e.print();
	}

}
