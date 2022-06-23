package pt3.generic;

public class Cup<T> {
	private T beverage;
	
	public T getBeverage()
	{
		return beverage;
	}
	
	public void setBeverage(T beverage)
	{
		this.beverage = beverage;
	}
}
//특정 타입으로 객체를 생성하고 그 타입의 반환을 받는 메소드와 그 타입을 매개변수로 받는 메소드 생성