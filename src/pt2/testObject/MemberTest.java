package pt2.testObject;

public class MemberTest {

	public static void main(String[] args) {
		Member m1 = new Member("이고훈", "unyo6", "789456@@", 30);
		
		System.out.println(m1.getAge());
		System.out.println(m1.getName());
		System.out.println(m1.getId());
		System.out.println(m1.getPw());
	}

}
