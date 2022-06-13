package pt1.test2;

public class Test9 {

	public static void main(String[] args) {
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}
	static void foo(String str, int ... n)
	{
		System.out.print(str + " ");
		
		for (int i = 0; i < n.length; i++)
		{
			System.out.print(n[i] + " ");
		}
		System.out.print("\n");
	}

}
