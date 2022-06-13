package pt2.testArray;

public class Test7 {

	public static void main(String[] args) {
		int[] a = {3, 2, 4, 1};
		int[] b = {3, 2, 4, 1};

		System.out.println(same(a, b));

	}

	static String same(int[] a, int[] b) {
		int flag = 0;

		if (a.length != b.length)
			flag++;
		else {

			for (int i = 0; i < a.length; i++) {
				if (a[i] != b[i])
					flag++;
			}
		}

		if (flag == 0)
			return "yes";
		else
			return "no";
	}

}
