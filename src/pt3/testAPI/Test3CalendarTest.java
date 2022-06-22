package pt3.testAPI;
import java.util.Calendar;

public class Test3CalendarTest {

	public static void main(String[] args) {
		String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
		String[] noonName = {"오전", "오후"};
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int w = c.get(Calendar.DAY_OF_WEEK);
		String week = weekName[w];
		int n = c.get(Calendar.AM);
		String noon = noonName[n];
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.println(week + "요일 " + noon);
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
	}

}
