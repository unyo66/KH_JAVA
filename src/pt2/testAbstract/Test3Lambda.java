package pt2.testAbstract;
import java.util.Arrays;


public class Test3Lambda
{
	public static void main(String[] args) {
		Books[] books = {new Books(50000), new Books(20000), new Books(35000)};
		
		for (Books e : books)
			System.out.println(e.price);
		
		Arrays.sort(books, (o1, o2) -> o1.price - o2.price);//compareTo로 기준 만들고 객체 정렬
		System.out.println("-정렬완료-");
		
		for (Books e : books)
			System.out.println(e.price);
	}

}
