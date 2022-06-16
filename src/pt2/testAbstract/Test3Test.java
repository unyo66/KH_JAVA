package pt2.testAbstract;

import java.util.Arrays;

class Books implements Comparable<Object> {
	int price;
	
	public Books(int n)
	{
		this.price = n;
	}
	@Override
	public int compareTo(Object o)//Arrays.sort로 객체 정렬하기 위한 기준 메소드
	{
		return this.price - ((Books)o).price;
	}
}
public class Test3Test
{
	public static void main(String[] args) {
		Books[] books = {new Books(50000), new Books(20000)};
		
		for (Books e : books)
			System.out.println(e.price);
		
		Arrays.sort(books);//compareTo로 기준 만들고 객체 정렬
		
		for (Books e : books)
			System.out.println(e.price);
	}

}
