package pt3.challAPI;
import java.text.*;
import java.util.*;

public class CarTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Car myCar = new Car("그랜저");
		myCar.setDriver("홍길동");
		Car yourCar = new Car("그랜저");
		yourCar.setDriver("노진구");
		
		
		String t = MessageFormat.format("자동차의 모델이 둘 다 [{0}]으로 동일하다.", myCar.getModel());
		String f = MessageFormat.format("myCar의 모델은 [{0}], yourCar의 모델은 [{1}]으로 서로 다르다.", myCar.getModel(), yourCar.getModel());
		
		if (myCar.equals(yourCar))
		{
			System.out.println(t);
		}
		else
		{
			System.out.println(f);
		}
		
		
		String year = Integer.toString(c.get(Calendar.YEAR));
		
		String myCarInfo = MessageFormat.format("날짜: {0}-{1}-{2}, 자동차 모델=[{3}], 운전자({4})", c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.MONTH) + 1, year, myCar.getModel(), myCar.getDriver());
	
		System.out.println(myCarInfo);
		StringTokenizer stmyCar = new StringTokenizer(myCarInfo, ", =[]()");

		while (stmyCar.hasMoreTokens()) 
		{
			System.out.println(stmyCar.nextToken());
		}
		
		System.out.println(); //구분자 밑은 다른 방법
		
		Date d = new Date();
		SimpleDateFormat date = new SimpleDateFormat("MM-dd-yyyy");
		
		String yourCarInfo = MessageFormat.format("날짜: {0}, 자동차 모델=[{1}], 운전자({2})", date.format(d), yourCar.getModel(), yourCar.getDriver());
		System.out.println(yourCarInfo);
		StringTokenizer styourCar = new StringTokenizer(yourCarInfo, ", =[]()");
		
		while (styourCar.hasMoreTokens())
		{
			System.out.println(styourCar.nextToken());
		}
	}

}
