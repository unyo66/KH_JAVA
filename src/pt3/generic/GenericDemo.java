package pt3.generic;

public class GenericDemo {

	public static void main(String[] args) {
		Cup<Beer> b = new Cup<Beer>();
		
		b.setBeverage(new Beer());
//		b(new Coffee()); // c는 Beer타입으로 생성되었기 때문에 Beer타입만 사용할 수 있음
		Beer b1 = b.getBeverage();
		
		b1 = b.getBeverage();
		b1.effect();
		
		Cup c = new Cup();
		c.setBeverage(new Coffee());
		Coffee b2 = (Coffee) c.getBeverage(); //Raw타입(타입 없이) 객체가 생성되었으므로 타입 변환을 해야 함
		b2.effect();
		System.out.println(b2.getClass());
	}

}
