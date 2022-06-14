package pt2.testDiagram.view;
import pt2.testDiagram.controller.SnackController;
import java.util.Scanner;
public class SnackMenu {
	public SnackMenu()
	{
		
	}
	
		public void menu()
	{
		SnackController controller = new SnackController();
		
		String[] sort = {"종류: ", "이름: ", "맛: ", "개수: ", "가격: "};
		String kind, name, flavor;
		int numOf, price;

		Scanner sc = new Scanner(System.in);
		System.out.println("스낵류를 입력하세요.");
		System.out.println(sort[0]);
		kind = sc.next();
		System.out.println(sort[1]);
		name = sc.next();
		System.out.println(sort[2]);
		flavor = sc.next();
		System.out.println(sort[3]);
		numOf = sc.nextInt();
		System.out.println(sort[4]);
		price = sc.nextInt();
		System.out.print(controller.saveData(kind, name, flavor, numOf, price));
		System.out.println(", 저장 내역을 확인하시겠습니까? y/n");
		if (sc.next().equals("y"))
		{
			for (int i = 0; i < 5; i++)
			{
				System.out.println(sort[i] + controller.confirmData(i));
			}
		}
		else
			System.out.println("종료되었습니다.");
		sc.close();
	}
}
