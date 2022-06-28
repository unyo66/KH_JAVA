package pt3.edu;
import java.util.*;
import java.util.stream.*;

public class ArrayToStream {

	public static void main(String[] args) {
		int[] iarr = {2, 3, 5, 7, 11, 13};
		IntStream is = Arrays.stream(iarr);
		
		is.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		String[] strings = {"The", "pen", "is", "mighter", "than", "the", "sword"};
		Stream<String> ss = Stream.of(strings);
		
		ss.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		double[] darr = {1.2, 3.14, 5.8, 0.1};
		DoubleStream ds = DoubleStream.of(darr);
		
		ds.forEach(x -> System.out.print(x + " "));
		}
	
	//Arrays.stream은 ~Stream.of와 기능이 같은듯

}
