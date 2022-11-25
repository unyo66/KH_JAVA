package pt3.edu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class SimpleDate {

	public static void main(String[] args) {
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(d));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a z");
		System.out.println(sdf1.format(d));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		
		String y1 = "2025";
		String m1 = "02";
		String d1 = "28";
		try {
			d = sdf2.parse(y1 + "-" + m1 + "-" + d1);
		} catch (ParseException e) {}
		
		
		System.out.println(sdf1.format(d));
		Calendar calendar = Calendar.getInstance();
		

		SimpleDateFormat sdf3 = new SimpleDateFormat("E yyy.MM.dd", Locale.US);
				System.out.println(sdf3.format(calendar.getTime()));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("E yyy.MM.dd", Locale.KOREA);
		System.out.println(sdf4.format(calendar.getTime()));
	}

}
