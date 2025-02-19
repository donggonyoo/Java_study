package ex9_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

//년도와 월 입력받아 월의 마지막일자와 마지막일의 요일 출력

public class Exam1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도, 월 입력 : ");
		int year = scan.nextInt();
		int month = scan.nextInt();
		
		String day = year+"-"+(month+1)+"-01";//담달 1일
		
	
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd E요일");
		
//		LocalDate dt  = LocalDate.now();
//		LocalDate minusMonths = dt.minusMonths(1);
//		System.out.println(minusMonths);
		
		Date date = null;
		
		try {
			date = sf.parse(day);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(date);
		date.setTime(date.getTime() - (1000*60*60*24));
		System.out.println(sf2.format(date));
	
		
	
		
		
		
		
	}

}
