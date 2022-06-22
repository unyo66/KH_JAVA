package pt3.testAPI;

public class Test5String {

	public static void main(String[] args) {
		show(new String("스트링입니다"));
		show(new StringBuilder("빌더입니다"));
		show(new StringBuffer("버퍼입니다"));
	}
	
	static void show(Object o)
	{
		System.out.println(o);
	}

}
