package pt2.testAbstract;
import java.util.Comparator;
import java.util.Arrays;

class Book implements Comparator<Booky> {
	int price;
	
	public Book(int n)
	{
		this.price = n;
	}
	@Override
	public int compare(Booky o1, Booky o2)//Arrays.sort로 객체 정렬하기 위한 기준 메소드
	{
		return o1.price - o2.price;
	}
}


public class Test3Test2
{
	public static void main(String[] args) {
		Books[] books = {new Books(50000), new Books(20000), new Books(35000)};
		
		for (Books e : books)
			System.out.println(e.price);
		
		Arrays.sort(books);//compareTo로 기준 만들고 객체 정렬
		System.out.println("-정렬완료-");
		
		for (Books e : books)
			System.out.println(e.price);
	}

}
