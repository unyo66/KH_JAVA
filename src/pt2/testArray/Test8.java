package pt2.testArray;
import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘은 무슨 요일?");
		printMood(sc.next());
		sc.close();
	}
	
	
	static void printMood(String day)
	{
		switch(day) {
		case "monday" -> System.out.println("월요일 싫어");
		case "friday" -> System.out.println("금요일 좋아");
		case "saturday" -> System.out.println("토요일 최고");
		case "sunday" -> System.out.println("일요일 최고");
		case "tuesday", "wedensday" , "thursday"-> System.out.println("그저 그래");
		default -> System.out.println("제대로 다시 쓰세요");
		}
	}

}
