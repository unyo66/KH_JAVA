package pt3.testAPI;

import java.text.MessageFormat;
import java.util.Calendar;

public class Test6Print {

	public static void main(String[] args) {
		
		String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
		String[] noonName = {"오전", "오후"};
		Calendar c = Calendar.getInstance();
		
		String year = Integer.toString(c.get(Calendar.YEAR));
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int day2 = c.get(Calendar.DAY_OF_YEAR);
		int w = c.get(Calendar.DAY_OF_WEEK);
		String week = weekName[w];
		int n = c.get(Calendar.AM);
		String noon = noonName[n];
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(MessageFormat.format("{0}.{1}.{2} {3} {4}:{5}:{6}", year, month, day, noon, hour, minute, second));
		System.out.println(MessageFormat.format("오늘은 {0}월의 {1}번째 날", month, day));
		System.out.println(MessageFormat.format("오늘은 {0}년의 {1}번째 날", year, day2));
	}

}
