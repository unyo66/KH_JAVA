package pt3.generic;

public class EntryDemo {

	public static void main(String[] args) {
		Entry<String, Integer> e1 = new Entry<>("김선달", 20);
		Entry<String, String> e2 = new Entry<>("기타", "등등");
		
		System.out.println(e1.getKey() + " " + e1.getValue());
		System.out.println(e2.getKey() + " " + e2.getValue());
		
		Entry e3 = new Entry();//Raw타입으로 객체 생성
		e3.setKey("key");
		e3.setValue("value");
		System.out.println(e3.getKey() + " " + e3.getValue());
		
	}

}
