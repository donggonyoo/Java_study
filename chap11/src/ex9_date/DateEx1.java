package ex9_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date 클래스
 * SimpleDateFormat : 형식화클래스 java.text 패키지의 클래스
 * 			String format(Date) : Date 객체를 지정한 형식대로 문자열로 변경해 리턴
 * 			Date parse(String) : 형식화된 문자열로 이루어진 날짜형태의 문자열을 Date 객체로 변경
 * 					 			ParseException 예외처리 해야함
 * 날짜 format에 사용되는 문자
 * yyyy 년도
 * MM 월
 * dd 일
 * HH 시간
 * mm 분
 * ss 초
 * E 요일
 * a 오전.오후
 */
public class DateEx1 {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초 E a");
		System.out.println(sf.format(date));
		
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String formatDate = "2025-12-25 10:00:30";
		Date day = null;
		try {
			day = sf2.parse(formatDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(day);
		
		
		SimpleDateFormat sf3 = new SimpleDateFormat("yyyy-MM-dd E요일");
		System.out.println(sf3.format(day));
		//day날짜를 2025-12-25 목요일 형식으로출력
		
	}

}
