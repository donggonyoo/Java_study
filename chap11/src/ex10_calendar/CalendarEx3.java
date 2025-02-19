package ex10_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx3 {
	public static void main(String[] args) {
		
		//Calendar < ==== Date
		Date now = new Date();
		//다음날짜로 변경
		now.setTime(now.getTime()+(1000L*60*60*24));
		System.out.println(now);
		
		Calendar cal = Calendar.getInstance();//현재날짜
		cal.setTime(now);//Date 클래스를 이용해 Calendar 객체의 날짜설정
		
		
		System.out.printf("날짜 : %4d-%02d-%02d",cal.get(Calendar.YEAR),
				(cal.get(Calendar.MONTH)+1),cal.get(Calendar.DATE));
		System.out.println();
		
		//Date <== Calendar
		Date day = new Date();
		day.setTime(cal.getTimeInMillis());
		String format = new SimpleDateFormat("yyyy년MM월dd일").format(day);
		System.out.println(format);
	
	}

}
