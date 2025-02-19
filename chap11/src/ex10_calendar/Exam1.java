package ex10_calendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Scanner;

/*
 * 년도와 월 입력받아 년월의 마지막일자와 요일 출력
 * Calendar 객체이용하기
 */
public class Exam1 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner scan = new Scanner(System.in);
		System.out.print("년 월  입력 : ");
		int y = scan.nextInt();
		int m = scan.nextInt();
		
		c.set(y,(m-1),01);// day 를 0 으로하면 마지막일자임
		int lastday = c.getActualMaximum(Calendar.DATE);
		c.set(y,(m-1),lastday);//이건 c.set(y,m,0);과 같음
		
		String week = "일월화수목금토";
		
		System.out.printf("%4d년-%02d월-%02d일-%s요일",c.get(Calendar.YEAR),
				(c.get(Calendar.MONTH)+1),
				c.get(Calendar.DATE),
				week.charAt(c.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println();
		
		
		//Localdate와 DayofWeek 사용
		LocalDate ld = LocalDate.of(2025, 2,1);
		DayOfWeek wk = ld.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
		LocalDate with = ld.with(TemporalAdjusters.lastDayOfMonth());
		System.out.print(with+",");
		System.out.println(wk);
		
		
	}

}
