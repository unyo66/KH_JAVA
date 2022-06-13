package pt1.test2;
import java.util.Scanner;
public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("등수 : ");
		input = sc.nextInt();
		
		switch(input) {
		case 1:
			System.out.println("아주 잘했습니다");
			break;
		case 2:
			System.out.println("잘했습니다");
			break;
		case 3:
			System.out.println("잘했습니다");
			break;
		case 4:
			System.out.println("보통입니다");
			break;
		case 5:
			System.out.println("보통입니다");
			break;
		case 6:
			System.out.println("보통입니다");
			break;
		default :
			System.out.println("노력해야겠습니다");
		
		}
		sc.close();
	}

}
