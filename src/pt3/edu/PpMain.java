package pt3.edu;

public class PpMain {

	public static void main(String[] args) {
		PpManager stm = new PpManager();
		
		stm.propertyInsert(new PpStudent("1", "홍길동", 80));
		stm.propertyInsert(new PpStudent("2", "이순신", 99));
		stm.toString();
	}

}
