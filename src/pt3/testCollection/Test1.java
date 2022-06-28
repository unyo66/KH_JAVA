package pt3.testCollection;
import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("갈매기");
		list.add("나비");
		list.add("다람쥐");
		list.add("라마");
		list.forEach(x -> {if (x.length() <= 2)System.out.println(x);});
	}

}
