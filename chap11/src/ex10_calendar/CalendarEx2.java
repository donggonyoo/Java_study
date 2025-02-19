package ex10_calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2025,(2-1), 28);
		//날짜, 설정 


		


		System.out.printf("날짜 : %4d-%02d-%02d",cal.get(Calendar.YEAR),
				(cal.get(Calendar.MONTH)+1),cal.get(Calendar.DATE));
		System.out.println();

		LocalDate date = LocalDate.of(2025, 02, 28);
		System.out.println("날짜(Localdate) : "+date);

		//2025 12 25 일의 날짜와 요일 출력해보자
		String week = "일월화수목금토";
		cal.set(2025,(12-1),25);

		System.out.printf("날짜 : %4d-%02d-%02d %c요일\n",cal.get(Calendar.YEAR),
				(cal.get(Calendar.MONTH)+1),cal.get(Calendar.DATE),
				week.charAt(cal.get(Calendar.DAY_OF_WEEK)-1));
		
	
	}
}

